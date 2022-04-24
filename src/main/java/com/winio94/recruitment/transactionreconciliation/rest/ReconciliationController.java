package com.winio94.recruitment.transactionreconciliation.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transaction-reconciliation")
@Validated
public class ReconciliationController {

    @PostMapping
    public ResponseEntity<?> perform() {
        return ResponseEntity.noContent()
                             .build();
    }
}
