package com.codurance.unit;

import com.codurance.StatementPrinter;
import com.codurance.Transaction;
import com.codurance.TransactionsRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class TransactionsRepositoryShould {

    private TransactionsRepository transactionsRepository;
    @Mock StatementPrinter statementPrinter;
    @Mock Transaction withdrawalTransaction;
    @Mock Transaction depositTransaction;

    @Test
    public void
    print_transactions() {
        transactionsRepository = new TransactionsRepository();

        transactionsRepository.store(depositTransaction);
        transactionsRepository.store(withdrawalTransaction);

        transactionsRepository.printTransactions(statementPrinter);
        verify(statementPrinter).printColumnHeaders();
        verify(depositTransaction).print(statementPrinter);
        verify(withdrawalTransaction).print(statementPrinter);
    }
}
