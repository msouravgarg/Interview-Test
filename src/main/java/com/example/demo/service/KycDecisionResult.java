package com.example.demo.service;
import java.time.Instant;
import java.util.List;

public class KycDecisionResult {

    private KYCDecision decision;
    private List<VerificationResult> verificationResults;
    private Instant timestamp;

    public KycDecisionResult(KYCDecision decision,
                             List<VerificationResult> verificationResults,
                             Instant timestamp) {
        this.decision = decision;
        this.verificationResults = verificationResults;
        this.timestamp = timestamp;
    }

    public KYCDecision getDecision() {
        return decision;
    }

    public void setDecision(KYCDecision decision) {
        this.decision = decision;
    }

    public List<VerificationResult> getVerificationResults() {
        return verificationResults;
    }

    public void setVerificationResults(List<VerificationResult> verificationResults) {
        this.verificationResults = verificationResults;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }

    // getters
}