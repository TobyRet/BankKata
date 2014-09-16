package com.codurance;

/**
 * Created by tobyretallick on 15/09/2014.
 */
public class AccountMenu {
    private final UserAccount userAccount;

    public AccountMenu(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    public void select(String menuItem) {

        switch (menuItem) {
            case "deposit":
                userAccount.deposit();
                break;
            case "withdraw":
                userAccount.withdraw();
                break;
            case "transfer":
                userAccount.transfer();
                break;
            case "print statement":
                userAccount.printStatement();
                break;
            default: throw new RuntimeException("Invalid menu choice");
        }
    }
}
