package com.winio94.recruitment.transactionreconciliation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(AppConfig.class)
public class TransactionReconciliationApplication {

    public static void main(String[] args) {
        SpringApplication.run(TransactionReconciliationApplication.class, args);
    }

}
