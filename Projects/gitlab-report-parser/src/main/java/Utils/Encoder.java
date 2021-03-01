package Utils;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.io.UnsupportedEncodingException;

public class Encoder {
    //straight from urlencoder.io/java/
    public static String encodeValue(String comentario) {
        try {
            return URLEncoder.encode(comentario, StandardCharsets.UTF_8.toString());
        } catch (Exception ex) {
            return null;
        }
    }
}
