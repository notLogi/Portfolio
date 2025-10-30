package com.pluralsight.finance;

import com.pluralsight.Interfaces.Valuable;

public class FinanceApplication {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount( "Pam", "123",12500);
        Valuable account2 = new BankAccount("Gary", "1500", 1243);//does work because valuable does not inherit name
// try to deposit money into both accounts
        account1.deposit(100);
        ((BankAccount) account2).deposit(100);
    }
}
