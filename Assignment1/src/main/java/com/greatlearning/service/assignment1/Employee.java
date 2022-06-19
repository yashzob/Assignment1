/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.greatlearning.service.assignment1;

/**
 *
 * @author Yash Vardhan Yadav
 */
public class Employee {
    public Employee (String firstName,String lastName ){
        CredentialService cService = new CredentialService();
        String email = cService.GenerateEmailAddress(firstName, lastName);
        String password = cService.GeneratePassword();
        cService.ShowCredentials(firstName, email, password);
    }
}
