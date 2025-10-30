package com.pluralsight.finance;

import com.pluralsight.Interfaces.Valuable;

public class BankAccount implements Valuable {
    private String name;
    private String accountNumber;
    private double balance;

    public BankAccount(String name, String accountNumber, double balance){
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount){
        balance += amount;
        System.out.println("Successfully deposited");
    }

    public void withdraw(double amount){
        if(amount <= balance){
            balance -= amount;
            System.out.println("Successfully withdrawn");
        }
        else System.out.println("not enough money");

    }

    @Override
    public double getValue(){
        return balance;
    }
}
