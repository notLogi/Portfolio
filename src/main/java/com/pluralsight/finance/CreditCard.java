package com.pluralsight.finance;

import com.pluralsight.Interfaces.Valuable;

public class CreditCard implements Valuable {
    private String name;
    private String accountNumber;
    private double balance;

    public CreditCard(String name, String accountNumber, double balance){
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void charge(double amount){
        balance += amount;
    }

    public void pay(double amount){
        System.out.println("Credit successful");
        balance -= amount;
    }

    @Override
    public double getValue(){
        System.out.println("Credit card");
        return balance;
    }
}
