package com.codurance;

/**
 * Created by tobyretallick on 16/09/2014.
 */
public class BankingService {

    private CustomerAccountDAO customerAccountDAO;

    public BankingService(CustomerAccountDAO customerAccountDAO) {
        this.customerAccountDAO = customerAccountDAO;
    }

    public void deposit(int amount, int customerID) {
        retrieveCustomerAccount(customerID).depositFunds(amount);
    }

//    public void withdraw(int amount, CustomerAccount customerAccount) {
//        customerAccount.withdrawFunds(amount);
//    }

//    public void transferFunds(int amount, CustomerAccount customerAccount, CustomerAccount destinationAccount) {
//        withdraw(amount, customerAccount);
//        deposit(amount, destinationAccount);
//    }
//
//    public void printStatement(CustomerAccount customerAccount) {
//        customerAccount.printStatement();
//    }

    public CustomerAccount retrieveCustomerAccount(int customerID) {
        return customerAccountDAO.getCustomerAccount(customerID);
    }
}
