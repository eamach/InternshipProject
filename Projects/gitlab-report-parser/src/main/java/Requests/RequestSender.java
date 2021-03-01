package Requests;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class RequestSender {
    private final HttpClient httpClient;
    private final RequestURLCreator ruc;

    public RequestSender() {
        httpClient = HttpClient.newBuilder().version(HttpClient.Version.HTTP_2).build();
        ruc = new RequestURLCreator();
    }

    /**
     * send a get request
     **/
    public String sendGet(String url) {
        if (url != null) {
            String token = System.getenv("CI_BOT_TOKEN");
            if (token == null) {
                token = "";
            }
            HttpRequest request = HttpRequest.newBuilder().GET()
                    .uri(URI.create(url))
                    .setHeader("PRIVATE-TOKEN", token)
                    .build();
            HttpResponse<String> response = sendRequest(request);
            System.out.println("GET Status code: " + response.statusCode());
            System.out.println("GET Response body: " + response.body());
            return response.body();
        }
        return null;
    }

    /**
     * send a post request
     **/

    public String sendPost(String url, String content) {
        if (url != null && content != null) {
            String token = System.getenv("CI_BOT_TOKEN");
            if (token == null) {
                token = "";
            }
            HttpRequest request = HttpRequest.newBuilder()
                    .POST(HttpRequest.BodyPublishers.ofString(content))
                    .uri(URI.create(url))
                    .setHeader("PRIVATE-TOKEN", token)
                    .header("Content-Type", "application/x-www-form-urlencoded")
                    .build();
            HttpResponse<String> response = sendRequest(request);
            System.out.println("POST Status code: " + response.statusCode());
            System.out.println("POST Response body: " + response.body());
            return response.body();
        }
        return null;
    }

    /**
     * send THE request
     **/
    public HttpResponse<String> sendRequest(HttpRequest request) {
        try {
            return httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
