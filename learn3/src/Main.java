import java.util.Scanner;

/**
 * Main demonstrates basic console inputs, step-by-step validations,
 * and calculations without using loops.
 *
 * This program demonstrates standard Java variables, simple input validations
 * without using loops, and resource management. It utilizes four distinct 
 * data types: String, int, double, and float.
 */
public class Main {

    /**
     * Entry point of the learn3 Main application.
     * Prompts the user for category, count, limit, and actual values, performs
     * validation checks, and prints a final status report.
     *
     * @param args Command-line arguments (not used in this application).
     */
    public static void main(String[] args) {
        // Instantiate a Scanner object to read user input from the console standard input stream
        Scanner input = new Scanner(System.in);

        // --- Data Type Declarations ---
        
        // String data type: Stores the user-defined category or type label
        String messageType;
        
        // int data type: Stores the quantity or item count
        int count;
        
        // double data type: Stores the high-precision limit value for validation threshold
        double limitValue;
        
        // float data type: Stores the actual float value compared against the limit
        float actualValue;

        // Prompt the user to enter the category name
        System.out.print("Enter category/type: ");
        // Read and trim whitespace from category input
        messageType = input.nextLine().trim();
        
        // Validation Step 1: Check if category string is empty
        if (messageType.isEmpty()) {
            System.out.println("Error: Category cannot be empty.");
            input.close();
            return; // Terminate execution early due to validation failure
        }

        // Prompt the user to enter item count
        System.out.print("Enter item count: ");
        
        // Validation Step 2: Check if item count is a valid integer
        if (input.hasNextInt()) {
            count = input.nextInt();
            
            // Check if count is a positive non-zero value
            if (count <= 0) {
                System.out.println("Error: Count must be greater than zero.");
                input.close();
                return; // Terminate execution early due to validation failure
            }
        } else {
            System.out.println("Error: Count must be a valid integer.");
            input.close();
            return; // Terminate execution early due to validation failure
        }

        // Prompt the user to enter limit value
        System.out.print("Enter limit value: ");
        
        // Validation Step 3: Check if limit input is a valid double
        if (input.hasNextDouble()) {
            limitValue = input.nextDouble();
            
            // Check if limit is a positive non-zero value
            if (limitValue <= 0.0) {
                System.out.println("Error: Limit must be greater than zero.");
                input.close();
                return; // Terminate execution early due to validation failure
            }
        } else {
            System.out.println("Error: Limit must be a valid decimal number.");
            input.close();
            return; // Terminate execution early due to validation failure
        }

        // Prompt the user to enter actual value
        System.out.print("Enter actual value: ");
        
        // Validation Step 4: Check if actual value input is a valid float
        if (input.hasNextFloat()) {
            actualValue = input.nextFloat();
            
            // Validate that actual value is non-negative
            if (actualValue < 0.0f) {
                System.out.println("Error: Actual value cannot be negative.");
                input.close();
                return; // Terminate execution early due to validation failure
            }
        } else {
            System.out.println("Error: Actual value must be a valid float.");
            input.close();
            return; // Terminate execution early due to validation failure
        }

        // Display the formatted category status report
        System.out.println("\n--- Status Report ---");
        System.out.println("Category: " + messageType);
        System.out.println("Count: " + count);
        System.out.println("Limit: " + limitValue);
        System.out.println("Actual: " + actualValue);

        // Close the scanner object to free up associated system resources
        input.close();
    }
}
