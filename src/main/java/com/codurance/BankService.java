package com.codurance;

import java.io.Console;
import java.util.Date;

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

    public void withdraw(Money money, Date date) {

    }

    public void printStatement(Console console) {

    }
}
