import java.util.Scanner;

/**
 * Main represents a basic Java application structure with custom validations
 * and datatype checks without using any loops.
 *
 * This program demonstrates standard Java variables, simple input validations
 * without using loops, and resource management. It utilizes four distinct 
 * data types: String, int, double, and float.
 */
public class Main {

    /**
     * Entry point of the bare minimum Main application.
     * Prompts the user for custom codes and decimal values, performs checks,
     * and prints output using the required datatypes.
     *
     * @param args Command-line arguments (not used in this application).
     */
    public static void main(String[] args) {
        // Instantiate a Scanner object to read user input from the console standard input stream
        Scanner input = new Scanner(System.in);

        // --- Data Type Declarations ---
        
        // String data type: Defines the application name metadata
        String appName = "Bare Minimum App";
        
        // int data type: Stores a unique user-entered run code
        int runCode;
        
        // double data type: Stores the high-precision decimal input value
        double inputVal;
        
        // float data type: Stores the calculated final result value
        float resultVal;

        // Print welcome header to standard output
        System.out.println("Running: " + appName);
        
        // Prompt user to enter an integer run code
        System.out.print("Enter integer code: ");
        
        // Validation Step 1: Check if run code input is a valid integer
        if (input.hasNextInt()) {
            runCode = input.nextInt();
            
            // Validate that the code value is positive
            if (runCode > 0) {
                // Prompt user to enter a decimal value
                System.out.print("Enter decimal value: ");
                
                // Validation Step 2: Check if value input is a valid double
                if (input.hasNextDouble()) {
                    inputVal = input.nextDouble();
                    
                    // Perform computation and cast double output to a float
                    resultVal = (float) (inputVal * runCode);
                    
                    // Display calculation results
                    System.out.println("Result: " + resultVal);
                } else {
                    // Handle input type validation error (non-numeric input)
                    System.out.println("Error: Must be a valid decimal number.");
                }
            } else {
                // Handle out-of-bounds error (negative run code)
                System.out.println("Error: Code must be positive.");
            }
        } else {
            // Handle input type validation error (non-integer code)
            System.out.println("Error: Code must be an integer.");
        }

        // Close the scanner object to free up associated system resources
        input.close();
    }
}
