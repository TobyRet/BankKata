package com.codurance.unit;

import com.codurance.Money;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MoneyShould {

    @Test(expected = RuntimeException.class) public void
    throws_exception_if_money_object_created_with_negative_value() {
        new Money(-10);
    }

    @Test public void
    display_itself_with_two_decimal_places() {
        assertThat(new Money(10).toString(), is("10.00"));
    }

}
