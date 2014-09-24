package com.codurance.unit;

import com.codurance.TransactionDate;
import org.junit.Test;

import static java.time.LocalDate.of;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TransactionDateShould {

    @Test public void
    display_itself_as_dd_MM_yyyy() {
        TransactionDate transactionDate = new TransactionDate(of(2014, 9, 24));

        assertThat(transactionDate.toString(), is("24/09/2014"));
    }
}
