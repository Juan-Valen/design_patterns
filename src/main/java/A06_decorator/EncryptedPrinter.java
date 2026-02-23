package A06_decorator;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

class EncryptedPrinter implements Printer {
    private static final String KEY = "1234567890123456";
    private Printer printer;

    public EncryptedPrinter(Printer printer) {
        this.printer = printer;
    }

    public static String encrypt(String plainText) throws Exception {
        SecretKeySpec keySpec = new SecretKeySpec(KEY.getBytes(), "AES");
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, keySpec);
        byte[] encrypted = cipher.doFinal(plainText.getBytes());
        return Base64.getEncoder().encodeToString(encrypted);
    }

    @Override
    public void print(String text) {
        try {
            String encrypted = encrypt(text);
            printer.print(encrypted);
        } catch (Exception e) {
        }
    }
}
