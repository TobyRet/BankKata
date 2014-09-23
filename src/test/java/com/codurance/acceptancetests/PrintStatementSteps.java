package com.codurance.acceptancetests;

import com.codurance.BankService;
import com.codurance.ConsoleDisplay;
import com.codurance.Money;
import com.codurance.TransactionDate;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.text.SimpleDateFormat;

/**
 * Created by tobyretallick on 23/09/2014.
 */
public class PrintStatementSteps {

    private BankService bankService;

    @Before
    public void initialise() {
        bankService = new BankService(null);
        SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
    }

    @Given("^a client makes a deposit of (\\d+) on \"(.*?)\"$")
    public void a_client_makes_a_deposit_of_on(int amount, TransactionDate date) throws Throwable {
        Money money = new Money(amount);
        //SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
        //String date = sdf.parse(dateString);
        bankService.deposit(money, date);
    }

    @Given("^a deposit of (\\d+) on \"(.*?)\"$")
    public void a_deposit_of_on(int amount, TransactionDate date) throws Throwable {
        Money money = new Money(amount);
        //SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
        //Date date = sdf.parse(dateString);
        bankService.deposit(money, date);
    }

    @Given("^a withdrawal of (\\d+) on \"(.*?)\"$")
    public void a_withdrawal_of_on(int amount, TransactionDate date) throws Throwable {
        Money money = new Money(amount);
        //SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
        //Date date = sdf.parse(dateString);
        bankService.withdraw(money, date);
    }

    @When("^she prints her bank statement$")
    public void she_prints_her_bank_statement() throws Throwable {
        ConsoleDisplay consoleDisplay = new ConsoleDisplay();
        bankService.printStatement(consoleDisplay);
    }

    @Then("^she would see$")
    public void she_would_see(DataTable statement) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
        System.out.print(statement);
    }

}
