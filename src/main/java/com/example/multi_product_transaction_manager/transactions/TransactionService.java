package com.example.multi_product_transaction_manager.transactions;

import org.springframework.stereotype.Service;

@Service
public class TransactionService {

    public <T extends ProductRequest> ProductResponse<T> processTransaction(TransactionPayloadRequest<T> payload) {
        System.out.println("Processing transaction: " + payload.getTransactionId());
        System.out.println("Amount: " + payload.getTransactionAmount());
        System.out.println("Product Details: " + payload.getProduct().toString());

        return new ProductResponse<>(payload.getTransactionId(), payload.getTransactionAmount(), payload.getProduct());
    }
}