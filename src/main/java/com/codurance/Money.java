package com.codurance;

import java.text.DecimalFormat;

public class Money {

    private int amount;

    public Money(int amount) {
        if(amount < 0) {
            throw new RuntimeException("You cannot pass a negative value into Amount constructor");
        }
        this.amount = amount;
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        return decimalFormat.format(amount);
    }

    public void isWithdrawal() {
        amount = -amount;
    }
}
