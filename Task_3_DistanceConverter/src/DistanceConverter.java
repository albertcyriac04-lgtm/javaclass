import java.util.Scanner;

public class DistanceConverter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Required datatypes: String, int, double, float
        String unitName = "Kilometers";
        int conversionFactor = 1000;
        double kilometers;
        float meters;
        double centimeters;

        System.out.print("Enter distance in km: ");
        if (input.hasNextDouble()) {
            kilometers = input.nextDouble();
            
            // Simple validation: distance must be non-negative
            if (kilometers >= 0) {
                // Perform conversions
                meters = (float) (kilometers * conversionFactor);
                centimeters = meters * 100.0;

                System.out.println("Input Unit: " + unitName);
                System.out.println("Meters = " + meters + " m");
                System.out.println("Centimeters = " + centimeters + " cm");
            } else {
                System.out.println("Error: Distance cannot be negative.");
            }
        } else {
            System.out.println("Error: Invalid input. Please enter a valid number.");
        }

        input.close();
    }
}
