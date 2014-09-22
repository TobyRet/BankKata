package com.codurance;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class TransactionShould {

    private static final int DEPOSIT_£30 = 30;
    private Transaction transaction;
    private StatementPrinter statementPrinter = mock(StatementPrinter.class);

    @Test public void
    send_transaction_information_to_Statement_Printer() {
        transaction = new Transaction(DEPOSIT_£30);
        transaction.printTo(statementPrinter);
        verify(statementPrinter).printTransaction(any(), eq(DEPOSIT_£30));
    }
}
