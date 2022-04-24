package com.winio94.recruitment.transactionreconciliation;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.Arguments;
import org.springframework.http.MediaType;

public class ReconciliationControllerTest extends AbstractControllerTest {

    @Test
    public void dummyTest() throws Exception {
        mvc.perform(post("/transaction-reconciliation").contentType(MediaType.APPLICATION_JSON))
           .andExpect(status().isNoContent());
    }

    public static Stream<Arguments> paramTest() {
        return Stream.of(Arguments.of("abc"), Arguments.of("bcd"));
    }

}


