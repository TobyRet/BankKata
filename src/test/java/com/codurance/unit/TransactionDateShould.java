package com.codurance.unit;

import com.codurance.TransactionDate;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by tobyretallick on 23/09/2014.
 */
public class TransactionDateShould {

    private TransactionDate transactionDate;

    @Test public void
    create_a_new_formatted_date() {
        transactionDate = new TransactionDate();
        assertTrue(transactionDate.create().matches("[0-9]{2}-[0-9]{2}-[0-9]{4}"));
    }
}
