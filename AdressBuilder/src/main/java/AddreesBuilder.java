import java.util.Scanner;

public class AddreesBuilder {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Please provide the following information:");
            System.out.println("Full name:");
            String name = input.nextLine().trim();
            String[] fullName=name.split(" ");
            System.out.println("Billing Street:");
            String BillingStreet=input.nextLine().trim();
            System.out.println("Billing City:");
            String BillingCity=input.nextLine().trim();
            System.out.println("Billing State");
            String BillingState=input.nextLine();
            System.out.println("Billing Zip:");
            int BillingZip=input.nextInt();
            input.nextLine();
            System.out.println("Shipping Street:");
            String ShippingStreet=input.nextLine();
            System.out.println("Shipping City:");
            String ShippingCity=input.nextLine();
            System.out.println("Shipping State:");
            String ShippingState=input.nextLine();
            System.out.println("Shipping Zip");
            int ShippingZip= input.nextInt();
            input.nextLine();

            StringBuilder Address=new StringBuilder();
            for (String part:fullName){
                Address.append(capitalize(part)).append(" ");
            }
            Address.append("\n\n");
            Address.append("Billing Address:").append("\n");
            Address.append(BillingStreet).append("\n");
            Address.append(BillingCity).append(",").append(BillingState).append(" ").append(BillingZip).append("\n\n");
            Address.append("Shipping Address:\n");
            Address.append(ShippingStreet).append("\n");
            Address.append(ShippingCity).append(",").append(ShippingState).append(" ").append(ShippingZip).append("\n");
            String fullAddress=Address.toString();
            System.out.println(fullAddress);

        }
        public static String capitalize(String name){
            return    name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        }
    }


