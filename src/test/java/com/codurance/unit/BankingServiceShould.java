package com.codurance.unit;

import com.codurance.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static java.time.LocalDate.now;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class BankingServiceShould {

    private static final Money DEPOSIT_£20 = new Money(20);
    private static final TransactionDate TRANSACTION_DATE = new TransactionDate(now());
    private static final Money WITHDRAW_£10 = new Money(10);
    private static final Money TRANSFER_£10 = new Money(10);
    private BankService bankService;
    @Mock StatementPrinter statementPrinter;
    @Mock TransactionsRepository transactionsRepository;

    @Before
    public void initialise() {
        bankService = new BankService(transactionsRepository, statementPrinter);
    }

    @Test public void
    should_deposit_funds() {
        bankService.deposit(DEPOSIT_£20, TRANSACTION_DATE);
        verify(transactionsRepository).store(any(DepositTransaction.class));
    }

    @Test public void
    should_withdraw_funds() {
        bankService.withdraw(WITHDRAW_£10, TRANSACTION_DATE);
        verify(transactionsRepository).store(any(WithdrawalTransaction.class));
    }
    
    @Test public void
    should_transfer_funds() {
        bankService.transfer(TRANSFER_£10, TRANSACTION_DATE);
        verify(transactionsRepository).store(any(TransferTransaction.class));
    }

    @Test public void
    should_print_statement_to_console() {
        bankService.printStatement();
        verify(transactionsRepository).printTransactions(statementPrinter);
    }
}
