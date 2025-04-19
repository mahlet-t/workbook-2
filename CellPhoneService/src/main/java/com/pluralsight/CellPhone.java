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
    // overloaded constructor
    public CellPhone(int serialNumber,String model,String carrier,String phoneNumber,String owner ){
        this.serialNumber=serialNumber;
        this.model=model;
        this.carrier=carrier;
        this.phoneNumber=phoneNumber;
        this.owner=owner;

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
  public void dial(String phoneNumber) {
        System.out.println(owner+"'s phone is calling "+phoneNumber);

  }
  //overloaded version of the dial method
  public void dial(CellPhone phone){
System.out.println(owner+"'s phone is calling "+phone.getPhoneNumber());
  }
}



