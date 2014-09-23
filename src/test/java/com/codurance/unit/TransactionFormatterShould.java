package com.codurance.unit;

import com.codurance.TransactionFormatter;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by tobyretallick on 22/09/2014.
 */
public class TransactionFormatterShould {

    private static final String DATE = "12/05/14";
    private static final String AMOUNT = "30";
    private static final String BALANCE = "30";
    private static final String LINEBREAK = "\n";
    private TransactionFormatter transactionFormatter;

    @Before
    public void initialise() {
        transactionFormatter = new TransactionFormatter();
    }

    @Test public void
    add_transaction_information() {
        transactionFormatter.addDate(DATE);
        assertThat(transactionFormatter.retrieveFormattedTransaction().get(0), is(DATE));

        transactionFormatter.addAmount(AMOUNT);
        assertThat(transactionFormatter.retrieveFormattedTransaction().get(1), is(AMOUNT));

        transactionFormatter.addBalance(BALANCE);
        assertThat(transactionFormatter.retrieveFormattedTransaction().get(2), is(AMOUNT));

        transactionFormatter.addLineBreak();
        assertThat(transactionFormatter.retrieveFormattedTransaction().get(3), is(LINEBREAK));
    }
}
