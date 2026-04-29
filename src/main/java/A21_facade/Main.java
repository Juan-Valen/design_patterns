package A21_facade;

public class Main {

    public static void main(String[] args) {

        HttpClientFacade client = new HttpClientFacade();

        // Example URL returning JSON
        String url = "https://api.chucknorris.io/jokes/random"; // This returns JSON like {"current_user_url": "...", ...}
        String attribute = "value";

        try {
            String value = client.getAttributeValueFromJson(url, attribute);
            System.out.println("Value for '" + attribute + "': " + value);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid URL or API error");
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }
        url = "https://api.fxratesapi.com/latest"; // This returns JSON like {"current_user_url": "...", ...}
        attribute = "terms";

        try {
            String value = client.getAttributeValueFromJson(url, attribute);
            System.out.println("Value for '" + attribute + "': " + value);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid URL or API error");
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }
    }
}
