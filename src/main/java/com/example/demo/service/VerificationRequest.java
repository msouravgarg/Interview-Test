package com.example.demo.service;
import java.time.Instant;
import java.util.List;

public class VerificationRequest {

    private String requestId;
    private String customerId;
    private List<VerificationType> verificationTypes;
    private Instant timestamp;

    public VerificationRequest(String requestId,
                               String customerId,
                               List<VerificationType> verificationTypes,
                               Instant timestamp) {
        this.requestId = requestId;
        this.customerId = customerId;
        this.verificationTypes = verificationTypes;
        this.timestamp = timestamp;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public List<VerificationType> getVerificationTypes() {
        return verificationTypes;
    }

    public void setVerificationTypes(List<VerificationType> verificationTypes) {
        this.verificationTypes = verificationTypes;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }

    // getters
}