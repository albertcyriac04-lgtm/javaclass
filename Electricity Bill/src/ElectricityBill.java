import java.util.Scanner;

public class ElectricityBill {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Required datatypes: String, int, double, float
        String consumerName;
        int units;
        double ratePerUnit = 9.5;
        float billAmount;

        // 1. String validation
        System.out.print("Enter consumer name: ");
        consumerName = input.nextLine().trim();
        if (consumerName.isEmpty()) {
            System.out.println("Error: Consumer name cannot be empty.");
            input.close();
            return;
        }

        // 2. int validation
        System.out.print("Enter units consumed: ");
        if (input.hasNextInt()) {
            units = input.nextInt();
            if (units < 0) {
                System.out.println("Error: Units consumed cannot be negative.");
                input.close();
                return;
            }
        } else {
            System.out.println("Error: Units consumed must be a valid integer.");
            input.close();
            return;
        }

        // 3. double & float calculations
        billAmount = (float) (units * ratePerUnit);

        // Display results
        System.out.println("\n--- Electricity Bill Receipt ---");
        System.out.println("Consumer Name: " + consumerName);
        System.out.println("Units Consumed: " + units);
        System.out.println("Rate Per Unit: " + ratePerUnit);
        System.out.println("Electricity Bill Amount = " + billAmount);

        input.close();
    }
}
