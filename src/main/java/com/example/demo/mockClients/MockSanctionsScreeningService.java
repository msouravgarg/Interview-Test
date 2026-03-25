package com.example.demo.mockClients;

public class MockSanctionsScreeningService {

    public String verify(String requestJson) {

        return """
                {
                  "verificationType": "SANCTIONS",
                  "status": "PASS",
                  "confidence": 100,
                  "reasons": [],
                  "timestamp": "2026-03-25T10:15:30Z"
                }
                        """;
    }
}