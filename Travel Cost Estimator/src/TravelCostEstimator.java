import java.util.Scanner;

public class TravelCostEstimator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Required datatypes: String, int, double, float
        String destination;
        int tripDays;
        double distance;
        double mileage;
        double petrolPrice;
        float totalCost;

        // 1. String validation
        System.out.print("Enter trip destination: ");
        destination = input.nextLine().trim();
        if (destination.isEmpty()) {
            System.out.println("Error: Destination cannot be empty.");
            input.close();
            return;
        }

        // 2. int validation
        System.out.print("Enter trip duration in days: ");
        if (input.hasNextInt()) {
            tripDays = input.nextInt();
            if (tripDays <= 0) {
                System.out.println("Error: Trip duration must be at least 1 day.");
                input.close();
                return;
            }
        } else {
            System.out.println("Error: Duration must be a valid integer.");
            input.close();
            return;
        }

        // 3. double validation (Distance)
        System.out.print("Enter distance in km: ");
        if (input.hasNextDouble()) {
            distance = input.nextDouble();
            if (distance <= 0) {
                System.out.println("Error: Distance must be greater than zero.");
                input.close();
                return;
            }
        } else {
            System.out.println("Error: Distance must be a valid number.");
            input.close();
            return;
        }

        // 4. double validation (Mileage)
        System.out.print("Enter mileage (km/litre): ");
        if (input.hasNextDouble()) {
            mileage = input.nextDouble();
            if (mileage <= 0) {
                System.out.println("Error: Mileage must be greater than zero.");
                input.close();
                return;
            }
        } else {
            System.out.println("Error: Mileage must be a valid number.");
            input.close();
            return;
        }

        // 5. double validation (Petrol price)
        System.out.print("Enter petrol price per litre: ");
        if (input.hasNextDouble()) {
            petrolPrice = input.nextDouble();
            if (petrolPrice <= 0) {
                System.out.println("Error: Petrol price must be greater than zero.");
                input.close();
                return;
            }
        } else {
            System.out.println("Error: Petrol price must be a valid number.");
            input.close();
            return;
        }

        // Perform calculation using float conversion
        double fuelNeeded = distance / mileage;
        totalCost = (float) (fuelNeeded * petrolPrice);

        // Print final outputs
        System.out.println("\n--- Travel Cost Estimation ---");
        System.out.println("Destination: " + destination);
        System.out.println("Trip Duration: " + tripDays + " days");
        System.out.println("Fuel needed: " + (float) fuelNeeded + " litres");
        System.out.println("Total estimated cost: " + totalCost);

        input.close();
    }
}