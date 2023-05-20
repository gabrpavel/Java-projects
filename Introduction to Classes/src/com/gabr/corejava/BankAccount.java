package com.gabr.corejava;

public class BankAccount {

    private String password;
    private float balance;
    private String name;

    public BankAccount(String name, String password) {
        setName(name);
        setPassword(password);
        setBalance();
    }
    public String getPassword() {
        return password;
    }

    public float getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    private void setPassword(String password){
        this.password = password;
    }

    private void setBalance() {
        this.balance = (float) 0.0;
    }

    private void setName(String name) {
        this.name = name;
    }

    public void replenishBalance(float value) {
        balance += value;
    }

    public void withdrawMoney(float value) {
        if(value > balance) System.out.println("Insufficient funds!");
        else balance -= value;
    }

}
