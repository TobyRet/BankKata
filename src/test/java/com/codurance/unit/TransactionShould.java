package com.codurance.unit;

import com.codurance.Money;
import com.codurance.Transaction;
import com.codurance.TransactionDate;
import com.codurance.TransactionType;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by tobyretallick on 23/09/2014.
 */
public class TransactionShould {

    private static final TransactionType DEPOSIT_TRANSACTION = TransactionType.DEPOSIT;
    private Transaction transaction;
    private Money money;
    private TransactionDate transactionDate;

    @Test public void
    print_contents_of_transaction() {
        money = mock(Money.class);
        transactionDate = mock(TransactionDate.class);
        transaction = new Transaction(money, transactionDate, DEPOSIT_TRANSACTION);
        transaction.print();
        verify(money).printAmount();
        verify(transactionDate).printDate();
    }
}
