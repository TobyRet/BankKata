package com.codurance;

/**
 * Created by tobyretallick on 23/09/2014.
 */
public class BankService {

    private TransactionsRepository transactionsRepository;

    public BankService(TransactionsRepository transactionsRepository) {
        this.transactionsRepository = transactionsRepository;
    }

    public void deposit(Money money, TransactionDate date) {
        transactionsRepository.store(new Transaction(money, date, TransactionType.DEPOSIT));
    }

    public void withdraw(Money money, TransactionDate date) {
        transactionsRepository.store(new Transaction(money, date, TransactionType.WITHDRAWAL));
    }

    public void printStatement(ConsoleDisplay consoleDisplay) {
        consoleDisplay.displayStatement();
    }
}
