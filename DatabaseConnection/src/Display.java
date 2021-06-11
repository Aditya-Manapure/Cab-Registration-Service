import oracle.net.jdbc.TNSAddress.SchemaObjectFactoryInterface;

import java.util.Scanner;

public class Display {
    Scanner scanner = new Scanner(System.in);
    public void displayLoginPage() {
        System.out.println();
        System.out.println("Welcome to Quick-Safe Cabs");
        System.out.println();

        System.out.println("Press 1 to Login");
        System.out.println("Press 2 to Sign Up");
        System.out.println();

        System.out.println("Enter your choice: ");
    }

    public Login loginPage(){
        System.out.println("Enter your User Name: ");
        String username = scanner.nextLine();
        System.out.println("Enter your Password: ");
        String password = scanner.nextLine();
        return new Login(username, password);
    }

    public Customer register() {
        String name;
        String username;
        String password;
        String contactNumber;
        String email;
        String city;
        int rating;

        System.out.println("Please Enter the following details");
        System.out.print("Name: ");
        name = scanner.nextLine();

        System.out.print("Username: ");
        username = scanner.nextLine();

        System.out.print("Password: ");
        password = scanner.nextLine();

        System.out.print("Contact Number: ");
        contactNumber = scanner.nextLine();

        System.out.print("Email: ");
        email = scanner.nextLine();

        System.out.println("City: ");
        city = scanner.nextLine();

        rating = 3;

        return new Customer(name, username, password, contactNumber, email, city, rating);
    }
}
