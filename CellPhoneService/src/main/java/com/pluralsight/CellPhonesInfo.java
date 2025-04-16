package com.pluralsight;

import java.util.Scanner;

public class CellPhonesInfo {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    CellPhone phone=new CellPhone();
    System.out.println("What is the serial number");
    int SC=input.nextInt();
    input.nextLine();
    phone.setSerialNumber(SC);
    System.out.println("What model is the phone?");
    String M=input.nextLine();
    phone.setModel(M);
    System.out.println("Who is the carrier?");
    String C=input.nextLine();
    phone.setCarrier(C);
    System.out.println("What is the phone number?");
    String PN=input.nextLine();
    phone.setPhoneNumber(PN);
    System.out.println("Who is the owner of the phone?");
    String OW=input.nextLine();
    phone.setOwner(OW);
    System.out.println("your Cell Phone information");
    System.out.println("serial number: "+phone.getSerialNumber());
    System.out.println("Model: "+phone.getModel());
    System.out.println("carrier: "+phone.getCarrier());
    System.out.println("Phone Number: "+phone.getPhoneNumber());
    System.out.println("owner: "+phone.getOwner());
}

}

