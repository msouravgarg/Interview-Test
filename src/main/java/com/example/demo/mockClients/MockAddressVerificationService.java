package com.example.demo.mockClients;

public class MockAddressVerificationService {

    public String verify(String requestJson) {

        return """
                {
                  "verificationType": "ID_DOCUMENT",
                  "status": "PASS",
                  "confidence": 95,
                  "reasons": [],
                  "timestamp": "2026-03-25T10:15:30Z"
                }
                                """;
    }
}