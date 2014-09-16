package com.codurance;

/**
 * Created by tobyretallick on 16/09/2014.
 */
public class BankingService {
    private final CustomerAccount customerAccount;

    public BankingService(CustomerAccount customerAccount) {
        this.customerAccount = customerAccount;
    }

    public void deposit(int amount, CustomerAccount customerAccount) {
        customerAccount.depositFunds(amount);
    }

    public void withdraw(int amount, CustomerAccount customerAccount) {
        customerAccount.withdrawFunds(amount);
    }

    public void transfer(int amount, CustomerAccount customerAccount, CustomerAccount destinationAccount) {
        withdraw(amount, customerAccount);
        deposit(amount, destinationAccount);
    }
}
