import java.util.Scanner;

public class RestaurantBill {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Required datatypes: String, int, double, float
        String dishName;
        int quantity;
        double unitPrice;
        float totalBill;

        // 1. String validation
        System.out.print("Enter name of the dish ordered: ");
        dishName = input.nextLine().trim();
        if (dishName.isEmpty()) {
            System.out.println("Error: Dish name cannot be empty.");
            input.close();
            return;
        }

        // 2. int validation
        System.out.print("Enter quantity: ");
        if (input.hasNextInt()) {
            quantity = input.nextInt();
            if (quantity <= 0) {
                System.out.println("Error: Quantity must be at least 1.");
                input.close();
                return;
            }
        } else {
            System.out.println("Error: Quantity must be a valid integer.");
            input.close();
            return;
        }

        // 3. double validation
        System.out.print("Enter unit price: ");
        if (input.hasNextDouble()) {
            unitPrice = input.nextDouble();
            if (unitPrice <= 0) {
                System.out.println("Error: Unit price must be greater than zero.");
                input.close();
                return;
            }
        } else {
            System.out.println("Error: Unit price must be a valid number.");
            input.close();
            return;
        }

        // Calculate cost breakdown
        double foodCost = unitPrice * quantity;
        double gst = foodCost * 0.05; // 5% GST
        double serviceCharge = foodCost * 0.10; // 10% Service Charge
        
        // 4. float conversion for final bill
        totalBill = (float) (foodCost + gst + serviceCharge);

        // Display results
        System.out.println("\n--- Receipt ---");
        System.out.println("Dish: " + dishName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Unit Price: " + unitPrice);
        System.out.println("GST (5%): " + gst);
        System.out.println("Service Charge (10%): " + serviceCharge);
        System.out.println("Final Bill = " + totalBill);

        input.close();
    }
}
