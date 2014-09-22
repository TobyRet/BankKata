package com.codurance;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TransactionDateShould {

    private TransactionDate transactionDate;

    @Test public void
    format_a_date_object() {
        transactionDate = new TransactionDate();
        transactionDate.getFormattedDate();
        assertTrue(transactionDate.getFormattedDate().matches("[0-9]{2}/[0-9]{2}/[0-9]{2}"));
    }
}
