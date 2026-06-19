import java.util.Scanner;

/**
 * RestaurantBill computes the GST, service charge, and total restaurant bill amount
 * based on user input for food item ordering details.
 *
 * This program demonstrates standard Java variables and calculations.
 * It utilizes four distinct data types: String, int, double, and float.
 */
public class RestaurantBill {

    /**
     * Entry point of the RestaurantBill application.
     * Prompts the user for dish details (name, quantity, and unit price),
     * calculates GST & service charge, and outputs the receipt.
     *
     * @param args Command-line arguments (not used in this application).
     */
    public static void main(String[] args) {
        // Instantiate a Scanner object to read user input from the console standard input stream
        Scanner input = new Scanner(System.in);

        // --- Data Type Declarations ---
        
        // String data type: Stores the name of the food dish ordered
        String dishName;
        
        // int data type: Stores the quantity of the dish ordered
        int quantity;
        
        // double data type: Stores the unit price per dish ordered
        double unitPrice;
        
        // float data type: Stores the final calculated cumulative bill amount (including taxes)
        float totalBill;

        // Prompt the user to enter the dish name
        System.out.print("Enter name of the dish ordered: ");
        dishName = input.nextLine();

        // Prompt the user to enter quantity
        System.out.print("Enter quantity: ");
        quantity = input.nextInt();

        // Prompt the user to enter unit price
        System.out.print("Enter unit price: ");
        unitPrice = input.nextDouble();

        // Calculate basic food cost (unit price multiplied by quantity)
        double foodCost = unitPrice * quantity;
        
        // Calculate Goods and Services Tax (GST) at 5% of food cost
        double gst = foodCost * 0.05;
        
        // Calculate service charge at 10% of food cost
        double serviceCharge = foodCost * 0.10;
        
        // Sum total cost components and cast to float to match totalBill's datatype
        totalBill = (float) (foodCost + gst + serviceCharge);

        // Display receipt breakdown to the standard output
        System.out.println("\n--- Receipt ---");
        System.out.println("Dish: " + dishName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Unit Price: " + unitPrice);
        System.out.println("GST (5%): " + gst);
        System.out.println("Service Charge (10%): " + serviceCharge);
        System.out.println("Final Bill = " + totalBill);

        // Close the scanner object to free up associated system resources
        input.close();
    }
}
