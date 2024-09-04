package com.example.multi_product_transaction_manager.transactions;

public class ProductResponse<T extends ProductRequest> {
    private String transactionId;
    private double transactionAmount;
    private T product;

    public ProductResponse(String transactionId, double transactionAmount, T product) {
        this.transactionId = transactionId;
        this.transactionAmount = transactionAmount;
        this.product = product;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public double getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public T getProduct() {
        return product;
    }

    public void setProduct(T product) {
        this.product = product;
    }
}