import java.util.Scanner;

public class AgeCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Required datatypes: String, int, double, float
        String personName;
        int currentYear, currentMonth, birthYear, birthMonth;
        int ageYears, ageMonths;
        double averageDaysPerYear = 365.2425;
        float ageInApproxDays;

        // 1. String validation
        System.out.print("Enter name: ");
        personName = input.nextLine().trim();
        if (personName.isEmpty()) {
            System.out.println("Error: Name cannot be empty.");
            input.close();
            return;
        }

        // 2. int validation (current year)
        System.out.print("Enter current year: ");
        if (input.hasNextInt()) {
            currentYear = input.nextInt();
            if (currentYear < 0) {
                System.out.println("Error: Year cannot be negative.");
                input.close();
                return;
            }
        } else {
            System.out.println("Error: Year must be a valid integer.");
            input.close();
            return;
        }

        // 2. int validation (current month)
        System.out.print("Enter current month (1-12): ");
        if (input.hasNextInt()) {
            currentMonth = input.nextInt();
            if (currentMonth < 1 || currentMonth > 12) {
                System.out.println("Error: Month must be between 1 and 12.");
                input.close();
                return;
            }
        } else {
            System.out.println("Error: Month must be a valid integer.");
            input.close();
            return;
        }

        // 2. int validation (birth year)
        System.out.print("Enter birth year: ");
        if (input.hasNextInt()) {
            birthYear = input.nextInt();
            if (birthYear < 0 || birthYear > currentYear) {
                System.out.println("Error: Birth year must be non-negative and not in the future.");
                input.close();
                return;
            }
        } else {
            System.out.println("Error: Birth year must be a valid integer.");
            input.close();
            return;
        }

        // 2. int validation (birth month)
        System.out.print("Enter birth month (1-12): ");
        if (input.hasNextInt()) {
            birthMonth = input.nextInt();
            if (birthMonth < 1 || birthMonth > 12) {
                System.out.println("Error: Month must be between 1 and 12.");
                input.close();
                return;
            }
        } else {
            System.out.println("Error: Month must be a valid integer.");
            input.close();
            return;
        }

        // Date sanity check (no future birthdays)
        if (birthYear == currentYear && birthMonth > currentMonth) {
            System.out.println("Error: Birth date cannot be in the future of the current date.");
            input.close();
            return;
        }

        // Calculate age
        int deltaMonths = currentMonth - birthMonth;
        if (deltaMonths < 0) {
            ageYears = (currentYear - birthYear) - 1;
            ageMonths = deltaMonths + 12;
        } else {
            ageYears = currentYear - birthYear;
            ageMonths = deltaMonths;
        }

        // Calculate approximate days using double and float datatypes
        double approximateYears = ageYears + (ageMonths / 12.0);
        ageInApproxDays = (float) (approximateYears * averageDaysPerYear);

        // Display results
        System.out.println("\n--- Age Details for " + personName + " ---");
        System.out.println("Age = " + ageYears + " Years and " + ageMonths + " Months");
        System.out.println("Approximate Age in Days = " + ageInApproxDays + " days");

        input.close();
    }
}