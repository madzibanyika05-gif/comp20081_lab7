/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ntu-user
 */
import java.io.File;

public class Ex87 {
    public static void main(String[] args) {
        File folder = new File("MyFolder");
        if (folder.mkdir()) {
            System.out.println("Directory created: " + folder.getName());
        } else {
            System.out.println("Directory already exists or failed to create.");
        }

        if (folder.delete()) {
            System.out.println("Directory deleted: " + folder.getName());
        } else {
            System.out.println("Failed to delete the directory.");
        }
    }
}