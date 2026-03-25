package com.example.demo.mockClients;

public class MockBiometricService {

    public String verify(String requestJson) {

        return """
                {
                  "verificationType": "FACE_MATCH",
                  "status": "PASS",
                  "confidence": 92,
                  "reasons": [],
                  "timestamp": "2026-03-25T10:15:30Z"
                }
                        """;
    }
}