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
public class WithdrawalTransactionShould {
    private static final Money £10 = new Money(10);
    private static final TransactionDate DATE = new TransactionDate(now());
    private Transaction withdrawalTransaction;
    @Mock Money mockedAmount;
    @Mock StatementPrinter statementPrinter;

    @Test
    public void
    pass_transaction_information_to_statementPrinter() {
        withdrawalTransaction = new WithdrawalTransaction(£10, DATE);
        withdrawalTransaction.print(statementPrinter);
        verify(statementPrinter).printStatementLine(any(), any());
    }

    @Test public void
    should_negate_money_amount() {
        withdrawalTransaction = new WithdrawalTransaction(mockedAmount, DATE);
        verify(mockedAmount).isWithdrawal();
    }
}
