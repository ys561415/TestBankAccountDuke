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
public class CheckingAccount extends BankAccount {
    private static final int FREE_TRANSACTIONS=5;
    private static final double TRANSACTION_FEE=1.0;
    private int transactionCount;
    
    CheckingAccount(double amount) {
        super(amount);        
    }
    
    @Override
    public void deposit(double amount) {
        super.deposit(amount); // calling super class's deposit method
        transactionCount++;
    }
    
    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        transactionCount++;
    } 
    
    // the checking account method that deducts a fee
    // if the number of transactions goes beyond a threshold
    public void deductFees() {
        if(transactionCount > FREE_TRANSACTIONS) {
            double fees = TRANSACTION_FEE * (transactionCount - FREE_TRANSACTIONS);
            super.withdraw(fees);            
        }
        transactionCount = 0;
    }
    
    public void transfer(double amount, BankAccount other) {
        this.withdraw(amount);
        other.deposit(amount);
    }
    
    // implement the function overloading solution of 'transfer function' here.
    
}
