import java.util.Scanner;

/**
 * MobileDataUsageCalculator computes the remaining mobile data balance
 * in gigabytes (GB) based on a default data limit and user consumption details.
 *
 * This program demonstrates standard Java variables, simple input validations
 * without using loops, and resource management. It utilizes four distinct 
 * data types: String, int, double, and float.
 */
public class MobileDataUsageCalculator {

    /**
     * Entry point of the MobileDataUsageCalculator application.
     * Prompts the user for plan name, billing cycle days left, and used data in GB,
     * performs validations, computes remaining data balance, and displays a summary.
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
        // Read and trim whitespace from mobile plan name
        planName = input.nextLine().trim();
        
        // Validation Step 1: Check if plan name string is empty
        if (planName.isEmpty()) {
            System.out.println("Error: Plan name cannot be empty.");
            input.close();
            return; // Terminate execution early due to validation failure
        }

        // Prompt the user to enter days left
        System.out.print("Enter days left in the billing cycle: ");
        
        // Validation Step 2: Check if days left input is a valid integer
        if (input.hasNextInt()) {
            daysLeft = input.nextInt();
            
            // Check if days left is non-negative
            if (daysLeft < 0) {
                System.out.println("Error: Days left cannot be negative.");
                input.close();
                return; // Terminate execution early due to validation failure
            }
        } else {
            System.out.println("Error: Days left must be a valid integer.");
            input.close();
            return; // Terminate execution early due to validation failure
        }

        // Prompt the user to enter data used in GB
        System.out.print("Enter data used in GB: ");
        
        // Validation Step 3: Check if used data input is a valid double
        if (input.hasNextDouble()) {
            usedData = input.nextDouble();
            
            // Validate that used data lies between 0.0 and the subscription limit (DATA_LIMIT)
            if (usedData < 0.0 || usedData > DATA_LIMIT) {
                System.out.println("Error: Used data must be between 0.0 and the plan limit of " + DATA_LIMIT + " GB.");
                input.close();
                return; // Terminate execution early due to validation failure
            }
        } else {
            System.out.println("Error: Used data must be a valid number.");
            input.close();
            return; // Terminate execution early due to validation failure
        }

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