package com.codurance;

/**
 * Created by tobyretallick on 18/09/2014.
 */
public class BankService {

    private final CustomerAccount customerAccount;

    public BankService(CustomerAccount customerAccount) {
        this.customerAccount = customerAccount;
    }

    public void deposit(int depositAmount) {
        customerAccount.processTransaction(depositAmount);
    }

    public void withdraw(int withdrawAmount) {
        customerAccount.processTransaction(withdrawAmount);
    }

    public void transfer(int transferAmount) {
        customerAccount.processTransaction(transferAmount);
    }

    public void printStatement() {
        customerAccount.printStatement();
    }
}
