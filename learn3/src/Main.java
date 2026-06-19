import java.util.Scanner;

/**
 * Main demonstrates basic console inputs and calculations without using loops.
 *
 * This program demonstrates standard Java variables and calculations.
 * It utilizes four distinct data types: String, int, double, and float.
 */
public class Main {

    /**
     * Entry point of the learn3 Main application.
     * Prompts the user for category, count, limit, and actual values,
     * and prints a status report.
     *
     * @param args Command-line arguments (not used in this application).
     */
    public static void main(String[] args) {
        // Instantiate a Scanner object to read user input from the console standard input stream
        Scanner input = new Scanner(System.in);

        // --- Data Type Declarations ---
        
        // String data type: Stores the user-defined category or type label
        String messageType;
        
        // int data type: Stores the quantity or item count
        int count;
        
        // double data type: Stores the limit value for validation threshold
        double limitValue;
        
        // float data type: Stores the actual float value compared against the limit
        float actualValue;

        // Prompt the user to enter the category name
        System.out.print("Enter category/type: ");
        messageType = input.nextLine();

        // Prompt the user to enter item count
        System.out.print("Enter item count: ");
        count = input.nextInt();

        // Prompt the user to enter limit value
        System.out.print("Enter limit value: ");
        limitValue = input.nextDouble();

        // Prompt the user to enter actual value
        System.out.print("Enter actual value: ");
        actualValue = input.nextFloat();

        // Display the formatted category status report
        System.out.println("\n--- Status Report ---");
        System.out.println("Category: " + messageType);
        System.out.println("Count: " + count);
        System.out.println("Limit: " + limitValue);
        System.out.println("Actual: " + actualValue);

        // Close the scanner object to free up associated system resources
        input.close();
    }
}
