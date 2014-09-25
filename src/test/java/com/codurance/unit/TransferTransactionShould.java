package com.codurance.unit;

import com.codurance.Money;
import com.codurance.StatementPrinter;
import com.codurance.TransactionDate;
import com.codurance.TransferTransaction;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static java.time.LocalDate.now;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class TransferTransactionShould {

    private static final Money £10 = new Money(10);
    private static final TransactionDate DATE = new TransactionDate(now());
    private TransferTransaction transferTransaction;
    @Mock StatementPrinter statementPrinter;
    @Mock Money mockedAmount;

    @Test
    public void
    pass_transaction_information_to_statementPrinter() {
        transferTransaction = new TransferTransaction(£10, DATE);
        transferTransaction.print(statementPrinter);
        verify(statementPrinter).printStatementLine(any(), any());
    }

    @Test public void
    should_negate_money_amount() {
        transferTransaction = new TransferTransaction(mockedAmount, DATE);
        verify(mockedAmount).isTransfer();
    }
}
