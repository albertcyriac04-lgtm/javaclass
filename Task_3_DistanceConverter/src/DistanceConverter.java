import java.util.Scanner;

/**
 * DistanceConverter converts a user-entered distance in kilometers
 * to meters and centimeters.
 *
 * This program demonstrates standard Java variables and calculations.
 * It utilizes four distinct data types: String, int, double, and float.
 */
public class DistanceConverter {

    /**
     * Entry point of the DistanceConverter application.
     * Prompts the user for distance in kilometers and performs 
     * unit conversion to meters and centimeters.
     *
     * @param args Command-line arguments (not used in this application).
     */
    public static void main(String[] args) {
        // Instantiate a Scanner object to read user input from the console standard input stream
        Scanner input = new Scanner(System.in);

        // --- Data Type Declarations ---
        
        // String data type: Defines the label of the base unit of distance
        String unitName = "Kilometers";
        
        // int data type: Represents the conversion factor from kilometers to meters (1000m = 1km)
        int conversionFactor = 1000;
        
        // double data type: Stores the user input distance in kilometers
        double kilometers;
        
        // float data type: Stores the calculated distance in meters
        float meters;
        
        // double data type: Stores the calculated distance in centimeters
        double centimeters;

        // Prompt the user to enter the distance value in kilometers
        System.out.print("Enter distance in km: ");
        kilometers = input.nextDouble();
        
        // Perform conversion calculations
        // Convert kilometers to meters using the int conversion factor, casting the result to float
        meters = (float) (kilometers * conversionFactor);
        // Convert meters to centimeters (100 centimeters = 1 meter)
        centimeters = meters * 100.0;

        // Print the converted values along with unit metadata
        System.out.println("Input Unit: " + unitName);
        System.out.println("Meters = " + meters + " m");
        System.out.println("Centimeters = " + centimeters + " cm");

        // Close the scanner object to free up associated system resources
        input.close();
    }
}
