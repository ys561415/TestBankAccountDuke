/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testbankaccount;

/**
 *
 * @author ha07
 */
public class BankAccount {
    // look at the access modifier of balance
    private double balance;
    
    // constructor
    BankAccount(double amount) {
        balance = amount;
    }
    
    // look at the access modifier of the following methods
    protected double getBalance() {
        return balance;
    }
    
    protected void withdraw(double amount) {
        if(balance >= amount)
            balance -= amount;
    }
    
    protected void deposit(double amount) {
        balance += amount;
    }
    protected void transfer(double amount, BankAccount ba){
        withdraw(amount);
        ba.deposit(amount);
    }
 
    
}

