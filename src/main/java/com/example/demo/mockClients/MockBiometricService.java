package com.example.demo.mockClients;

public class MockBiometricService {

    public String verify(String requestJson) {

        return """
        {
          "status": "PASS",
          "confidence": 92,
          "similarity_score": 92.5
        }
        """;
    }
}