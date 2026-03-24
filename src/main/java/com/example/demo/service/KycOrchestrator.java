package com.example.demo.service;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.mockClients.MockAddressVerificationService;
import com.example.demo.mockClients.MockBiometricService;
import com.example.demo.mockClients.MockDocumentVerificationService;
import com.example.demo.mockClients.MockSanctionsScreeningService;

public class KycOrchestrator {

    private final MockDocumentVerificationService documentService = new MockDocumentVerificationService();

    private final MockBiometricService biometricService = new MockBiometricService();

    private final MockAddressVerificationService addressService = new MockAddressVerificationService();

    private final MockSanctionsScreeningService sanctionsService = new MockSanctionsScreeningService();

    private final DecisionEngine decisionEngine = new DecisionEngine();

    public KycDecisionResult performKyc(Customer customer, List<VerificationType> types) {

        List<VerificationResult> results = new ArrayList<>();

        String requestJson = buildRequestJson(customer);

        for (VerificationType type : types) {

            switch (type) {
            
            case ID_DOCUMENT:
                String responseJson = documentService.verify(requestJson);
                VerificationResult response = JsonUtil.fromJson(responseJson, VerificationResult.class);

                results.add(response);
                break;

            case FACE_MATCH:
                String responseJson1 = biometricService.verify(requestJson);
                VerificationResult response1 = JsonUtil.fromJson(responseJson1, VerificationResult.class);

                results.add(response1);
                break;

            case ADDRESS:
                String responseJson2 = addressService.verify(requestJson);
                VerificationResult response2 = JsonUtil.fromJson(responseJson2, VerificationResult.class);

                results.add(response2);
                break;

            case SANCTIONS:
                String responseJson3 = sanctionsService.verify(requestJson);
                VerificationResult response3 = JsonUtil.fromJson(responseJson3, VerificationResult.class);

                results.add(response3);
                break;
            }


        }

        KYCDecision decision = decisionEngine.decide(results);

        return new KycDecisionResult(decision, results, Instant.now());
    }

    private String buildRequestJson(Customer customer) {

        return """
                {
                  "customer_id": "%s",
                  "full_name": "%s"
                }
                """.formatted(customer.getCustomerId(), customer.getFullName());
    }
}