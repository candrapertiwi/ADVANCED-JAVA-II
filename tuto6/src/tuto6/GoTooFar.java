/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuto6;
import java.util.*;
/**
 *
 * @author user
 */
public class GoTooFar {
      public static void main(String[] args) {
          int[] number = new int[5];
          number[0] =1;
          number[1]=2;
          number[2]=3;
          number[3]=4;
          number[4]=5;
          
          try{
              for(int i=0;i<number.length;i++){
                  System.out.println(number[i]);
                  number[i]+=1;
              }
          }
          catch (Exception e){
              System.out.println("Now you've gone too far");
          }
      }
}
