import java.util.Scanner;

public class SimpleInterestCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Required datatypes: String, int, double, float
        String currencySymbol = "USD";
        int timeInYears;
        double principal;
        double rate;
        float simpleInterest;

        // 1. double validation (Principal)
        System.out.print("Enter Principal amount: ");
        if (input.hasNextDouble()) {
            principal = input.nextDouble();
            if (principal <= 0) {
                System.out.println("Error: Principal must be greater than zero.");
                input.close();
                return;
            }
        } else {
            System.out.println("Error: Principal must be a valid number.");
            input.close();
            return;
        }

        // 2. int validation (Time in years)
        System.out.print("Enter Time (in years): ");
        if (input.hasNextInt()) {
            timeInYears = input.nextInt();
            if (timeInYears <= 0) {
                System.out.println("Error: Time must be at least 1 year.");
                input.close();
                return;
            }
        } else {
            System.out.println("Error: Time must be a valid integer.");
            input.close();
            return;
        }

        // 3. double validation (Rate)
        System.out.print("Enter Rate of interest (%): ");
        if (input.hasNextDouble()) {
            rate = input.nextDouble();
            if (rate <= 0) {
                System.out.println("Error: Rate must be greater than zero.");
                input.close();
                return;
            }
        } else {
            System.out.println("Error: Rate must be a valid number.");
            input.close();
            return;
        }

        // 4. float computation
        simpleInterest = (float) ((principal * rate * timeInYears) / 100.0);

        // Display results
        System.out.println("\n--- Simple Interest Calculation ---");
        System.out.println("Principal: " + principal + " " + currencySymbol);
        System.out.println("Time: " + timeInYears + " years");
        System.out.println("Rate: " + rate + "%");
        System.out.println("Interest = " + simpleInterest + " " + currencySymbol);

        input.close();
    }
}