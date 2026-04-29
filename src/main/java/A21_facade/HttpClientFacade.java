package A21_facade;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class HttpClientFacade {

    // Simplified regex supporting http, https, ftp, ftps
    private static final String URL_REGEX = "^(https?|http):\\/\\/([a-zA-Z0-9-]+\\.)+[a-zA-Z0-9-]+(:[0-9]+)?(\\/[^\\s]*)?$";
    private static final Pattern URL_PATTERN = Pattern.compile(URL_REGEX);

    String getAttributeValueFromJson(String urlString, String attributeName)
            throws IllegalArgumentException, IOException {

        String value = "";
        String json = "";
        if (!isValidURL(urlString)) {
            throw new IllegalArgumentException();
        }
        try {
            json = getJsonFromApi(urlString);
        } catch (Exception e) {
            throw new IllegalArgumentException();
        }
        if (json.charAt(0) != '{') {
            throw new IOException();
        }
        try {
            value = extractValueFromJson(json, attributeName);
        } catch (Exception e) {
            throw new IOException();
        }

        return value;
    }

    public static boolean isValidURL(String urlString) {
        if (urlString == null || urlString.isEmpty()) {
            return false;
        }
        Matcher matcher = URL_PATTERN.matcher(urlString);
        return matcher.matches();
    }

    private String getJsonFromApi(String apiUrl) throws Exception {
        URL url = new URL(apiUrl);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");

        try (BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()))) {
            String inputLine;
            StringBuilder content = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            return content.toString();
        } finally {
            con.disconnect();
        }
    }

    private String extractValueFromJson(String json, String value) throws Exception {
        JSONParser parser = new JSONParser();
        JSONObject jsonObject = (JSONObject) parser.parse(json);
        return jsonObject.get(value).toString();
    }

}
