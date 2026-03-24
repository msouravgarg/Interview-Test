package com.example.demo.mockClients;

import java.util.Collection;

import com.example.demo.service.VerificationResult;

public class MockDocumentVerificationService {

    public String verify(String requestJson) { 

        return """
        {
          "status": "PASS",
          "confidence": 95,
          "reasons": []
        }
        """;
    }
}