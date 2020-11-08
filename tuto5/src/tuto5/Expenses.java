/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuto5;
import java.util.*;
/**
 *
 * @author user
 */
public class Expenses {
    private String name;
    ArrayList<Payment> payment;
    
    public Expenses(){
        name = " ";
        
    }
    public Expenses(String name){
        this.name = name;
        payment = new ArrayList<Payment>();
    }
    
    public String getExpenses(){
        return name;
    }
    
    public void setExpenses(String name){
        this.name=name;
    }
    
    public Payment addPaymentCash(double amount){
        CashPayment newPayment = new CashPayment(amount);
        payment.add(newPayment);
        return newPayment;
    }
    
    public Payment addPaymentCard(String name, String expireDate, String number, double amount){
        CreditCardPayment newPayment = new CreditCardPayment(name, expireDate, number, amount);
        payment.add(newPayment);
        return newPayment;
    }
    
    public String findPayments(double amount){
        int paymentCheck=0;
        int paymentCheck2=0;
        for(int i=0;i<payment.size();i++){
            if(payment.get(i).getAmount() > amount){
               paymentCheck++;
               return payment.get(i).toString();
            }
            else if(payment.get(i).getAmount()<amount){
                paymentCheck2++;
                return payment.get(i).toString();
            }       
        }
        return "total payment less than "+amount+" are " + paymentCheck +"\ntotal payment more than "+amount+" are " + paymentCheck2;
    }
    
    public String findPayments(String type){
        for(int i=0;i<payment.size();i++){
            if(payment.get(i) instanceof CashPayment){
                return payment.get(i).toString();
            }
            else if(payment.get(i) instanceof CreditCardPayment){
                return payment.get(i).toString();
            }
        }
        return " ";
    }
    
    public double totAmount(){
        double totAmount=0;
        for(int i=0;i<payment.size();i++){
            totAmount+=payment.get(i).getAmount();
        }
        return totAmount;
    }
    
    public int typePaymentCash(){
        int totalCashPayment=0;
        for(int i=0;i<payment.size();i++){
            if (payment.get(i) instanceof CashPayment){
                totalCashPayment++;
            }              
        }
        return  totalCashPayment;
    }
    
    public int typePaymentCredit(){
        int totalCashPayment=0;
        for(int i=0;i<payment.size();i++){
            if (payment.get(i) instanceof CreditCardPayment){
                totalCashPayment++;
            }              
        }
        return  totalCashPayment;
    }
    
    
}
