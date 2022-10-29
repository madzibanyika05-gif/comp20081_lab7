/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab7_8;

/**
 *
 * @author ntu-user
 */
import java.io.File; // Import the File class 
import java.io.FileNotFoundException; // Import this class to handle errors 
import java.util.Scanner; // Import the Scanner class to read text files 

public class Ex5 {

    public static void main(String[] args) {
        try {
            File myObj = new File("Test.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}