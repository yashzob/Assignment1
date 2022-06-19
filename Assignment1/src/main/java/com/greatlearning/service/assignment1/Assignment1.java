/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.greatlearning.service.assignment1;

import java.util.Scanner;

/**
 *
 * @author Yash Vardhan Yadav
 */
public class Assignment1 {

    public static void main(String[] args) {
         Scanner myObj = new Scanner(System.in);  // Create a Scanner object

        System.out.println("Enter first name");
        String firstName = myObj.nextLine();  // Read user input

        System.out.println("Enter last name");
        String lastName = myObj.nextLine();  // Read user input
        
        Employee emp = new Employee(firstName, lastName);
    
    }
}
