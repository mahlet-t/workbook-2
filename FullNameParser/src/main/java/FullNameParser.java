import java.util.Scanner;

public class FullNameParser {
        public static void main(String[] args) {
            int tries=0;
            Scanner input = new Scanner(System.in);
            while (tries<3){
                System.out.println("please enter your name ");
                String name = input.nextLine().trim();//get user input and remove extra spaces
                String[] parts = name.split(" ");//split the name by space
                if (parts.length == 2|| parts.length==3) {
                    String firstname =parts[0];
                    String middleName = (parts.length==3)?parts[1] :"none";
                    String lastName = (parts.length==3)?parts[2]:parts[1];
                    // Capitalize first letter and make rest lowercase
                    firstname=firstname.substring(0,1).toUpperCase()+firstname.substring(1).toLowerCase();
                    lastName=lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();
                    //only format middle name if it exists
                    if (parts.length==3){
                        middleName=middleName.substring(0,1).toUpperCase()+middleName.substring(1).toLowerCase();
                    }
                    System.out.println("First name: " + firstname);
                    System.out.println("Middle name: " + middleName);
                    System.out.println("last name: " + lastName);
                    break;// exit loop if valid
                }
                else {
                    tries++;// count as a wrong try
                }

                if (tries <3){
                    System.out.println("Invalid name format try again");
                }
                else {
                    System.out.println("Sorry, too many invalid attempts. program will stop.");
                }
            }



        }
    }


