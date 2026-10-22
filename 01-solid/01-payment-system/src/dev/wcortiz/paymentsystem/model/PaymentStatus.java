package dev.wcortiz.paymentsystem.model;

/**
 * Represents the possible states that a payment can have during its lifecycle.
 * 
 * @author WCortiz
 */
public enum PaymentStatus {
    /**
     * The payment has been created but has not been processed yet.
     */
    PENDING,

    /**
     * The payment has been successfully processed.
     */
    COMPLETED
}
