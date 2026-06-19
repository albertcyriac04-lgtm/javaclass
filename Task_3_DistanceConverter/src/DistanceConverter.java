/**
 * DistanceConverter converts a user-entered distance in kilometers
 * to meters and centimeters.
 */
import java.util.Scanner;

public class DistanceConverter {

    public static void main(String[] args) {
        // Instantiate Scanner for console input streams
        Scanner input = new Scanner(System.in);

        // Variable declarations for conversion values
        double kilometers;  // Input distance in kilometers (km)
        double meters;      // Output distance in meters (m)
        double centimeters; // Output distance in centimeters (cm)

        // Prompt the user for input and retrieve the value
        System.out.print("Enter distance in km: ");
        kilometers = input.nextDouble();

        // Perform conversions
        // 1 kilometer = 1000 meters
        meters = kilometers * 1000;
        // 1 meter = 100 centimeters
        centimeters = meters * 100;

        // Display results to the console
        System.out.println("Meters = " + meters);
        System.out.println("Centimeters = " + centimeters);

        // Close scanner resource to avoid potential leaks
        input.close();
    }
}
