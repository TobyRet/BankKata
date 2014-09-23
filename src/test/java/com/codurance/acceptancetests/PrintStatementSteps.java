package com.codurance.acceptancetests;

/**
 * Created by tobyretallick on 22/09/2014.
 */
//public class PrintStatementSteps {
//
//    private final BankService bankService;
//
//    @Before
//    public void initialise() {
//        bankService = new BankService(null);
//    }
//
//    @Given("^a client makes a deposit of (\\d+) on \"(.*?)\"$")
//    public void a_client_makes_a_deposit_of(int amount, String dateString) throws Throwable {
//        Money money = new Money(amount);
//        SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
//        Date date = sdf.parse(dateString);
//        bankService.deposit(money, date);
//    }
//
//    @Given("^a deposit of (\\d+) on \"(.*?)\"$")
//    public void a_deposit_of_on(int amount, String date) throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
//    }
//
//    @Given("^a withdrawal of (\\d+) on \"(.*?)\"$")
//    public void a_withdrawal_of_on(int amount, String date) throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
//    }
//
//    @When("^she prints her bank statement$")
//    public void she_prints_her_bank_statement() throws Throwable {
//        bankService.printStatement(console);
//        throw new PendingException();
//    }
//
//    @Then("^she would see$")
//    public void she_would_see(DataTable statementLines) throws Throwable {
//        String line1 = "statementLines"; // figure out how to get the line.
//        verify(console).printLine(line1);
//        verify(console).printLine(line2);
//        // Write code here that turns the phrase above into concrete actions
//        // For automatic transformation, change DataTable to one of
//        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
//        // E,K,V must be a scalar (String, Integer, Date, enum etc)
//        throw new PendingException();
//    }
//}
