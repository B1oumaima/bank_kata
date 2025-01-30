package com.bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    private Account account;

    @BeforeEach
    public void setUp() {
        account = new Account();
    }

    @Test
    public void testDeposit() {
        account.deposit(1000);
        account.deposit(2000);
        account.withdraw(500);

        assertEquals(2500, account.getBalance());
    }

    @Test
    public void testWithdraw() {
        account.deposit(1000);
        account.withdraw(500);

        assertEquals(500, account.getBalance());
    }

    @Test
    public void testPrintStatement() {
        account.deposit(1000);
        account.deposit(2000);
        account.withdraw(500);

        account.printStatement(); // Check if the printed statement is as expected
    }
}
