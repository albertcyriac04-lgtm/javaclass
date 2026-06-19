import java.util.Scanner;

/**
 * TemperatureConverter is a utility class designed to convert temperature readings
 * from Celsius to Fahrenheit. 
 *
 * This program demonstrates standard Java variables, simple input validations
 * without using loops, and resource management. It utilizes four distinct 
 * data types: String, int, double, and float.
 */
public class TemperatureConverter {

    /**
     * Entry point of the TemperatureConverter application.
     * Prompts the user for Celsius input, validates it, and outputs the Fahrenheit conversion.
     *
     * @param args Command-line arguments (not used in this application).
     */
    public static void main(String[] args) {
        // Instantiate a Scanner object to read user input from the console standard input stream
        Scanner input = new Scanner(System.in);

        // --- Data Type Declarations ---
        
        // String data type: Defines the label of the base temperature scale being converted from
        String scale = "Celsius";
        
        // int data type: Represents the approximate physical absolute zero limit in Celsius (-273°C)
        int lowerLimit = -273;
        
        // double data type: Stores the high-precision user input temperature in Celsius
        double celsius;
        
        // float data type: Stores the final calculated temperature in Fahrenheit after conversion
        float fahrenheit;

        // Prompt the user to enter a numeric temperature value
        System.out.print("Enter temperature in Celsius: ");

        // Validation Step 1: Check if the user entered a valid numeric value (double)
        if (input.hasNextDouble()) {
            // Read and assign the user's input to the celsius variable
            celsius = input.nextDouble();

            // Validation Step 2: Validate the physical limit constraint (must be greater than or equal to absolute zero)
            if (celsius >= lowerLimit) {
                // Apply Celsius to Fahrenheit conversion formula: (C * 9/5) + 32
                // Cast the high-precision double result to a float to match the fahrenheit variable's datatype
                fahrenheit = (float) ((celsius * 9.0 / 5.0) + 32.0);

                // Print the converted temperature output along with the scale metadata
                System.out.println("Fahrenheit (" + scale + " conversion) = " + fahrenheit);
            } else {
                // Handle out-of-bounds validation error (temperature below absolute zero)
                System.out.println("Error: Temperature cannot be below " + lowerLimit + "°C.");
            }
        } else {
            // Handle input type validation error (non-numeric input)
            System.out.println("Error: Invalid input. Please enter a valid number.");
        }

        // Close the scanner object to free up associated system resources and prevent memory leaks
        input.close();
    }
}