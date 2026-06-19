import java.util.Scanner;

/**
 * Main represents a basic Java application structure with custom variable declarations
 * and datatype checks without using any loops.
 *
 * This program demonstrates standard Java variables.
 * It utilizes four distinct data types: String, int, double, and float.
 */
public class Main {

    /**
     * Entry point of the bare minimum Main application.
     * Prompts the user for custom codes and decimal values,
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
        
        // int data type: Stores a user-entered run code
        int runCode;
        
        // double data type: Stores the high-precision decimal input value
        double inputVal;
        
        // float data type: Stores the calculated final result value
        float resultVal;

        // Print welcome header to standard output
        System.out.println("Running: " + appName);
        
        // Prompt user to enter an integer run code
        System.out.print("Enter integer code: ");
        runCode = input.nextInt();

        // Prompt user to enter a decimal value
        System.out.print("Enter decimal value: ");
        inputVal = input.nextDouble();

        // Perform computation and cast double output to a float
        resultVal = (float) (inputVal * runCode);

        // Display calculation results
        System.out.println("Result: " + resultVal);

        // Close the scanner object to free up associated system resources
        input.close();
    }
}
