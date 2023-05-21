package com.gabr.corejava;

public class CheckingAccount extends BankAccount{
    private final double minBalance;
    private boolean hasCheckbook;

    public CheckingAccount(double minBalance, boolean hasCheckbook) {
        this.minBalance = minBalance;
        this.hasCheckbook = hasCheckbook;
    }

    @Override
    public void deposit(double value) {
        this.balance += value;
    }

    @Override
    public void withdraw(double value) {
        if(balance - value >= minBalance) {
            balance -= value;
            System.out.println("Balance: " + balance);
        } else {
            System.out.println("Insufficient funds or exceeded withdrawal limit.");
        }
    }

    public void orderCheckbook() {
        if(!hasCheckbook) {
            hasCheckbook = true;
            System.out.println("Checkbook ordered.");
        } else {
            System.out.println("Checkbook is already available.");
        }
    }

}
