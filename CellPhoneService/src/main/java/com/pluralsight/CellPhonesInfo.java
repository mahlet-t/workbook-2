package com.pluralsight;

import java.util.Scanner;

public class CellPhonesInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CellPhone phone = new CellPhone();
        System.out.println("What is the serial number");
        int SC = input.nextInt();
        input.nextLine();
        phone.setSerialNumber(SC);
        System.out.println("What model is the phone?");
        String M = input.nextLine();
        phone.setModel(M);
        System.out.println("Who is the carrier?");
        String C = input.nextLine();
        phone.setCarrier(C);
        System.out.println("What is the phone number?");
        String PN = input.nextLine().trim();
        phone.setPhoneNumber(PN);
        System.out.println("Who is the owner of the phone?");
        String OW = input.nextLine().trim();
        phone.setOwner(OW);
        System.out.println("your Cell Phone information");
        System.out.println("serial number: " + phone.getSerialNumber());
        System.out.println("Model: " + phone.getModel());
        System.out.println("carrier: " + phone.getCarrier());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
        System.out.println("owner: " + phone.getOwner());
        System.out.println("\n\n.........................................................................");
        //
        CellPhone phone1 = new CellPhone();
        phone1.setOwner("Mahlet");
        phone1.setPhoneNumber("657-908-9876");
        phone1.setCarrier("At@T");
        phone1.setModel("iphone 6");
        phone1.setSerialNumber(1234567);
        CellPhone phone2 = new CellPhone();
        phone2.setOwner("dana");
        phone2.setPhoneNumber("444-000-4444");
        phone2.setCarrier("At@T");
        phone2.setModel("iphone 6");
        phone2.dial(phone1.getPhoneNumber());
        phone1.dial(phone2.getPhoneNumber());
        phone1.dial(phone2);
        phone2.dial(phone1);
        System.out.println("\n..............................................................................");
        display(phone1);
        display(phone2);
        CellPhone phone3=new CellPhone(123456,"iphone6","AT@T","123-456-7890","beti");
        phone1.dial(phone3.getPhoneNumber());
        display(phone3);
    }

    public static void display(CellPhone phone) {
        System.out.println("owner:" + phone.getOwner());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
        System.out.println("Carrier: "+phone.getCarrier());
        System.out.println("model: "+phone.getModel());
        System.out.println("Serial Number: "+phone.getSerialNumber());
        System.out.println();

    }


}


