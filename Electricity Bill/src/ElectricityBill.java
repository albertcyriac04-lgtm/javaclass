import java.util.Scanner;

/**
 * ElectricityBill calculates the electricity bill amount based on
 * units consumed and a fixed rate per unit.
 *
 * This program demonstrates standard Java variables, simple input validations
 * without using loops, and resource management. It utilizes four distinct 
 * data types: String, int, double, and float.
 */
public class ElectricityBill {

    /**
     * Entry point of the ElectricityBill application.
     * Prompts the user for consumer details and units consumed, performs validations,
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
        // Read and trim whitespace from consumer name
        consumerName = input.nextLine().trim();
        
        // Validation Step 1: Check if consumer name string is empty
        if (consumerName.isEmpty()) {
            System.out.println("Error: Consumer name cannot be empty.");
            input.close();
            return; // Terminate execution early due to validation failure
        }

        // Prompt the user to enter units consumed
        System.out.print("Enter units consumed: ");
        
        // Validation Step 2: Check if units consumed input is a valid integer
        if (input.hasNextInt()) {
            units = input.nextInt();
            
            // Check if units value is non-negative
            if (units < 0) {
                System.out.println("Error: Units consumed cannot be negative.");
                input.close();
                return; // Terminate execution early due to validation failure
            }
        } else {
            System.out.println("Error: Units consumed must be a valid integer.");
            input.close();
            return; // Terminate execution early due to validation failure
        }

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
