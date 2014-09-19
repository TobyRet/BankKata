package com.codurance;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by tobyretallick on 19/09/2014.
 */
public class TransactionShould {

    private static final int DEPOSIT_£30 = 30;
    private Transaction transaction;
    private StatementPrinter statementPrinter;

    @Test public void
    send_transaction_information_to_Statement_Printer() {
        statementPrinter = mock(StatementPrinter.class);
        transaction = new Transaction(DEPOSIT_£30);
        transaction.printTo(statementPrinter);
        verify(statementPrinter).printTransaction("19/09/14",30);
    }

}
