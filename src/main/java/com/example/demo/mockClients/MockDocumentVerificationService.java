package com.example.demo.mockClients;

import java.util.Collection;

import com.example.demo.service.VerificationResult;

public class MockDocumentVerificationService {

    public String verify(String requestJson) {

        return """
                {
                  "verificationType": "ADDRESS",
                  "status": "PASS",
                  "confidence": 88,
                  "reasons": [],
                  "timestamp": "2026-03-25T10:15:30Z"
                }
                        """;
    }
}