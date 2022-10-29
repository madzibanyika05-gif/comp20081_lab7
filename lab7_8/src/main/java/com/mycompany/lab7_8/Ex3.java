/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab7_8;

/**
 *
 * @author ntu-user
 */
import java.io.File;
import java.io.IOException;

/**
 *  *
 *  * @author ntu-user  
 */
public class Ex3 {

    public static void main(String[] args) {
        try {
            File myObj = new File("Test.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } 
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
