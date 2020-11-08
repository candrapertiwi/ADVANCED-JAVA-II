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
public class Tuto5 {

    private static CreditCardPayment newCard;
    private static CashPayment newCash;
    
    public static void main(String[] args) {
    int menu;
    double amount;
    String name,expireDate, number;
    Scanner inp = new Scanner(System.in);
    Expenses newEx = new Expenses();
    do {
        System.out.println("MY EXPENSES");
        System.out.println("\n1. Add Payment");
        System.out.println("2. Display Payments, >=amount entered");
        System.out.println("3. Display Payments, of specific payment type");
        System.out.println("4. Display summary information");
        System.out.println("5. Display Payments");
        System.out.println("6. quit");
        System.out.print("Choose number of menu: ");
        menu = inp.nextInt();
        
        if (menu==1){
            Payment newPay=null;
            System.out.println("1. Cash Payment");
            System.out.println("2. Credit Payment");
            System.out.print("Choose number of menu: ");
            menu = inp.nextInt();
            
            if (menu == 1){
                System.out.print("\nEnter amount: ");
                amount = inp.nextInt();
                newPay = newEx.addPaymentCash(amount);
                System.out.print("Amount paid: ");
                System.out.println(newPay.toString());
            }
            else if(menu == 2){
                System.out.println("\nEnter amount: ");
                amount = inp.nextDouble();
                inp.nextLine();
                System.out.println("Enter name: ");
                name = inp.nextLine();
                System.out.println("Enter expired date: ");
                expireDate = inp.nextLine();
                System.out.println("Number: ");
                number = inp.nextLine();
                newPay= newEx.addPaymentCard(name, expireDate, number, amount);
                System.out.println(newPay.toString());
            }
            else{
                System.out.println("Wrong input!");
            }
        }
        else if(menu == 2){
            System.out.println("\nEnter amount: ");
            amount = inp.nextDouble();
            newEx.findPayments(amount);
        }
        else if(menu == 3){
            System.out.println("\nEnter type: ");
            String type= inp.nextLine();
            newEx.findPayments(type);
        }
        else if(menu == 4){
            System.out.print("total amount: ");
            System.out.println(newEx.totAmount());
            System.out.print("total cash payment: ");
            System.out.println(newEx.typePaymentCash());
            System.out.print("total credit card payment: ");
            System.out.println(newEx.typePaymentCredit());
        }
        else if(menu ==5){
            System.out.println(newEx.dispPayment());
        }
        
    }while(menu !=6);    
    }
    
}
