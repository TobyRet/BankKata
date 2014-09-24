package com.codurance.unit;

import com.codurance.*;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by tobyretallick on 23/09/2014.
 */
public class TransactionsRepositoryShould {

    private TransactionsRepository transactionsRepository;
    private Transaction depositTransaction;
    private Transaction withdrawalTransaction;
    private StatementPrinter statementPrinter;

    @Test
    public void
    print_transactions() {
        transactionsRepository = new TransactionsRepository();
        depositTransaction = mock(DepositTransaction.class);
        withdrawalTransaction = mock(WithdrawalTransaction.class);
        statementPrinter = mock(StatementPrinter.class);

        transactionsRepository.store(depositTransaction);
        transactionsRepository.store(withdrawalTransaction);

        transactionsRepository.printTransactions(statementPrinter);
        verify(statementPrinter).printColumnHeaders();
        verify(depositTransaction).print(statementPrinter);
        verify(withdrawalTransaction).print(statementPrinter);
    }
}
