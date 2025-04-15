package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter your name ");
        String name= input.nextLine().trim();
        String[] parts=name.split(" ");
        String firstname=" ";
        String middleName="none";
        String  lastName=" ";
        if (parts.length==2){
            firstname=parts[0];
            lastName=parts[1];
        } else if (parts.length==3) {
            firstname=parts[0];
            middleName=parts[1];
            lastName=parts[2];
            System.out.println("First name: "+firstname);
            System.out.println("Middle name: "+middleName);
            System.out.println("last name: "+lastName);
        }
        else {
            System.out.println("invalid name format try again");
        }
    }

}
