package com.codurance;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by tobyretallick on 19/09/2014.
 */
public class ConsoleDisplayShould {

    private ConsoleDisplay consoleDisplay;
    private CustomerTransactionsCollection customerTransactions;
    private StatementPrinter statementGenerator;

    @Test
    public void
    receive_a_prepared_statement_for_displaying_on_the_console() {
        statementGenerator = mock(StatementPrinter.class);
        customerTransactions = new CustomerTransactionsCollection();
        consoleDisplay = new ConsoleDisplay(customerTransactions, statementGenerator);
        consoleDisplay.printStatement();
        verify(statementGenerator).prepareStatement(customerTransactions);
    }
}
