package com.codurance;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class AccountMenuShould {

    private AccountMenu accountMenu;
    private UserAccount userAccount;
    private UserAccount mockedUserAccount;

    @Test(expected = RuntimeException.class) public void
    throw_exception_if_invalid_menu_item_selected() {
        accountMenu = new AccountMenu(new UserAccount());
        accountMenu.select("rob bank");
    }

    @Test public void
    direct_menu_choice_to_the_correct_handler() {
        mockedUserAccount = mock(UserAccount.class);
        accountMenu = new AccountMenu(mockedUserAccount);

        accountMenu.select("deposit");
        verify(mockedUserAccount).deposit();

        accountMenu.select("withdraw");
        verify(mockedUserAccount).deposit();

        accountMenu.select("transfer");
        verify(mockedUserAccount).transfer();

        accountMenu.select("print statement");
        verify(mockedUserAccount).printStatement();
    }

}