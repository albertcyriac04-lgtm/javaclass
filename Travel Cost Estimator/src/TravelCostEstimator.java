/**
 * TravelCostEstimator calculates the total fuel needed and the estimated cost
 * of a trip based on user input for distance, mileage, and petrol price.
 */
import java.util.Scanner;

public class TravelCostEstimator {

    public static void main(String[] args) {
        // Create Scanner object to read inputs from the standard input stream (console)
        Scanner input = new Scanner(System.in);

        // Declare variables to store input parameters and calculated results
        double distance;    // Distance of the travel in kilometers
        double mileage;     // Vehicle mileage in kilometers per liter
        double petrolPrice; // Price of petrol per liter
        double fuelNeeded;  // Total fuel needed for the trip (liters)
        double cost;        // Total estimated fuel cost

        // Prompt user and read distance
        System.out.print("Enter distance in km: ");
        distance = input.nextDouble();

        // Prompt user and read mileage
        System.out.print("Enter mileage (km/litre): ");
        mileage = input.nextDouble();

        // Prompt user and read petrol price
        System.out.print("Enter petrol price per litre: ");
        petrolPrice = input.nextDouble();

        // Calculate the fuel needed and total cost of the trip
        // Fuel needed = total distance divided by mileage
        fuelNeeded = distance / mileage;
        // Total cost = fuel needed multiplied by the price of petrol per liter
        cost = fuelNeeded * petrolPrice;

        // Display results to the console
        System.out.println("Fuel needed = " + fuelNeeded + " litres");
        System.out.println("Cost = " + cost);

        // Close the scanner resource to avoid memory leaks
        input.close();
    }
}