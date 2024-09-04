package com.example.multi_product_transaction_manager.transactions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {

    private final TransactionService transactionService;

    @Autowired
    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @PostMapping("/credit")
    public ResponseEntity<ProductResponse<CreditProductRequest>> processCreditTransaction(@RequestBody TransactionPayloadRequest<CreditProductRequest> payload) {
        ProductResponse<CreditProductRequest> response = transactionService.processTransaction(payload);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping("/loan")
    public ResponseEntity<ProductResponse<LoanProductRequest>> processLoanTransaction(@RequestBody TransactionPayloadRequest<LoanProductRequest> payload) {
        ProductResponse<LoanProductRequest> response = transactionService.processTransaction(payload);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping("/insurance")
    public ResponseEntity<ProductResponse<InsuranceProductRequest>> processInsuranceTransaction(@RequestBody TransactionPayloadRequest<InsuranceProductRequest> payload) {
        ProductResponse<InsuranceProductRequest> response = transactionService.processTransaction(payload);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
