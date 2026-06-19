import java.util.Scanner;

/**
 * SimpleInterestCalculator computes simple interest based on the principal amount,
 * time in years, and the annual rate of interest.
 *
 * This program demonstrates standard Java variables and calculations.
 * It utilizes four distinct data types: String, int, double, and float.
 */
public class SimpleInterestCalculator {

    /**
     * Entry point of the SimpleInterestCalculator application.
     * Prompts the user for principal, time, and rate of interest, 
     * computes simple interest, and displays results.
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
        
        // double data type: Stores the principal amount deposited or borrowed
        double principal;
        
        // double data type: Stores the annual rate of interest as a percentage
        double rate;
        
        // float data type: Stores the calculated final simple interest value
        float simpleInterest;

        // Prompt the user to enter the principal amount
        System.out.print("Enter Principal amount: ");
        principal = input.nextDouble();

        // Prompt the user to enter time in years
        System.out.print("Enter Time (in years): ");
        timeInYears = input.nextInt();

        // Prompt the user to enter the annual interest rate
        System.out.print("Enter Rate of interest (%): ");
        rate = input.nextDouble();

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