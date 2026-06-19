import java.util.Scanner;

/**
 * SimpleInterestCalculator computes simple interest based on the principal amount,
 * time in years, and the annual rate of interest.
 *
 * This program demonstrates standard Java variables, simple input validations
 * without using loops, and resource management. It utilizes four distinct 
 * data types: String, int, double, and float.
 */
public class SimpleInterestCalculator {

    /**
     * Entry point of the SimpleInterestCalculator application.
     * Prompts the user for principal, time, and rate of interest, runs validation 
     * on each, computes simple interest, and displays results.
     *
     * @param args Command-line arguments (not used in this application).
     */
    public static void main(String[] args) {
        // Instantiate a Scanner object to read user input from the console standard input stream
        Scanner input = new Scanner(System.in);

        // --- Data Type Declarations ---
        
        // String data type: Defines the currency symbol used for display outputs
        String currencySymbol = "USD";
        
        // int data type: Stores the duration of the deposit or loan in years
        int timeInYears;
        
        // double data type: Stores the high-precision principal amount deposited or borrowed
        double principal;
        
        // double data type: Stores the annual rate of interest as a percentage
        double rate;
        
        // float data type: Stores the calculated final simple interest value
        float simpleInterest;

        // Prompt the user to enter the principal amount
        System.out.print("Enter Principal amount: ");
        
        // Validation Step 1: Check if the principal input is a valid double
        if (input.hasNextDouble()) {
            principal = input.nextDouble();
            
            // Check if principal is positive and greater than zero
            if (principal <= 0) {
                System.out.println("Error: Principal must be greater than zero.");
                input.close();
                return; // Terminate execution early due to validation failure
            }
        } else {
            System.out.println("Error: Principal must be a valid number.");
            input.close();
            return; // Terminate execution early due to validation failure
        }

        // Prompt the user to enter time in years
        System.out.print("Enter Time (in years): ");
        
        // Validation Step 2: Check if time input is a valid integer
        if (input.hasNextInt()) {
            timeInYears = input.nextInt();
            
            // Check if the time period is positive and at least 1 year
            if (timeInYears <= 0) {
                System.out.println("Error: Time must be at least 1 year.");
                input.close();
                return; // Terminate execution early due to validation failure
            }
        } else {
            System.out.println("Error: Time must be a valid integer.");
            input.close();
            return; // Terminate execution early due to validation failure
        }

        // Prompt the user to enter the annual interest rate
        System.out.print("Enter Rate of interest (%): ");
        
        // Validation Step 3: Check if rate input is a valid double
        if (input.hasNextDouble()) {
            rate = input.nextDouble();
            
            // Check if interest rate is positive and greater than zero
            if (rate <= 0) {
                System.out.println("Error: Rate must be greater than zero.");
                input.close();
                return; // Terminate execution early due to validation failure
            }
        } else {
            System.out.println("Error: Rate must be a valid number.");
            input.close();
            return; // Terminate execution early due to validation failure
        }

        // Calculate Simple Interest using standard formula: SI = (P * R * T) / 100
        // Cast the double calculation results to a float to match the simpleInterest variable's datatype
        simpleInterest = (float) ((principal * rate * timeInYears) / 100.0);

        // Display formatted financial calculation summary output
        System.out.println("\n--- Simple Interest Calculation ---");
        System.out.println("Principal: " + principal + " " + currencySymbol);
        System.out.println("Time: " + timeInYears + " years");
        System.out.println("Rate: " + rate + "%");
        System.out.println("Interest = " + simpleInterest + " " + currencySymbol);

        // Close the scanner object to free up associated system resources
        input.close();
    }
}