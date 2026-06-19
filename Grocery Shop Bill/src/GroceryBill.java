import java.util.Scanner;

public class GroceryBill {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Required datatypes: String, int, double, float
        String customerName;
        int loyaltyPoints;
        double item1, item2, item3;
        float finalAmount;
        final double DISCOUNT_RATE = 0.10; // 10% discount

        // 1. String validation
        System.out.print("Enter Customer Name: ");
        customerName = input.nextLine().trim();
        if (customerName.isEmpty()) {
            System.out.println("Error: Customer name cannot be empty.");
            input.close();
            return;
        }

        // 2. double validation for Item 1
        System.out.print("Enter price of item 1: ");
        if (input.hasNextDouble()) {
            item1 = input.nextDouble();
            if (item1 < 0.0) {
                System.out.println("Error: Price cannot be negative.");
                input.close();
                return;
            }
        } else {
            System.out.println("Error: Price must be a valid number.");
            input.close();
            return;
        }

        // double validation for Item 2
        System.out.print("Enter price of item 2: ");
        if (input.hasNextDouble()) {
            item2 = input.nextDouble();
            if (item2 < 0.0) {
                System.out.println("Error: Price cannot be negative.");
                input.close();
                return;
            }
        } else {
            System.out.println("Error: Price must be a valid number.");
            input.close();
            return;
        }

        // double validation for Item 3
        System.out.print("Enter price of item 3: ");
        if (input.hasNextDouble()) {
            item3 = input.nextDouble();
            if (item3 < 0.0) {
                System.out.println("Error: Price cannot be negative.");
                input.close();
                return;
            }
        } else {
            System.out.println("Error: Price must be a valid number.");
            input.close();
            return;
        }

        // Math calculations
        double total = item1 + item2 + item3;
        double discountAmount = total * DISCOUNT_RATE;
        
        // 3. float assignment
        finalAmount = (float) (total - discountAmount);

        // 4. int assignment (loyalty points: 1 point for every 10 spent)
        loyaltyPoints = (int) (finalAmount / 10.0);

        // Print receipt
        System.out.println("\n--- Grocery Receipt ---");
        System.out.println("Customer: " + customerName);
        System.out.println("Total: " + total);
        System.out.println("Discount (10%): " + discountAmount);
        System.out.println("Final Amount = " + finalAmount);
        System.out.println("Loyalty Points Earned: " + loyaltyPoints);

        input.close();
    }
}