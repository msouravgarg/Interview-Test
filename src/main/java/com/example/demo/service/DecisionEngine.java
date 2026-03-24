package com.example.demo.service;
import java.util.List;

public class DecisionEngine {

    public KYCDecision decide(List<VerificationResult> results) {

        boolean manualReview = false;

        for (VerificationResult r : results) {

            if (r.getVerificationType() == VerificationType.SANCTIONS
                    && r.getStatus() == VerificationStatus.FAIL) {
                return KYCDecision.REJECTED;
            }

            if (r.getStatus() == VerificationStatus.FAIL) {
                return KYCDecision.REJECTED;
            }

            if (r.getStatus() == VerificationStatus.MANUAL_REVIEW) {
                manualReview = true;
            }
        }

        if (manualReview) {
            return KYCDecision.MANUAL_REVIEW;
        }

        return KYCDecision.APPROVED;
    }
}