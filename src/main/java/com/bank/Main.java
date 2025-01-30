package com.bank;

public class Main {
    public static void main(String[] args) {
        Account account = new Account();

        // Simulate deposits and withdrawals like in the instructions for the test
        account.deposit(1000);
        account.deposit(2000);
        account.withdraw(500);

        // Print the statement
        account.printStatement();
    }
}
