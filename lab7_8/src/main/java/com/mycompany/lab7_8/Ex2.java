/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab7_8;

/**
 *
 * @author ntu-user
 */
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ex2 {

    public static void main(String[] args) {
        FileReader fileReader;
        fileReader = new FileReader("Test.txt");
        var bufferReader = new BufferedReader(fileReader);

        String fileData = null;

        while ((fileData = bufferReader.readLine()) != null) {
            System.out.println(fileData);
        }
        // closing the BufferedReader object  
        bufferReader.close();
        

    }
}
