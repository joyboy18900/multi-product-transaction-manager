package com.example.multi_product_transaction_manager.transactions;

public class CreditProductRequest extends ProductRequest {
    private double creditLimit;

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }
}