package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args) {
        while (true) {
            try {
                Scanner input = new Scanner(System.in);
                System.out.println("please enter your full name");
                String name = input.nextLine().trim();
                String[] fullName = name.split(" ");
                System.out.println("What date will you be coming(MM/dd/yyyy");
                String inputDate = input.nextLine();
                DateTimeFormatter dateTimeFormatter;
                dateTimeFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
                LocalDate date = LocalDate.parse(inputDate, dateTimeFormatter);
                System.out.println("How many Tickets would you like?");
                int ticket = input.nextInt();
                input.nextLine();
                if (ticket > 1) {
                    System.out.println(ticket + " tickets reserved for " + date + " under " + capitalize(fullName[1]) + "," + capitalize(fullName[0]));
                } else {
                    System.out.println(ticket + " ticket reserved for " + date + " under " + capitalize(fullName[1]) + "," + capitalize(fullName[0]));
                }
                break;

            } catch (Exception e) {
                System.out.println("Invalid input try again");
            }
        }

    }
    public static String capitalize(String name){
        return name.substring(0,1).toUpperCase()+name.substring(1).toLowerCase();
    }
}



