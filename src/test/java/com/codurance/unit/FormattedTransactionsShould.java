package com.codurance.unit;

import com.codurance.FormattedTransactions;
import com.codurance.TransactionFormatter;
import org.junit.Test;

import static org.mockito.Mockito.mock;

/**
 * Created by tobyretallick on 22/09/2014.
 */
public class FormattedTransactionsShould {

    private FormattedTransactions formattedTransactions;
    private TransactionFormatter formattedTransaction;

    @Test public void
    add_formatted_transaction_to_collection() {
        formattedTransactions = new FormattedTransactions();
        formattedTransaction = mock(TransactionFormatter.class);
        formattedTransactions.addNewFormattedTransaction(formattedTransaction);

//        assertThat(formattedTransactions.retrieveAll().size(), is(1));

    }
}
