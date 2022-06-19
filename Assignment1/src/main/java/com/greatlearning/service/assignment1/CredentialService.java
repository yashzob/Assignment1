/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.greatlearning.service.assignment1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Yash Vardhan Yadav
 */
public class CredentialService {
    // Generate Email
     public String GenerateEmailAddress(String firstName, String lastName){
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        
        System.out.println("Enter Department no, ");
        System.out.println("1 technical ");
        System.out.println("2 Admin ");
        System.out.println("3 Human Resource");
        System.out.println("4 legal ");

        int deptNo = myObj.nextInt();

        //int deptNo=Integer.parseInt(deparmentName);

        String deparmentName="";
        if (deptNo==1){
            deparmentName ="technical";
        }
        else if(deptNo==2){
        deparmentName ="Admin";
        }
        else if(deptNo==3){
        deparmentName ="HR";
        }
        else if(deptNo==4){
        deparmentName ="legal";
        }
        else {
        System.out.println("enter the proper value");
        }

        String email=firstName+lastName+"@"+deparmentName+".xyz.com";
        return email;
   }
    // Generate Password
    public String GeneratePassword(){
        String alpha ="ABCDEFGHIJKLMANOPQRSTUVWXYZqwertyuiopasdfghjklzxcvb*&^%$#@1234567890";
        Random randP =new Random();
        String randPass="";
        for (int i =0; i<8;i++)
        {
            randPass=randPass+(alpha.charAt(randP.nextInt(0,alpha.length())));
        }
          return randPass;      
    }

    // Generate Credential
    public void ShowCredentials(String name, String email, String password){
       System.out.println("Dear "+name+" your generated credentials are as follows" );
       System.out.println("Email ---> "+email);
       System.out.println("Password ---> "+password);
    }
}
