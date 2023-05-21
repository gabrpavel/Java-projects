package com.gabr.corejava;

public abstract class BankAccount {
    protected int accountID;
    protected double balance;

    static int ID = 1_000;

    public BankAccount() {
        ID++;
        this.accountID = ID;
        this.balance = 0.0;
    }

    public double getBalance() {
        return balance;
    }
    public int getAccountID() {
        return accountID;
    }
    public abstract void deposit(double value);
    public abstract void withdraw(double value);

}
