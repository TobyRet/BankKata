package com.codurance.acceptancetests;

import com.codurance.*;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


/**
 * Created by tobyretallick on 23/09/2014.
 */
public class PrintStatementSteps {

    private BankService bankService;

    @Before
    public void initialise() {
        TransactionsRepository transactionRepository = new TransactionsRepository();
        Console console = new Console();
        StatementPrinter statementPrinter = new StatementPrinter(console);
        bankService = new BankService(transactionRepository, statementPrinter);
    }

    @Given("^a client makes a deposit of (\\d+) on \"(.*?)\"$")
    public void a_client_makes_a_deposit_of_on(int amount, String transactionDate) throws Throwable {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = LocalDate.parse(transactionDate, formatter);
        Money money = new Money(amount);
        TransactionDate date = new TransactionDate(localDate);
        bankService.deposit(money, date);
    }

    @Given("^a deposit of (\\d+) on \"(.*?)\"$")
    public void a_deposit_of_on(int amount, String transactionDate) throws Throwable {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = LocalDate.parse(transactionDate, formatter);
        Money money = new Money(amount);
        TransactionDate date = new TransactionDate(localDate);
        bankService.deposit(money, date);
    }

    @Given("^a withdrawal of (\\d+) on \"(.*?)\"$")
    public void a_withdrawal_of_on(int amount, String transactionDate) throws Throwable {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = LocalDate.parse(transactionDate, formatter);
        Money money = new Money(amount);
        TransactionDate date = new TransactionDate(localDate);
        bankService.withdraw(money, date);
    }

    @When("^she prints her bank statement$")
    public void she_prints_her_bank_statement() throws Throwable {
        bankService.printStatement();
    }

    @Then("^she would see$")
    public void she_would_see(DataTable statement) throws Throwable {
        //assertThat(bankService.printStatement(), contains(statement.asList(String.class)));
    }

}
