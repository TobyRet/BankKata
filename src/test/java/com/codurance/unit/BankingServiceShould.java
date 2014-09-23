package com.codurance.unit;

import com.codurance.*;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by tobyretallick on 23/09/2014.
 */
public class BankingServiceShould {

    private static final Money DEPOSIT_£20 = new Money(20);
    private static final String TRANSACTION_DATE = new TransactionDate().create();
    private static final Money WITHDRAW_£10 = new Money(10);
    private BankService bankService;
    private TransactionRepository transactionRepository;
    private ConsoleDisplay consoleDisplay;

    @Before
    public void initialise() {
        transactionRepository = mock(TransactionRepository.class);
        bankService = new BankService(transactionRepository);
    }

    @Test public void
    should_deposit_funds() {
        bankService.deposit(DEPOSIT_£20, TRANSACTION_DATE);
        verify(transactionRepository).store(DEPOSIT_£20, TRANSACTION_DATE);
    }

    @Test public void
    should_withdraw_funds() {
        bankService.withdraw(WITHDRAW_£10, TRANSACTION_DATE);
        verify(transactionRepository).store(WITHDRAW_£10, TRANSACTION_DATE);
    }

    @Test public void
    should_print_statement_to_console() {
        consoleDisplay = mock(ConsoleDisplay.class);
        bankService.printStatement(consoleDisplay);
        verify(consoleDisplay).displayStatement();
    }
}
