package com.gabr.corejava;

import javax.crypto.spec.PSource;

public class SavingsAccount extends BankAccount{

    private final double withdrawalLimit;
    private final double interestRate;

    public SavingsAccount(double withdrawalLimit, double interestRate) {
        this.withdrawalLimit = withdrawalLimit;
        this.interestRate = interestRate;
    }
    @Override
    public void deposit(double value) {
        this.balance += value;
    }
    @Override
    public void withdraw(double value) {
        if(value <= withdrawalLimit && balance >= value) {
            balance -= value;
            System.out.println("Balance: " + balance);
        } else {
            System.out.println("Insufficient funds or exceeded withdrawal limit.");
        }
    }

    public void calcInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Interest: " + interest);
    }

}
