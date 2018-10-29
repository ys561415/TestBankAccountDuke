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
public class TestBankAccount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BankAccount ba1 = new SavingsAccount(1000,2.5);
        BankAccount ba2 = new CheckingAccount(2000);
        
        Customer c1 = new Customer(1,"Mike","Johnson","Greemwich","mike.johnson@foo.com",ba1);
        Customer c2 = new Customer(2,"James","Still","Lewisham","james.still@foo.com",ba2);
        
        c1.ba.transfer(1000, ba2);
        System.out.println(""+c1.ba.getBalance()+"  "+c2.ba.getBalance());
        
        // Creating some bank accounts, e.g., savings and checking
        SavingsAccount sa1 = new SavingsAccount(1000, 2.5);
        SavingsAccount sa2 = new SavingsAccount(2000, 2.5);
        
        CheckingAccount ca1 = new CheckingAccount(1000);
        CheckingAccount ca2 = new CheckingAccount(2000);
 
        // do some operations: withdraw, deposit, etc.
        //sa1.deposit(100);
        //ca2.deposit(200);
        
        ca2.transfer(100, ca1); // transferring from 1st saving account to 1st checking account
        ca2.transfer(100, sa2); // transferring from 1st saving account to 2nd savings account
        
        // viewing the available balance
        System.out.println("The balances of the saving accounts are: " + sa1.getBalance() + " "+sa2.getBalance());
        System.out.println("The balances of the checking accounts are: " + ca1.getBalance() + " "+ca2.getBalance());
    }
 }
