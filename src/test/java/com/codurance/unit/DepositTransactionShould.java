package com.codurance.unit;

import com.codurance.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static java.time.LocalDate.now;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class DepositTransactionShould {

    private static final Money £10 = new Money(10);
    private static final TransactionDate DATE = new TransactionDate(now());
    private Transaction depositTransaction;
    @Mock StatementPrinter statementPrinter;


    @Test public void
    pass_transaction_information_to_statementPrinter() {
        depositTransaction = new DepositTransaction(£10, DATE);
        depositTransaction.print(statementPrinter);
        verify(statementPrinter).printStatementLine(any(), any());
    }

}
