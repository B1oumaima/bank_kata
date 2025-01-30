package com.bank;

import java.util.ArrayList;
import java.util.List;

public class Account implements AccountService {
    private int balance = 0;
    private List<String> transactions = new ArrayList<>();

    @Override
    public void deposit(int amount) {
        balance += amount;
        transactions.add("Date: " + java.time.LocalDate.now() + " || Amount: " + amount + " || Balance: " + balance);
    }

    @Override
    public void withdraw(int amount) {
        balance -= amount;
        transactions.add("Date: " + java.time.LocalDate.now() + " || Amount: -" + amount + " || Balance: " + balance);
    }

    @Override
    public void printStatement() {
        System.out.println("Date               || Amount                     || Balance");
        for (String transaction : transactions) {
            System.out.println(transaction);
        }
    }

    public int getBalance() {
        return balance;
    }
}
