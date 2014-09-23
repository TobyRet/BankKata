package com.codurance;

/**
 * Created by tobyretallick on 23/09/2014.
 */
public class BankService {
    private TransactionRepository transactionRepository;

    public BankService(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    public void deposit(Money money, String date) {
        transactionRepository.store(money, date);
    }

    public void withdraw(Money money, String date) {
        transactionRepository.store(money, date);
    }

    public void printStatement(ConsoleDisplay consoleDisplay) {
        consoleDisplay.displayStatement();
    }
}
