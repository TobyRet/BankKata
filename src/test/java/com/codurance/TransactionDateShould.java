package com.codurance;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TransactionDateShould {

    private TransactionDate transactionDate;

    @Test public void
    format_a_date_object() {
        transactionDate = new TransactionDate();
        transactionDate.getFormattedDate();
        assertThat(transactionDate.getFormattedDate(), is("21/09/14")); // match regular expression pattern
    }
}
