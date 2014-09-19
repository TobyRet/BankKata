package com.codurance;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Created by tobyretallick on 19/09/2014.
 */

public class StatementGeneratorShould {

    private static final Transaction DEPOSIT_£30 = new Transaction(30);
    private static final Transaction WITHDRAW_£20 = new Transaction(-20);
    private static final Transaction TRANSFER_£20 = new Transaction(-10);
    private StatementPrinter statementGenerator;
    private CustomerTransactionsCollection customerTransactions;

    @Before
    public void initialise() {
        customerTransactions = new CustomerTransactionsCollection();

        customerTransactions.add(DEPOSIT_£30);
        customerTransactions.add(WITHDRAW_£20);
        customerTransactions.add(TRANSFER_£20);

        statementGenerator = new StatementPrinter();
    }

    @Test public void
    calculate_balance_for_each_transaction() {
        List<Transaction> allTransactions = customerTransactions.retrieveAll();
        statementGenerator.prepareTransactions(allTransactions);
    }
}
