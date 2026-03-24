package com.example.demo.service;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class SimpleHttpClient {

    private final HttpClient client;

    public SimpleHttpClient() {
        this.client = HttpClient.newBuilder()
                .connectTimeout(Duration.ofSeconds(5))
                .build();
    }

    public String post(String url, String jsonBody) {

        try {

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .timeout(Duration.ofSeconds(5))
                    .header("Content-Type", "application/json")
                    .POST(HttpRequest.BodyPublishers.ofString(jsonBody))
                    .build();

            HttpResponse<String> response =
                    client.send(request, HttpResponse.BodyHandlers.ofString());

            int statusCode = response.statusCode();

            if (statusCode >= 200 && statusCode < 300) {
                return response.body();
            }

            throw new RuntimeException("HTTP Error: " + statusCode);

        } catch (java.net.http.HttpTimeoutException e) {
            throw new RuntimeException("Request timed out");

        } catch (Exception e) {
            throw new RuntimeException("HTTP call failed: " + e.getMessage());
        }
    }
}