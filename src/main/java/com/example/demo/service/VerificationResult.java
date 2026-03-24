package com.example.demo.service;
import java.time.Instant;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class VerificationResult {

    private VerificationType verificationType;
    private VerificationStatus status;
    private int confidence;
    private List<String> reasons;
    private Instant timestamp;

    public VerificationResult(VerificationType verificationType,
                              VerificationStatus status,
                              int confidence,
                              List<String> reasons,
                              Instant timestamp) {
        this.verificationType = verificationType;
        this.status = status;
        this.confidence = confidence;
        this.reasons = reasons;
        this.timestamp = timestamp;
    }

    public VerificationType getVerificationType() {
        return verificationType;
    }

    public void setVerificationType(VerificationType verificationType) {
        this.verificationType = verificationType;
    }

    public VerificationStatus getStatus() {
        return status;
    }

    public void setStatus(VerificationStatus status) {
        this.status = status;
    }

    public int getConfidence() {
        return confidence;
    }

    public void setConfidence(int confidence) {
        this.confidence = confidence;
    }

    public List<String> getReasons() {
        return reasons;
    }

    public void setReasons(List<String> reasons) {
        this.reasons = reasons;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }

}