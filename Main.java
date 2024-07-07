import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Login l1 = new Login();
        Bookings b1 = new Bookings();
        Room r1 = new Room();
        Roomservice s1 = new Roomservice();
        Feedback f1 = new Feedback();
        Food f3 = new Food();
        Scanner input = new Scanner(System.in);

        System.out.println("****----Welcome To The SAZ Hotel And Restaurant----****");
        System.out.println("Press R If You Are a new user and want to register");
        System.out.println("");
        System.out.println("Already A Member? Press Any Key To Continue To Login");

        if (input.nextLine().equalsIgnoreCase("R")) {
            System.out.println("");
            System.out.println("Please Register To Become SAZ User");
            System.out.println("");
            l1.Reglogin();
            l1.checkLogin();
        } else {
            System.out.println("");
            System.out.println("Please Login To Continue");
            System.out.println("");
            l1.checkLogin();
        }

        while (true) {
            System.out.println("Please Select Your Choice by entering the number" + "\n" + "1. Book Room" + "\n" + "2. Book Food" + "\n" + "3. Customer And Food Service" + "\n" + "4. Feedback" + "\n" + "5. Exit");
            int num;

            // Handle potential input mismatch (non-integer input)
            if (input.hasNextInt()) {
                num = input.nextInt();
                input.nextLine(); // Consume the newline character
            } else {
                System.out.println("Invalid input. Please enter a number.");
                input.next(); // Consume the invalid input
                continue; // Skip to the next iteration of the loop
            }

            if (num == 1) {
                System.out.println("1.   For Booking Please fill the form below");
                System.out.println("");
                b1.bookings();
                System.out.println("Thanks for Filling Out The Form");
                System.out.println("Your information is safe and we will never share it with anyone");
                System.out.println("");
                // System.out.println("");
                r1.roombooking();
            } else if (num == 2) {
                f3.runRestaurantOrderingSystem();
            } else if (num == 3) {
                System.out.println("Thanks for Choosing Roomservices");
                s1.Roomservices();
            } else if (num == 4) {
                f1.feedback();
            } else if (num == 5) {
                System.out.println("Thanks for visiting. You Have Taken An Exit");
                break; // Exit the loop and the program
            } else {
                System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }
        input.close();
    }
}