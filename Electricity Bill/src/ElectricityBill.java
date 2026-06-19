import java.util.Scanner;

/**
 * ElectricityBill calculates the electricity bill amount based on
 * units consumed and a fixed rate per unit.
 *
 * This program demonstrates standard Java variables and calculations.
 * It utilizes four distinct data types: String, int, double, and float.
 */
public class ElectricityBill {

    /**
     * Entry point of the ElectricityBill application.
     * Prompts the user for consumer details and units consumed,
     * calculates the total bill amount, and displays a summary.
     *
     * @param args Command-line arguments (not used in this application).
     */
    public static void main(String[] args) {
        // Instantiate a Scanner object to read user input from the console standard input stream
        Scanner input = new Scanner(System.in);

        // --- Data Type Declarations ---
        
        // String data type: Stores the full name of the electricity consumer
        String consumerName;
        
        // int data type: Stores the total number of electricity units consumed
        int units;
        
        // double data type: Stores the constant rate charged per unit (9.5 units/currency)
        double ratePerUnit = 9.5;
        
        // float data type: Stores the final calculated electricity bill amount
        float billAmount;

        // Prompt the user to enter consumer name
        System.out.print("Enter consumer name: ");
        consumerName = input.nextLine();

        // Prompt the user to enter units consumed
        System.out.print("Enter units consumed: ");
        units = input.nextInt();

        // Perform calculation: multiply units consumed by the unit price rate
        // Cast the double calculation to a float to match the billAmount variable's datatype
        billAmount = (float) (units * ratePerUnit);

        // Display the formatted electricity bill details to standard output
        System.out.println("\n--- Electricity Bill Receipt ---");
        System.out.println("Consumer Name: " + consumerName);
        System.out.println("Units Consumed: " + units);
        System.out.println("Rate Per Unit: " + ratePerUnit);
        System.out.println("Electricity Bill Amount = " + billAmount);

        // Close the scanner object to free up associated system resources
        input.close();
    }
}
