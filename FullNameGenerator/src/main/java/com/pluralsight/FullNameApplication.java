package com.pluralsight;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter your first name");
        String firstName=input.nextLine().trim();
        System.out.println("please enter your middle name or press Enter if none");
        String middleName=input.nextLine().trim();
        System.out.println("please enter last name ");
        String lastName=input.nextLine().trim();
        System.out.println("please enter your suffix or press Enter if none ");
        String suffix=input.nextLine().trim();
        // build full name
        String fullName=firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();
        if (!middleName.isEmpty()){
            fullName+=" "+middleName.substring(0,1).toUpperCase()+middleName.substring(1).toLowerCase();
        fullName +=" "+lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();}
       if (!suffix.isEmpty()){
           fullName+= " "+suffix.toUpperCase();
      }

       System.out.println("fullName is: "+fullName);




    }

}
