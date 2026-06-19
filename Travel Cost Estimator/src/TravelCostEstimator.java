import java.util.Scanner;

/**
 * TravelCostEstimator calculates the total fuel needed and the estimated cost
 * of a trip based on user inputs for distance, mileage, and petrol price.
 *
 * This program demonstrates standard Java variables, simple input validations
 * without using loops, and resource management. It utilizes four distinct 
 * data types: String, int, double, and float.
 */
public class TravelCostEstimator {

    /**
     * Entry point of the TravelCostEstimator application.
     * Prompts the user for destination, trip duration, distance, vehicle mileage, 
     * and fuel price, performs step-by-step validations, and outputs the calculated travel costs.
     *
     * @param args Command-line arguments (not used in this application).
     */
    public static void main(String[] args) {
        // Instantiate a Scanner object to read user input from the console standard input stream
        Scanner input = new Scanner(System.in);

        // --- Data Type Declarations ---
        
        // String data type: Stores the name of the travel destination entered by the user
        String destination;
        
        // int data type: Stores the total duration of the trip in days
        int tripDays;
        
        // double data type: Stores the total travel distance of the trip in kilometers
        double distance;
        
        // double data type: Stores the vehicle fuel economy (mileage) in kilometers per liter
        double mileage;
        
        // double data type: Stores the price of petrol per liter in local currency
        double petrolPrice;
        
        // float data type: Stores the final calculated total cost of petrol for the trip
        float totalCost;

        // Prompt the user to enter the destination name
        System.out.print("Enter trip destination: ");
        // Read the string input and trim leading/trailing whitespace
        destination = input.nextLine().trim();
        
        // Validation Step 1: Check if the destination string is empty
        if (destination.isEmpty()) {
            System.out.println("Error: Destination cannot be empty.");
            input.close();
            return; // Terminate execution early due to validation failure
        }

        // Prompt the user to enter the duration of the trip
        System.out.print("Enter trip duration in days: ");
        
        // Validation Step 2: Check if the input is a valid integer
        if (input.hasNextInt()) {
            tripDays = input.nextInt();
            
            // Check if the trip duration is physically possible (at least 1 day)
            if (tripDays <= 0) {
                System.out.println("Error: Trip duration must be at least 1 day.");
                input.close();
                return; // Terminate execution early due to validation failure
            }
        } else {
            System.out.println("Error: Duration must be a valid integer.");
            input.close();
            return; // Terminate execution early due to validation failure
        }

        // Prompt the user to enter the distance in kilometers
        System.out.print("Enter distance in km: ");
        
        // Validation Step 3: Check if the input is a valid double
        if (input.hasNextDouble()) {
            distance = input.nextDouble();
            
            // Check if the distance value is positive and greater than zero
            if (distance <= 0) {
                System.out.println("Error: Distance must be greater than zero.");
                input.close();
                return; // Terminate execution early due to validation failure
            }
        } else {
            System.out.println("Error: Distance must be a valid number.");
            input.close();
            return; // Terminate execution early due to validation failure
        }

        // Prompt the user to enter the vehicle mileage
        System.out.print("Enter mileage (km/litre): ");
        
        // Validation Step 4: Check if the input is a valid double
        if (input.hasNextDouble()) {
            mileage = input.nextDouble();
            
            // Check if the mileage value is positive and greater than zero to prevent division by zero
            if (mileage <= 0) {
                System.out.println("Error: Mileage must be greater than zero.");
                input.close();
                return; // Terminate execution early due to validation failure
            }
        } else {
            System.out.println("Error: Mileage must be a valid number.");
            input.close();
            return; // Terminate execution early due to validation failure
        }

        // Prompt the user to enter the price of petrol per liter
        System.out.print("Enter petrol price per litre: ");
        
        // Validation Step 5: Check if the input is a valid double
        if (input.hasNextDouble()) {
            petrolPrice = input.nextDouble();
            
            // Check if the price value is positive and greater than zero
            if (petrolPrice <= 0) {
                System.out.println("Error: Petrol price must be greater than zero.");
                input.close();
                return; // Terminate execution early due to validation failure
            }
        } else {
            System.out.println("Error: Petrol price must be a valid number.");
            input.close();
            return; // Terminate execution early due to validation failure
        }

        // Calculate the total fuel needed for the trip (distance divided by mileage)
        double fuelNeeded = distance / mileage;
        
        // Calculate total cost and cast to float to match the datatype of the totalCost variable
        totalCost = (float) (fuelNeeded * petrolPrice);

        // Display formatted travel cost summary output
        System.out.println("\n--- Travel Cost Estimation ---");
        System.out.println("Destination: " + destination);
        System.out.println("Trip Duration: " + tripDays + " days");
        System.out.println("Fuel needed: " + (float) fuelNeeded + " litres");
        System.out.println("Total estimated cost: " + totalCost);

        // Close the scanner object to free up associated system resources
        input.close();
    }
}