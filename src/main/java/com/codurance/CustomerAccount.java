package com.codurance;

public class CustomerAccount {

    private final StatementPrinter statementPrinter;
    private Transaction transaction;
    private CustomerTransactionsRepository customerTransactionsRepository;

    public CustomerAccount(CustomerTransactionsRepository customerTransactionsRepository, StatementPrinter statementPrinter) {
        this.customerTransactionsRepository = customerTransactionsRepository;
        this.statementPrinter = statementPrinter;
    }

    public void processTransaction(int transactionAmount) {
        transaction = new Transaction(transactionAmount);
        customerTransactionsRepository.add(transaction);
    }

    public void printStatement() {
        statementPrinter.printStatement(customerTransactionsRepository.retrieveAll());
    }
}