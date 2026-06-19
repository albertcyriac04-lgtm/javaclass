import java.util.Scanner;

public class SimpleInterestCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Unmodifiable constant setup
        final double DEFAULT_RATE = 5.0;

        double principal;
        double rate;
        double time;
        double simpleInterest;

        System.out.print("Enter Principal amount: ");
        principal = input.nextDouble();

        System.out.print("Enter Time (in years): ");
        time = input.nextDouble();

        System.out.print("Enter Rate of interest (Enter 0 or negative to use default rate): ");
        rate = input.nextDouble();

        // Control flow structure to handle fallback parameters
        if (rate <= 0) {
            rate = DEFAULT_RATE;
        }

        // Standard financial formula execution
        simpleInterest = (principal * rate * time) / 100.0;

        System.out.println("Interest = " + simpleInterest);

        input.close();
    }
}