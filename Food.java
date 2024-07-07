import java.util.Scanner;

public class Food {

    public void runRestaurantOrderingSystem() {
        Scanner sc = new Scanner(System.in);
        int choice;
        int totalBill = 0;
        boolean ordering = true;

        while (ordering) {
            displayMainMenu();
            choice = getIntInput(sc, "Enter your choice (1-4): ", 1, 4);

            switch (choice) {
                case 1:
                    totalBill += handleMenu(sc, "Breakfast");
                    break;
                case 2:
                    totalBill += handleMenu(sc, "Lunch");
                    break;
                case 3:
                    totalBill += handleMenu(sc, "Dinner");
                    break;
                case 4:
                    ordering = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, 3, or 4.");
                    break;
            }
        }

        System.out.println("\nYour total bill is: " + totalBill + "/-");
        System.out.println("Thank you for dining with us!");
        sc.close();
    }

    public static void displayMainMenu() {
        System.out.println("\nSelect Menu:");
        System.out.println("1. Breakfast");
        System.out.println("2. Lunch");
        System.out.println("3. Dinner");
        System.out.println("4. Finish and Calculate Total");
    }

    public static int handleMenu(Scanner sc, String menuName) {
        int total = 0;
        int choice;
        boolean ordering = true;

        while (ordering) {
            displayMenu(menuName);
            choice = getIntInput(sc, "Enter your choice (0 to go back): ", 0, 18);

            switch (choice) {
                case 0:
                    ordering = false;
                    break;
                case 1:
                    total += 100;
                    break;
                case 2:
                    total += 150;
                    break;
                case 3:
                    total += 250;
                    break;
                case 4:
                    total += 100;
                    break;
                case 5:
                    total += 200;
                    break;
                case 6:
                    total += 300;
                    break;
                case 7:
                    total += 400;
                    break;
                case 8:
                    total += 450;
                    break;
                case 9:
                    total += 950;
                    break;
                case 10:
                    total += 300;
                    break;
                case 11:
                    total += 100;
                    break;
                case 12:
                    total += 1200;
                    break;
                case 13:
                    total += 350;
                    break;
                case 14:
                    total += 500;
                    break;
                case 15:
                    total += 800;
                    break;
                case 16:
                    total += 300;
                    break;
                case 17:
                    total += 200;
                    break;
                case 18:
                    total += 150;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
            if (ordering) {
                // Ask if they want to order more
                System.out.print("Do you want to order more from " + menuName + "? (yes/no): ");
                String response = sc.next();
                if (!response.equalsIgnoreCase("yes")) {
                    ordering = false;
                }
            }
        }
        return total;
    }

    public static void displayMenu(String menuName) {
        System.out.println("\n" + menuName + " Menu:");
        switch (menuName) {
            case "Breakfast":
                System.out.println("1. FLATBREAD = 100/-");
                System.out.println("2. sandwich = 150/-");
                System.out.println("3. BREAD WITH TOAST = 250/-");
                System.out.println("4. TEA = 100/-");
                System.out.println("5. COFFEE = 200/-");
                System.out.println("6. JUICES = 300/-");
                break;
            case "Lunch":
                System.out.println("7. GRILLED CHICKEN = 400/-");
                System.out.println("8. CHICKEN BIRYANI = 450/-");
                System.out.println("9. GRILLED STEAK = 950/-");
                System.out.println("10. BAKED SWEET POTATO = 300/-");
                System.out.println("11. SOFT DRINKS = 100/-");
                System.out.println("12. BLACK TEA = 1200/-");
                break;
            case "Dinner":
                System.out.println("13. PASTA = 350/-");
                System.out.println("14. GRILLED FISH = 500/-");
                System.out.println("15. STEAK WITH VEGETABLES = 800/-");
                System.out.println("16. VEGETABLE RISOTTO = 300/-");
                System.out.println("17. GREEN TEA = 200/-");
                System.out.println("18. DESSERT = 150/-");
                break;
        }
        System.out.println("0. Back to main menu");
    }

    public static int getIntInput(Scanner sc, String prompt, int min, int max) {
        int input = -1;
        boolean validInput = false;

        while (!validInput) {
            System.out.print(prompt);
            if (sc.hasNextInt()) {
                input = sc.nextInt();
                if (input >= min && input <= max) {
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Please enter a number between " + min + " and " + max + ".");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                sc.next(); // clear the invalid input
            }
        }
        return input;
    }
}