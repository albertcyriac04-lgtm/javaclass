import java.util.Scanner;

public class Main {

    /**
     * Recursively computes the factorial of n.
     * Note: This uses recursion instead of a loop to avoid using loops.
     */
    static double calculateFactorial(int n) {
        if (n <= 1) {
            return 1.0;
        }
        return n * calculateFactorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Required datatypes: String, int, double, float
        String calculationLabel;
        int inputNumber;
        double factorialResult;
        float scaledValue;

        // 1. String validation
        System.out.print("Enter label for this calculation: ");
        calculationLabel = input.nextLine().trim();
        if (calculationLabel.isEmpty()) {
            System.out.println("Error: Calculation label cannot be empty.");
            input.close();
            return;
        }

        // 2. int validation
        System.out.print("Enter an integer to compute factorial (1 to 20): ");
        if (input.hasNextInt()) {
            inputNumber = input.nextInt();
            if (inputNumber < 1 || inputNumber > 20) {
                System.out.println("Error: Input must be between 1 and 20.");
                input.close();
                return;
            }
        } else {
            System.out.println("Error: Input must be a valid integer.");
            input.close();
            return;
        }

        // 3. double calculation (recursive)
        factorialResult = calculateFactorial(inputNumber);

        // 4. float assignment (scale down the factorial value)
        scaledValue = (float) (factorialResult / 1000.0);

        // Display results
        System.out.println("\n--- Factorial Result ---");
        System.out.println("Label: " + calculationLabel);
        System.out.println("Factorial of " + inputNumber + " = " + factorialResult);
        System.out.println("Result scaled down by 1000 = " + scaledValue + "f");

        input.close();
    }
}
