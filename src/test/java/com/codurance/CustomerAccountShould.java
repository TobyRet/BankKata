package com.codurance;

import org.junit.Test;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class CustomerAccountShould {

    private CustomerAccount customerAccount;
    private CustomerTransactionsRepository customerTransactionsRepository;

    @Test public void
    send_transaction_to_CustomerTransactionCollection() {
        customerTransactionsRepository = mock(CustomerTransactionsRepository.class);
        customerAccount = new CustomerAccount(customerTransactionsRepository);
        customerAccount.processTransaction(30);
        verify(customerTransactionsRepository).add(any());
    }
}
