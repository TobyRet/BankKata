package com.codurance;

/**
 * Created by tobyretallick on 18/09/2014.
 */
public class BankService {

    private final CustomerAccount customerAccount;

    public BankService(CustomerAccount customerAccount) {
        this.customerAccount = customerAccount;
    }

    public void deposit(Transaction deposit) {
        customerAccount.processTransaction(deposit);
    }

    public void withdraw(Transaction withdraw) {
        customerAccount.processTransaction(withdraw);
    }

    public void transfer(Transaction transfer) {
        customerAccount.processTransaction(transfer);
    }
}
