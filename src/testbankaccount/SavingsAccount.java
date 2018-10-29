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
public class SavingsAccount extends BankAccount {
    private double interestRate;
    // constructor
    SavingsAccount(double amount, double rate) {
        super(amount);
        interestRate = rate;
    }
    public void addInterest() {
        double interest = getBalance() * interestRate / 100;
        super.deposit(interest); // calling super class's deposit method
    }
    
    // the next two functions are examples of function overloading:
    // depending on whether the second argument is Savings or Checking account
    // the appropriate function will be called
    
    public void transfer(double amount, SavingsAccount sa) {
        withdraw(amount);   // withdrawing from this account
        sa.deposit(amount); // deposit inside the other account
    }
    public void transfer(double amount, CheckingAccount ca) {
        withdraw(amount);   // withdrawing from this account
        ca.deposit(amount); // deposit inside the other account
    }
    
}
