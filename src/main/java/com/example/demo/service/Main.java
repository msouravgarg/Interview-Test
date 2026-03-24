package com.example.demo.service;
import java.time.LocalDate;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer(
                "CUST-001",
                "Jane Doe",
                LocalDate.of(1990,5,15),
                "jane@test.com",
                "+1-555",
                "US Address"
        );

        KycOrchestrator orchestrator = new KycOrchestrator();

        KycDecisionResult result =
                orchestrator.performKyc(
                        customer,
                        List.of(
                                VerificationType.ID_DOCUMENT,
                                VerificationType.FACE_MATCH,
                                VerificationType.ADDRESS,
                                VerificationType.SANCTIONS
                        )
                );

        System.out.println(result.getDecision());
    }
}