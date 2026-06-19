/**
 * RestaurantBill computes the GST, service charge, and total restaurant bill amount
 * based on user input for food cost and predefined percentage rates.
 */
import java.util.Scanner;

public class RestaurantBill {

    public static void main(String[] args) {
        // Instantiate Scanner for console input streams
        Scanner input = new Scanner(System.in);

        // Constant values for GST (5%) and Service Charge (10%) rates
        final double GST_RATE = 0.05;
        final double SERVICE_RATE = 0.10;

        // Declarations for financial components
        double foodCost;      // Base cost of the food items (user input)
        double gst;           // Calculated Goods and Services Tax (5%)
        double serviceCharge; // Calculated service charge (10%)
        double total;         // Final bill amount (food + GST + service charge)

        // Read food cost input
        System.out.print("Enter food cost: ");
        foodCost = input.nextDouble();

        // Calculate GST and Service Charge allowances
        gst = foodCost * GST_RATE;
        serviceCharge = foodCost * SERVICE_RATE;

        // Calculate total bill amount
        total = foodCost + gst + serviceCharge;

        // Print receipt breakdown to the console
        System.out.println("GST = " + gst);
        System.out.println("Service Charge = " + serviceCharge);
        System.out.println("Final Bill = " + total);

        // Close scanner to release system resources
        input.close();
    }
}


