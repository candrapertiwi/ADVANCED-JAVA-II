/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuto5;

/**
 *
 * @author user
 */
public class CreditCardPayment extends Payment {
    public String name;
    public String expireDate;
    public String number;

    public CreditCardPayment(String name, String expireDate, String number, double amount) {
        super(amount);
        this.name = name;
        this.expireDate = expireDate;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    public String toString(){
        return super.toString() + "\nName : " + name +
                "\nExpired Date : " + expireDate + "\nNumber Card : " +number;
    }
    
}
