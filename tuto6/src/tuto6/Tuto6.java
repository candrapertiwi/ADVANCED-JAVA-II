/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuto6;

/**
 *
 * @author user
 */
public class Tuto6 {

    /**
     * question 6
     */
    public static void main(String[] args) {
       try { 
  
            String str = "Bandana"; 
            double val = Double.parseDouble(str); 
            System.out.println("Value = " + val); 
        } 
        catch (Exception e) { 
            System.out.println("Unexpected Error!"); 
        } 
    } 
    
    
}
