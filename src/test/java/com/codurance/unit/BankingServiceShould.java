package com.codurance.unit;

import com.codurance.BankService;
import com.codurance.Money;
import com.codurance.TransactionDate;
import com.codurance.TransactionRepository;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by tobyretallick on 23/09/2014.
 */
public class BankingServiceShould {

    private static final Money DEPOSIT_£20 = new Money(20);
    private static final String TRANSACTION_DATE = new TransactionDate().create();
    private BankService bankService;
    private TransactionRepository transactionRepository;

    @Test public void
    should_deposit_funds() {
        transactionRepository = mock(TransactionRepository.class);
        bankService = new BankService(transactionRepository);
        bankService.deposit(DEPOSIT_£20, TRANSACTION_DATE);
        verify(transactionRepository).store(DEPOSIT_£20, TRANSACTION_DATE);
    }
}
