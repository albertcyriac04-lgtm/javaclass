import java.util.Scanner;

/**
 * AgeCalculator calculates a person's age based on the current year
 * and their birth year entered by the user.
 *
 * This program demonstrates standard Java variables and calculations.
 * It utilizes four distinct data types: String, int, double, and float.
 */
public class AgeCalculator {

    /**
     * Entry point of the AgeCalculator application.
     * Prompts the user for name, birth date, and current date parameters,
     * and calculates age metrics.
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
        personName = input.nextLine();

        // Prompt the user to enter current year
        System.out.print("Enter current year: ");
        currentYear = input.nextInt();

        // Prompt the user to enter current month
        System.out.print("Enter current month (1-12): ");
        currentMonth = input.nextInt();

        // Prompt the user to enter birth year
        System.out.print("Enter birth year: ");
        birthYear = input.nextInt();

        // Prompt the user to enter birth month
        System.out.print("Enter birth month (1-12): ");
        birthMonth = input.nextInt();

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