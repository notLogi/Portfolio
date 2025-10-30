package com.pluralsight;

import com.pluralsight.Interfaces.Valuable;
import com.pluralsight.finance.BankAccount;
import com.pluralsight.finance.CreditCard;
import com.pluralsight.finance.Jewelry;

public class FinanceApplication {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount( "Pam", "123",12500);
        Valuable account2 = new BankAccount("Gary", "1500", 1243);//does work because valuable does not inherit name
        Valuable account3 = new CreditCard("Gary", "1500", 1243);
        Jewelry test = new Jewelry("Diamond", 32);
// try to deposit money into both accounts
        account1.deposit(100);
        ((CreditCard) account3).pay(100);
        ((BankAccount) account2).deposit(100);
        account2.getValue();
        account1.getValue();
        account3.getValue();
    }
}
