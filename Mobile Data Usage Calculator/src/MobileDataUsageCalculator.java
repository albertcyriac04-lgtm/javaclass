import java.util.Scanner;

/**
 * MobileDataUsageCalculator computes the remaining mobile data balance
 * in gigabytes (GB) based on a default data limit and user consumption details.
 *
 * This program demonstrates standard Java variables and calculations.
 * It utilizes four distinct data types: String, int, double, and float.
 */
public class MobileDataUsageCalculator {

    /**
     * Entry point of the MobileDataUsageCalculator application.
     * Prompts the user for plan name, billing cycle days left, and used data in GB,
     * computes remaining data balance, and displays a summary.
     *
     * @param args Command-line arguments (not used in this application).
     */
    public static void main(String[] args) {
        // Instantiate a Scanner object to read user input from the console standard input stream
        Scanner input = new Scanner(System.in);

        // --- Data Type Declarations ---
        
        // String data type: Stores the name or package label of the mobile plan
        String planName;
        
        // int data type: Stores the number of days remaining in the billing cycle
        int daysLeft;
        
        // double data type: Stores the user input data consumption in GB
        double usedData;
        
        // float data type: Stores the calculated remaining data balance in GB
        float remainingData;
        
        // double constant data type: Defines the maximum data allowance limit (30 GB)
        final double DATA_LIMIT = 30.0;

        // Prompt the user to enter the plan name
        System.out.print("Enter your mobile plan name: ");
        planName = input.nextLine();

        // Prompt the user to enter days left
        System.out.print("Enter days left in the billing cycle: ");
        daysLeft = input.nextInt();

        // Prompt the user to enter data used in GB
        System.out.print("Enter data used in GB: ");
        usedData = input.nextDouble();

        // Calculate remaining data (plan limit minus consumption)
        // Cast the double calculation to a float to match the remainingData variable's datatype
        remainingData = (float) (DATA_LIMIT - usedData);

        // Display the formatted mobile plan status summary to standard output
        System.out.println("\n--- Mobile Data Usage Summary ---");
        System.out.println("Plan Name: " + planName);
        System.out.println("Days Left: " + daysLeft + " days");
        System.out.println("Total Plan Limit: " + DATA_LIMIT + " GB");
        System.out.println("Data Used: " + usedData + " GB");
        System.out.println("Data Remaining: " + remainingData + " GB");

        // Close the scanner object to free up associated system resources
        input.close();
    }
}