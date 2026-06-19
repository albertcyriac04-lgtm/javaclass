import java.util.Scanner;

public class MobileDataUsageCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Required datatypes: String, int, double, float
        String planName;
        int daysLeft;
        double usedData;
        float remainingData;
        final double DATA_LIMIT = 30.0; // 30 GB limit

        // 1. String validation
        System.out.print("Enter your mobile plan name: ");
        planName = input.nextLine().trim();
        if (planName.isEmpty()) {
            System.out.println("Error: Plan name cannot be empty.");
            input.close();
            return;
        }

        // 2. int validation
        System.out.print("Enter days left in the billing cycle: ");
        if (input.hasNextInt()) {
            daysLeft = input.nextInt();
            if (daysLeft < 0) {
                System.out.println("Error: Days left cannot be negative.");
                input.close();
                return;
            }
        } else {
            System.out.println("Error: Days left must be a valid integer.");
            input.close();
            return;
        }

        // 3. double validation
        System.out.print("Enter data used in GB: ");
        if (input.hasNextDouble()) {
            usedData = input.nextDouble();
            if (usedData < 0.0 || usedData > DATA_LIMIT) {
                System.out.println("Error: Used data must be between 0.0 and the plan limit of " + DATA_LIMIT + " GB.");
                input.close();
                return;
            }
        } else {
            System.out.println("Error: Used data must be a valid number.");
            input.close();
            return;
        }

        // 4. float computation
        remainingData = (float) (DATA_LIMIT - usedData);

        // Display results
        System.out.println("\n--- Mobile Data Usage Summary ---");
        System.out.println("Plan Name: " + planName);
        System.out.println("Days Left: " + daysLeft + " days");
        System.out.println("Total Plan Limit: " + DATA_LIMIT + " GB");
        System.out.println("Data Used: " + usedData + " GB");
        System.out.println("Data Remaining: " + remainingData + " GB");

        input.close();
    }
}