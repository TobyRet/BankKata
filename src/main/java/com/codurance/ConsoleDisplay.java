package com.codurance;

/**
 * Created by tobyretallick on 19/09/2014.
 */
public class ConsoleDisplay {
    private final CustomerTransactionsCollection customerTransactions;
    private StatementPrinter statementGenerator;
    private String preparedStatement;

    public ConsoleDisplay(CustomerTransactionsCollection customerTransactions, StatementPrinter statementGenerator) {
        this.customerTransactions = customerTransactions;
        this.statementGenerator = statementGenerator;
    }

    public void printStatement() {
        preparedStatement = statementGenerator.prepareStatement(customerTransactions);
        System.out.println(preparedStatement);
    }
}
