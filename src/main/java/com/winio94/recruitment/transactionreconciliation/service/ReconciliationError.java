package com.winio94.recruitment.transactionreconciliation.service;

import java.util.Collections;
import org.apache.commons.lang3.NotImplementedException;
import org.springframework.http.ResponseEntity;

public enum ReconciliationError {
    TEST() {
        @Override
        public ResponseEntity<Errors> toResponse() {
            return ResponseEntity.badRequest()
                                 .body(new Errors(Collections.emptyList()));
        }
    };

    public ResponseEntity<Errors> toResponse() {
        throw new NotImplementedException();
    }
}
