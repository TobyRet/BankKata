package com.codurance.unit;

import com.codurance.*;
import org.junit.Test;

import static java.time.LocalDate.now;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by tobyretallick on 24/09/2014.
 */
public class DepositTransactionShould {

    private static final Money £10 = new Money(10);
    private static final TransactionDate DATE = new TransactionDate(now());
    private Transaction depositTransaction;
    private StatementPrinter statementPrinter;


    @Test public void
    pass_transaction_information_to_statementPrinter() {
        depositTransaction = new DepositTransaction(£10, DATE);
        statementPrinter = mock(StatementPrinter.class);
        depositTransaction.print(statementPrinter);
        verify(statementPrinter).printStatementLine(any(), any());
    }

}
