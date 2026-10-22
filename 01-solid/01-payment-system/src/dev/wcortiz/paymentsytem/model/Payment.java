package dev.wcortiz.paymentsytem.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

/**
 * Represents a payment in the payment system.
 * 
 * @author WCortiz
 */
public final class Payment {
    private UUID identifier;
    private BigDecimal amount;
    private LocalDate date;
    private PaymentStatus status;

    /**
     * Creates a new payment instance.
     * 
     * @param identifier unique identifier of the payment
     * @param amount payment amount
     * @param date date when the payment was created
     * @param status current status of the payment
     * 
     * @throws NullPointerException if {@code identifier} is {@code null}, or
     *                              if {@code amount} is {@code null}, or
     *                              if {@code date} is {@code null}, or
     *                              if {@code status} is {@code null}
     */
    public Payment(UUID identifier, BigDecimal amount, LocalDate date, PaymentStatus status) {
        if (identifier == null) {
            throw new NullPointerException("identifier cannot be null");
        }
        if (amount == null) {
            throw new NullPointerException("amount cannot be null");
        }
        if (date == null) {
            throw new NullPointerException("date cannot be null");
        }
        if (status == null) {
            throw new NullPointerException("status cannot be null");
        }
        
        this.identifier = identifier;
        this.amount = amount;
        this.date = date;
        this.status = status;
    }

    /**
     * Marks this payment as completed.
     * 
     * <p>Only a payment in {@link PaymentStatus#PENDING} state can be completed.</p>
     * 
     * <p>After this method returns successfully, the payment's status is
     * {@link PaymentStatus#COMPLETED}.</p>
     * 
     * @throws IllegalStateException if the payment is not pending, that is,
     *                               if it has already been completed, cancelled,
     *                               or is in any other state besides {@code PENDING}
     */
    public void complete() {
        if(!isPending()) {
            throw new IllegalStateException("Only pending payments can be completed.");
        }

        status = PaymentStatus.COMPLETED;
    }

    /**
     * Returns whether this payment is pending.
     * 
     * @return {@code true} if the payment status is {@link PaymentStatus#PENDING}
     */
    public boolean isPending() { 
        return status == PaymentStatus.PENDING; 
    }

    /**
     * Returns wheter this payment is completed.
     * 
     * @return {@code true} if the payment status is {@link PaymentStatus#COMPLETED}
     */
    public boolean isCompleted() {
        return status == PaymentStatus.COMPLETED;
    }

    public UUID getIdentifier() { return identifier; }
    public BigDecimal getAmount() { return amount; }
    public LocalDate getDate() { return date; }
    public PaymentStatus getStatus() { return status; }
}