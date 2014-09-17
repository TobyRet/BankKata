package com.codurance;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.Matchers.contains;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AccountHistoryShould {

    private AccountHistory accountHistory;
    private List<Object> transaction;
    
    @Before
    public void initialise() {
        accountHistory = new AccountHistory();
    }

    @Test public void
    enter_data_into_statement_ArrayList() {
        accountHistory.enterTransaction("deposit", 30);
        assertThat(accountHistory.retrieveTransaction(), contains("17/09/14", 30, 30));
        assertThat(accountHistory.retrieveAllTransactions().get(0), is(accountHistory.retrieveTransaction()));
    }
    
    @Test public void
    enter_formatted_date_into_transaction_arrayList() {
        assertThat(accountHistory.createFormattedDateStamp(), is("17/09/14"));
    }
}
