package com.example.demo.mockClients;

public class MockAddressVerificationService {

    public String verify(String requestJson) {

        return """
        {
          "status": "PASS",
          "confidence": 88,
          "reasons": []
        }
        """;
    }
}