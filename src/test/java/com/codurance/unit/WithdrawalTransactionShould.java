package com.codurance.unit;

import com.codurance.*;
import org.junit.Test;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by tobyretallick on 24/09/2014.
 */
public class WithdrawalTransactionShould {
    private static final Money £10 = new Money(10);
    private static final TransactionDate DATE = new TransactionDate();
    private Transaction withdrawalTransaction;
    private StatementPrinter statementPrinter;

    @Test
    public void
    pass_transaction_information_to_statementPrinter() {
        withdrawalTransaction = new WithdrawalTransaction(£10, DATE);
        statementPrinter = mock(StatementPrinter.class);
        withdrawalTransaction.print(statementPrinter);
        verify(statementPrinter).printStatement(any(), any());
    }
}
