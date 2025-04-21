import java.util.Scanner;

public class VehicleInventory {
    public static void main(String[] args) {
        Vehicle[] Inventory = new Vehicle[20];
        int VehicleCount = 0;
        Inventory[VehicleCount++] = new Vehicle(101121, "Ford Explorer", "Red", 45000, 13500);
        Inventory[VehicleCount++] = new Vehicle(101122, "Toyota Camry", "Blue", 60000, 11000);
        Inventory[VehicleCount++] = new Vehicle(101123, "Chevrolet Malibu", "black", 50000, 9700);
        Inventory[VehicleCount++] = new Vehicle(101124, "Honda Civic", "White", 70000, 7500);
        Inventory[VehicleCount++] = new Vehicle(101125, "Subaru Outback", "Green", 55000, 14500);
        Inventory[VehicleCount++] = new Vehicle(101126, "Jeep Wrangler", "Yellow", 30000, 16000);
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("what do you want to do ");
            System.out.println("1-List all Vehicle");
            System.out.println("2-Search by make/model");
            System.out.println("3- search by price range");
            System.out.println("4- Search by color");
            System.out.println("5-add a Vehicle");
            System.out.println("6-Quit");
            System.out.println("Enter your command");
            int command = input.nextInt();
            input.nextLine();
            switch (command) {
                case 1:
                    listAllVehicles(Inventory,VehicleCount);
                    break;
                case 2:
                    MakeModel(Inventory,VehicleCount,input);
                    break;
                case 3:
                    searchByPriceRange(Inventory,VehicleCount,input);
                    break;
                case 4:
                    searchByColor(Inventory,VehicleCount,input);
                    break;
                case 5:
                    VehicleCount=newVehicle(Inventory,input,VehicleCount);
                    break;
                case 6:
                    System.out.println("Good Bye!");
                    return;
            }

        }


    }

    public static void listAllVehicles(Vehicle[] Inventory, int VehicleCount) {
        for (int i = 0; i < VehicleCount; i++) {
            System.out.println("Vehicle Id:" + Inventory[i].getVehicleID());
            System.out.println("Make &Model: " + Inventory[i].getMakeModel());
            System.out.println("Color:" + Inventory[i].getColor());
            System.out.println("Odometer Reading: " + Inventory[i].getOdometerReading());
            System.out.println("price: " + Inventory[i].getPrice());
            System.out.println("....................................................");
        }

    }

    public static void MakeModel(Vehicle[] Inventory, int VehicleCount, Scanner input) {
        System.out.println("Enter make/Model to search: ");
        String searchTerm = input.nextLine();
        for (int i = 0; i < VehicleCount; i++) {
            if (Inventory[i].getMakeModel().equalsIgnoreCase(searchTerm)) {
                System.out.println("Match found:");
                System.out.println("Vehicle ID: " + Inventory[i].getVehicleID());
                System.out.println("color: " + Inventory[i].getColor());
                System.out.println("odometer: " + Inventory[i].getOdometerReading());
                System.out.println("price: $" + Inventory[i].getPrice());
                System.out.println("...................................");
                return;

            }
            System.out.println("No match found.");
        }
    }
    public static void searchByPriceRange(Vehicle[] Inventory, int vehicleCount, Scanner input) {
        System.out.print("Enter minimum price: ");
        float min = input.nextFloat();
        System.out.print("Enter maximum price: ");
        float max = input.nextFloat();
        boolean found = false;
        for (int i = 0; i < vehicleCount; i++) {
            float price = Inventory[i].getPrice();
            if (price >= min && price <= max) {
                System.out.println("Vehicle ID: " + Inventory[i].getVehicleID());
                System.out.println("Make & Model: " + Inventory[i].getMakeModel());
                System.out.println("color: " + Inventory[i].getColor());
                System.out.println("odometer: " + Inventory[i].getOdometerReading());
                System.out.println("Price: $" + price);
                System.out.println("------------------");
                found = true;
            }
        }
        if (!found) {
            System.out.println("No vehicles in that price range.");
        }
    }
    public static void searchByColor(Vehicle[]Inventory,int vehicleCount,Scanner input){
        System.out.println("Enter the color: ");
        String SearchColor=input.nextLine();
        for (int i=0;i<vehicleCount;i++){
            if (Inventory[i].getColor().equalsIgnoreCase(SearchColor)){
                System.out.println("Match found");
                System.out.println("Vehicle Id:" + Inventory[i].getVehicleID());
                System.out.println("Make &Model: " + Inventory[i].getMakeModel());
                System.out.println("Odometer Reading: " + Inventory[i].getOdometerReading());
                System.out.println("price: " + Inventory[i].getPrice());
                System.out.println("....................................................");
            }


        }
    }
    public static int newVehicle(Vehicle[]Inventory, Scanner input,int VehicleCount){
        System.out.println("Enter Vehicle Id");
        long Id=input.nextLong();
        input.nextLine();
        System.out.println("Enter Make/Model");
        String MM=input.nextLine();
        System.out.println("Enter color");
        String color=input.nextLine();
        System.out.println("Enter odometer Reading");
        int OR=input.nextInt();
        input.nextLine();
        System.out.println("Enter price");
        float price= input.nextFloat();
        input.nextLine();
        //
        Vehicle v=new Vehicle();
        v.setVehicleID(Id);
        v.setMakeModel(MM);
        v.setColor(color);
        v.setOdometerReading(OR);
        v.setPrice(price);
        Inventory[VehicleCount++]=v;
        return VehicleCount;


    }
}
