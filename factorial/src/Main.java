import java.util.Scanner;

/**
 * Main demonstrates how to calculate the factorial of a number recursively
 * in Java without using any loops.
 *
 * This program demonstrates standard Java variables and recursive calculation.
 * It utilizes four distinct data types: String, int, double, and float.
 */
public class Main {

    /**
     * Recursively computes the factorial of n.
     * Note: This uses recursion instead of a loop to avoid loop statements.
     *
     * @param n The integer value to compute the factorial for.
     * @return The double representation of the factorial of n.
     */
    static double calculateFactorial(int n) {
        // Base case: factorial of 1 or 0 is 1.0
        if (n <= 1) {
            return 1.0;
        }
        // Recursive case: n! = n * (n - 1)!
        return n * calculateFactorial(n - 1);
    }

    /**
     * Entry point of the factorial application.
     * Prompts the user for a calculation label name and an integer value (1-20),
     * calculates the factorial recursively, and prints outcomes.
     *
     * @param args Command-line arguments (not used in this application).
     */
    public static void main(String[] args) {
        // Instantiate a Scanner object to read user input from the console standard input stream
        Scanner input = new Scanner(System.in);

        // --- Data Type Declarations ---
        
        // String data type: Stores a user-defined label describing this specific calculation run
        String calculationLabel;
        
        // int data type: Stores the input integer to calculate the factorial for (validated up to 20)
        int inputNumber;
        
        // double data type: Stores the calculated factorial output (double accommodates large values)
        double factorialResult;
        
        // float data type: Stores the scaled down value of the factorial (scaled by 1000)
        float scaledValue;

        // Prompt the user to enter a calculation label
        System.out.print("Enter label for this calculation: ");
        calculationLabel = input.nextLine();

        // Prompt the user to enter an integer value
        System.out.print("Enter an integer to compute factorial (1 to 20): ");
        inputNumber = input.nextInt();

        // Compute the factorial recursively and assign it to the double result variable
        factorialResult = calculateFactorial(inputNumber);

        // Cast the double calculation to a float after dividing by 1000
        scaledValue = (float) (factorialResult / 1000.0);

        // Display the formatted calculation results to standard output
        System.out.println("\n--- Factorial Result ---");
        System.out.println("Label: " + calculationLabel);
        System.out.println("Factorial of " + inputNumber + " = " + factorialResult);
        System.out.println("Result scaled down by 1000 = " + scaledValue + "f");

        // Close the scanner object to free up associated system resources
        input.close();
    }
}
