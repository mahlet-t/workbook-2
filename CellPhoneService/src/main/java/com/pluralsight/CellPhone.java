package com.pluralsight;
public class CellPhone {
    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;


// constructor
    public CellPhone(){
        serialNumber=0;
        model="";
        carrier="";
        phoneNumber="";
        owner="";
    }
    //to set data
    public void setSerialNumber(int SC){
        serialNumber=SC;
    }
    public void setModel(String M){
        model=M;
    }
    public void setCarrier(String C){
        carrier=C;
    }
    public void setPhoneNumber(String PN){
        phoneNumber=PN;
    }
    public void setOwner(String OW){
        owner=OW;
    }
    // to get data

    public int getSerialNumber() {
        return serialNumber;
    }
    public String getModel(){
        return model;
    }
    public String getCarrier(){
        return carrier;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public String getOwner(){
        return owner;
    }
}


