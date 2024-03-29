package org.experis.oop1.javabank;


import java.util.Random;

public class BankAccount {
    // attributi
    private int accountNumber;
    private String accountOwner;
    private double balance;

    // random

    Random random = new Random();
    int randomAccount = random.nextInt(1000);


    // setter


    public void setAccountOwner(String accountOwner) {
        this.accountOwner = accountOwner;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // getter


    public String getAccountOwner() {
        return accountOwner;
    }

    public double getBalance() {
        return balance;
    }

    // constructor


    public BankAccount() {
        setAccountNumber(randomAccount);

    }

    // method

    public double depositMoney(int deposit) {
        double balance = getBalance();
        double newBalance = balance + deposit;
        setBalance(newBalance);
        return newBalance;
    }

    public double withdrawMoney(int withdraw) {

        double balance = getBalance();

        if (balance >= withdraw) {
            double newBalance = balance - withdraw;
            setBalance(newBalance);
            return newBalance;
        } else {
            double newBalance = balance;
            setBalance(newBalance);
            return newBalance;

        }
    }
}
