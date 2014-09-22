package com.codurance;

public class CustomerAccount {

    private Transaction transaction;
    private CustomerTransactionsRepository customerTransactionsRepository;

    public CustomerAccount(CustomerTransactionsRepository customerTransactionsRepository) {
        this.customerTransactionsRepository = customerTransactionsRepository;
    }

    public void processTransaction(int transactionAmount) {
        transaction = new Transaction(transactionAmount);
        customerTransactionsRepository.add(transaction);
    }

    public void printStatement() {

    }
}