/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab7_8;

/**
 *
 * @author ntu-user
 */
public class Ex1 {
   public static void main(String args[]){  
    try{  
       //code that may raise exception
       System.out.println("Attempting to divide 100 by 0.\n");
       int data=100/0;
       System.out.println("This block is not going to run!");
    }
    catch(ArithmeticException e){
        System.out.println("Caught the divide by 0 exception!\n"+e);
    }
    finally {
      System.out.println("This is the finally block");
    }
  }  
}
