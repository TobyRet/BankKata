package com.codurance.unit;

import com.codurance.Money;
import com.codurance.StatementPrinter;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;


/**
 * Created by tobyretallick on 23/09/2014.
 */
public class MoneyShould {

    private static final int £10 = 10;
    private Money money;
    private StatementPrinter statementPrinter;

//    @Test
//    public void
//    print_amount_to_console() {
//        money = new Money(£10);
//        statementPrinter = mock(StatementPrinter.class);
//        money.printValue(statementPrinter);
//    }

    @Test(expected = RuntimeException.class) public void
    throws_exception_if_money_object_created_with_negative_value() {
        new Money(-10);
    }

    @Test public void
    display_itself_with_two_decimal_places() {
        assertThat(new Money(10).toString(), is("10.00"));
    }

}
