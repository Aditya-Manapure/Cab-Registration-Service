import java.util.Scanner;
/* =====================================================================================================
*   Author: Prathamesh Anand Mehare
*   Date: 11 June 2021
*/
public class Cab{

    ConnectionEstablishment connection = new ConnectionEstablishment();
    connection.close();

    public static void main(String[] args){
        Display d = new Display();
        d.displayLoginPage();
        int choice  = scanner.nextInt();
    }
    public static void feedback(Customer customer){
        Scanner in = new Scanner(System.in);

    }

    public void displayAvailability() {
        int suv = connection.search("Vehicles", "SUV");
        int sedan = connection.search("Vehicles", "SEDAN");

        System.out.println();
        System.out.println("Available SUV in your city: " + suv);
        System.out.println("Available Sedan in your city: " + sedan);
    }

    public boolean login() {
        Login login = new Login(d.loginPage());
        boolean success = connection.search("CustomerInfo", login.getUsername(), login.getPassword());
        if(success) {
            System.out.println("Login successful!");
            return true;
        } else {
            System.out.println("Invalid Credentials. Please try again or sign up if you don't have an account yet.");
            return false;
        }
    }

    public boolean register() {
        Customer newCustomer = new Customer(d.register);
        boolean result = connection.insert("CustomerInfo", newCustomer.getName(), newCustomer.getUsername(), newCustomer.getPassword(),
        newCustomer.getContactNumber(), newCustomer.getEmail(), newCustomer.getCity(), newCustomer.getRating());
        if(result){
            System.out.println("Registered Successfully!");
            return true;
        } else {
            System.out.println("Registration Unsuccessful");
            return false;
        }
    }
}

}