import java.util.Scanner;

/**
 * GroceryBill calculates the total cost of three grocery items,
 * applies a flat 10% discount, computes the final payable amount,
 * and calculates loyalty points.
 *
 * This program demonstrates standard Java variables and calculations.
 * It utilizes four distinct data types: String, int, double, and float.
 */
public class GroceryBill {

    /**
     * Entry point of the GroceryBill application.
     * Prompts the user for customer name and individual prices for three items,
     * calculates total and discount, and prints a receipt.
     *
     * @param args Command-line arguments (not used in this application).
     */
    public static void main(String[] args) {
        // Instantiate a Scanner object to read user input from the console standard input stream
        Scanner input = new Scanner(System.in);

        // --- Data Type Declarations ---
        
        // String data type: Stores the full name of the customer
        String customerName;
        
        // int data type: Stores the calculated loyalty points earned by the customer
        int loyaltyPoints;
        
        // double data type: Stores the individual prices of the three items
        double item1, item2, item3;
        
        // float data type: Stores the final payable bill amount after discount
        float finalAmount;
        
        // double constant data type: Defines the flat 10% discount rate
        final double DISCOUNT_RATE = 0.10;

        // Prompt the user to enter customer name
        System.out.print("Enter Customer Name: ");
        customerName = input.nextLine();

        // Prompt the user to enter the price of item 1
        System.out.print("Enter price of item 1: ");
        item1 = input.nextDouble();

        // Prompt the user to enter the price of item 2
        System.out.print("Enter price of item 2: ");
        item2 = input.nextDouble();

        // Prompt the user to enter the price of item 3
        System.out.print("Enter price of item 3: ");
        item3 = input.nextDouble();

        // Perform calculation: Sum up the individual item costs
        double total = item1 + item2 + item3;
        
        // Calculate the absolute discount deduction amount
        double discountAmount = total * DISCOUNT_RATE;
        
        // Calculate final payable amount and cast to float to match the datatype of finalAmount
        finalAmount = (float) (total - discountAmount);

        // Calculate loyalty points (1 loyalty point is earned for every 10 currency units spent)
        // Cast the double calculation to an int to match the loyaltyPoints datatype
        loyaltyPoints = (int) (finalAmount / 10.0);

        // Display the formatted receipt details to standard output
        System.out.println("\n--- Grocery Receipt ---");
        System.out.println("Customer: " + customerName);
        System.out.println("Total: " + total);
        System.out.println("Discount (10%): " + discountAmount);
        System.out.println("Final Amount = " + finalAmount);
        System.out.println("Loyalty Points Earned: " + loyaltyPoints);

        // Close the scanner object to free up associated system resources
        input.close();
    }
}