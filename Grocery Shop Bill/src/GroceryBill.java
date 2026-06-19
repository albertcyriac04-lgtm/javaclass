/**
 * GroceryBill calculates the total cost of three grocery items,
 * applies a flat 10% discount, and computes the final payable amount.
 */
import java.util.Scanner;

public class GroceryBill {

    public static void main(String[] args) {
        // Instantiate Scanner for console input streams
        Scanner input = new Scanner(System.in);

        // Constant declaring a 10% global discount rate
        final double DISCOUNT_RATE = 0.10;

        // Declarations for price tracking variables
        double item1, item2, item3; // Prices of individual grocery items
        double total;               // Sum total price of all items
        double discountAmount;      // Total amount deducted by discount
        double finalAmount;         // Final payable bill amount

        // Interactive User Interface Inputs for 3 items
        System.out.print("Enter price of item 1: ");
        item1 = input.nextDouble();

        System.out.print("Enter price of item 2: ");
        item2 = input.nextDouble();

        System.out.print("Enter price of item 3: ");
        item3 = input.nextDouble();

        // Mathematical pipelines for bill calculation
        // Calculate the raw sum total of item prices
        total = item1 + item2 + item3;
        // Calculate the discount amount based on the rate constant
        discountAmount = total * DISCOUNT_RATE;
        // Subtract discount from total to get the final bill amount
        finalAmount = total - discountAmount;

        // Display results to the console
        System.out.println("Total = " + total);
        System.out.println("Discount = " + discountAmount);
        System.out.println("Final Amount = " + finalAmount);

        // Close scanner to release system resources
        input.close();
    }
}