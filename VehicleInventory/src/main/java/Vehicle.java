public class Vehicle {
 private long vehicleID;
  private String makeModel;
  private String color;
  private int odometerReading;
  private float price;
  //constructor
   public  Vehicle(){
    long vehicleID=0;
    String makeModel="";
    String color="";
    int odometerReading=0;
    float price=0;}
    public Vehicle(long vehicleID,String makeModel,String color,int odometerReading,float price){
       this.vehicleID=vehicleID;
       this.makeModel=makeModel;
       this.color=color;
       this.odometerReading=odometerReading;
       this.price=price;
    }

    //to set data
 public void setVehicleID(long VI){
    vehicleID=VI;
 }
public void setMakeModel(String MK){
    makeModel=MK;
}
public void setColor(String Cl){
    color=Cl;
}
public void setOdometerReading(int OR){
    odometerReading=OR;
}
public void setPrice(float P){
    price=P;
}
// to get data


    public long getVehicleID() {
        return vehicleID;
    }

    public String getMakeModel() {
        return makeModel;

    }

    public String getColor() {
        return color;
    }

    public int getOdometerReading() {
        return odometerReading;
    }

    public float getPrice() {
        return price;
    }
}

