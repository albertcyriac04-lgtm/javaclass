/**
 * SimpleInterestCalculator computes simple interest based on the principal amount,
 * time in years, and the annual rate of interest.
 * If the user inputs 0 or a negative rate, a default rate of 5.0% is applied.
 */
import java.util.Scanner;

public class SimpleInterestCalculator {

    public static void main(String[] args) {
        // Instantiate Scanner for console input streams
        Scanner input = new Scanner(System.in);

        // Unmodifiable constant setup for default fallback interest rate
        final double DEFAULT_RATE = 5.0;

        // Variable declarations to hold user inputs and calculated interest
        double principal;      // Principal amount deposited or borrowed
        double rate;           // Annual rate of interest as a percentage
        double time;           // Time period in years
        double simpleInterest; // Calculated simple interest amount

        // Interactive User Interface Inputs
        System.out.print("Enter Principal amount: ");
        principal = input.nextDouble();

        System.out.print("Enter Time (in years): ");
        time = input.nextDouble();

        System.out.print("Enter Rate of interest (Enter 0 or negative to use default rate): ");
        rate = input.nextDouble();

        // Control flow structure to handle fallback parameters
        // Checks if rate is non-positive; if so, assigns the default rate
        if (rate <= 0) {
            rate = DEFAULT_RATE;
        }

        // Standard financial formula execution: SI = (P * R * T) / 100
        simpleInterest = (principal * rate * time) / 100.0;

        // Display results
        System.out.println("Interest = " + simpleInterest);

        // Resource optimization: Close the Scanner to prevent resource leaks
        input.close();
    }
}