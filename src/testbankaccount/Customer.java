/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testbankaccount;

/**
 *
 * @author duke
 */
public class Customer {
    Integer ID;
    String FirstName;
    String LastName;
    String Address;
    String Email;
    BankAccount ba;

    public Customer(Integer ID, String FirstName, String LastName, String Address, String Email, BankAccount ba) {
        this.ID = ID;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Address = Address;
        this.Email = Email;
        this.ba = ba;
    }
    
    
    
}
