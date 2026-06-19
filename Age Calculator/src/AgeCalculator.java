import java.util.Scanner;

/**
 * AgeCalculator calculates a person's age based on the current year
 * and their birth year entered by the user.
 *
 * This program demonstrates standard Java variables, simple input validations
 * without using loops, and resource management. It utilizes four distinct 
 * data types: String, int, double, and float.
 */
public class AgeCalculator {

    /**
     * Entry point of the AgeCalculator application.
     * Prompts the user for name, birth date, and current date parameters,
     * performs date validation, and calculates age metrics.
     *
     * @param args Command-line arguments (not used in this application).
     */
    public static void main(String[] args) {
        // Instantiate a Scanner object to read user input from the console standard input stream
        Scanner input = new Scanner(System.in);

        // --- Data Type Declarations ---
        
        // String data type: Stores the name of the person
        String personName;
        
        // int data type: Stores date components (years and months) for current and birth points
        int currentYear, currentMonth, birthYear, birthMonth;
        int ageYears, ageMonths;
        
        // double data type: Represents the constant mean days per calendar year (365.2425)
        double averageDaysPerYear = 365.2425;
        
        // float data type: Stores the calculated approximate age in days
        float ageInApproxDays;

        // Prompt the user to enter their name
        System.out.print("Enter name: ");
        // Read and trim whitespace from person name
        personName = input.nextLine().trim();
        
        // Validation Step 1: Check if name string is empty
        if (personName.isEmpty()) {
            System.out.println("Error: Name cannot be empty.");
            input.close();
            return; // Terminate execution early due to validation failure
        }

        // Prompt the user to enter current year
        System.out.print("Enter current year: ");
        
        // Validation Step 2: Check if current year input is a valid integer
        if (input.hasNextInt()) {
            currentYear = input.nextInt();
            
            // Validate that the year is positive
            if (currentYear < 0) {
                System.out.println("Error: Year cannot be negative.");
                input.close();
                return; // Terminate early
            }
        } else {
            System.out.println("Error: Year must be a valid integer.");
            input.close();
            return; // Terminate early
        }

        // Prompt the user to enter current month
        System.out.print("Enter current month (1-12): ");
        
        // Validation Step 3: Check if current month input is a valid integer
        if (input.hasNextInt()) {
            currentMonth = input.nextInt();
            
            // Validate that the month lies between 1 and 12
            if (currentMonth < 1 || currentMonth > 12) {
                System.out.println("Error: Month must be between 1 and 12.");
                input.close();
                return; // Terminate early
            }
        } else {
            System.out.println("Error: Month must be a valid integer.");
            input.close();
            return; // Terminate early
        }

        // Prompt the user to enter birth year
        System.out.print("Enter birth year: ");
        
        // Validation Step 4: Check if birth year input is a valid integer
        if (input.hasNextInt()) {
            birthYear = input.nextInt();
            
            // Validate that the birth year is non-negative and not in the future relative to the current year
            if (birthYear < 0 || birthYear > currentYear) {
                System.out.println("Error: Birth year must be non-negative and not in the future.");
                input.close();
                return; // Terminate early
            }
        } else {
            System.out.println("Error: Birth year must be a valid integer.");
            input.close();
            return; // Terminate early
        }

        // Prompt the user to enter birth month
        System.out.print("Enter birth month (1-12): ");
        
        // Validation Step 5: Check if birth month input is a valid integer
        if (input.hasNextInt()) {
            birthMonth = input.nextInt();
            
            // Validate that the birth month lies between 1 and 12
            if (birthMonth < 1 || birthMonth > 12) {
                System.out.println("Error: Month must be between 1 and 12.");
                input.close();
                return; // Terminate early
            }
        } else {
            System.out.println("Error: Month must be a valid integer.");
            input.close();
            return; // Terminate early
        }

        // Additional sanity check: Date cannot be in the future of the current date
        if (birthYear == currentYear && birthMonth > currentMonth) {
            System.out.println("Error: Birth date cannot be in the future of the current date.");
            input.close();
            return; // Terminate early
        }

        // Calculate age components (years and months) using calendar borrowing
        int deltaMonths = currentMonth - birthMonth;
        if (deltaMonths < 0) {
            // Borrow 1 year (12 months) from year delta
            ageYears = (currentYear - birthYear) - 1;
            ageMonths = deltaMonths + 12;
        } else {
            // No borrowing required
            ageYears = currentYear - birthYear;
            ageMonths = deltaMonths;
        }

        // Calculate approximate age in days using double and float datatypes
        double approximateYears = ageYears + (ageMonths / 12.0);
        ageInApproxDays = (float) (approximateYears * averageDaysPerYear);

        // Display formatted age calculation outcomes to standard output
        System.out.println("\n--- Age Details for " + personName + " ---");
        System.out.println("Age = " + ageYears + " Years and " + ageMonths + " Months");
        System.out.println("Approximate Age in Days = " + ageInApproxDays + " days");

        // Close the scanner object to free up associated system resources
        input.close();
    }
}