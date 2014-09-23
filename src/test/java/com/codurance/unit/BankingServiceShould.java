package com.codurance.unit;

import com.codurance.*;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by tobyretallick on 23/09/2014.
 */
public class BankingServiceShould {

    private static final Money DEPOSIT_£20 = new Money(20);
    private static final TransactionDate TRANSACTION_DATE = new TransactionDate();
    private static final Money WITHDRAW_£10 = new Money(10);
    private BankService bankService;
    private Transaction transaction;
    private ConsoleDisplay consoleDisplay;
    private TransactionsRepository transactionsRepository;

    @Before
    public void initialise() {
        transaction = mock(Transaction.class);
        transactionsRepository = mock(TransactionsRepository.class);
        bankService = new BankService(transactionsRepository);
    }

    @Test public void
    should_deposit_funds() {
        bankService.deposit(DEPOSIT_£20, TRANSACTION_DATE);
        verify(transactionsRepository).store(any());
    }

    @Test public void
    should_withdraw_funds() {
        bankService.withdraw(WITHDRAW_£10, TRANSACTION_DATE);
        verify(transactionsRepository).store(any());
    }

    @Test public void
    should_print_statement_to_console() {
        consoleDisplay = mock(ConsoleDisplay.class);
        bankService.printStatement(consoleDisplay);
        verify(consoleDisplay).displayStatement();
    }
}
