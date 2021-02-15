import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String message = "Welcome! ";
        System.out.println(message);

        String firstName = "";
        String lastName = "";

        System.out.println("Enter you First name: ");
//        scanner.nextLine();
//        if(scanner.hasNextLine()){
//            firstName = scanner.nextLine();
//        }
        firstName = scanner.nextLine();

        System.out.println("Enter your Last Name: ");
//        scanner.nextLine();
//        if(scanner.hasNextLine()){
//            lastName = scanner.nextLine();
//        }
        lastName = scanner.nextLine();

        //System.out.println(firstName);
        //System.out.println(lastName);
        System.out.println("Your Name is: " + firstName + " " + lastName);


        //Read input from user

        //System.out.println("Enter Username: ");

        //String username = scanner.nextLine();
    }
}
