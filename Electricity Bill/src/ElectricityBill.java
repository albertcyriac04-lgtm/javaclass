/**
 * ElectricityBill calculates the electricity bill amount based on
 * units consumed and a fixed rate per unit.
 */
import java.util.Scanner;

public class ElectricityBill {

    public static void main(String[] args) {
        // Instantiate Scanner for console input streams
        Scanner input = new Scanner(System.in);

        // Constant value representing the rate charged per unit (9.5 rupees/currency unit)
        final double RATE_PER_UNIT = 9.5;

        int units;          // Number of electricity units consumed (integer)
        double billAmount;  // Calculated total bill amount (floating-point)

        // Read units consumed input
        System.out.print("Enter units consumed: ");
        units = input.nextInt();

        // Calculate bill amount by multiplying units with rate
        billAmount = units * RATE_PER_UNIT;

        // Display the final bill amount
        System.out.println("Electricity Bill = " + billAmount);

        // Close the scanner resource to avoid memory leak
        input.close();
    }
}
