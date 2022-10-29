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

public class Ex8 {

    public static void main(String[] args) {
        File myObj = new File("test");
        if (myObj.mkdir()) {
            System.out.println("Created the folder: " + myObj.getName());
        } 
        else {
            System.out.println("Failed to create the folder.");
        }
        if (myObj.delete()) {
            System.out.println("Deleted the folder: " + myObj.getName());
        } 
        else {
            System.out.println("Failed to delete the folder.");
        }
    }
}
