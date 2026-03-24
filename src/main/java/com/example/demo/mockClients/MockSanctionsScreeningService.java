package com.example.demo.mockClients;

public class MockSanctionsScreeningService {

    public String verify(String requestJson) {

        return """
        {
          "status": "CLEAR",
          "match_count": 0,
          "matches": []
        }
        """;
    }
}