/**
 * SalaryCalculator computes the allowances (DA, HRA) and gross salary
 * based on user input for basic salary and predefined rates.
 */
import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {
        // Instantiate Scanner for console input streams
        Scanner input = new Scanner(System.in);

        // Constant values for salary component rates (DA = 20%, HRA = 10%)
        final double DA_RATE = 0.20;
        final double HRA_RATE = 0.10;

        // Declarations for salary components
        double basicSalary; // Base salary entered by the user
        double da;          // Dearness Allowance (calculated)
        double hra;         // House Rent Allowance (calculated)
        double grossSalary; // Total salary (basic + DA + HRA)

        // Read basic salary input
        System.out.print("Enter basic salary: ");
        basicSalary = input.nextDouble();

        // Calculate allowances based on basic salary
        da = basicSalary * DA_RATE;
        hra = basicSalary * HRA_RATE;

        // Calculate gross salary by summing base and allowances
        grossSalary = basicSalary + da + hra;

        // Print details to the console
        System.out.println("DA = " + da);
        System.out.println("HRA = " + hra);
        System.out.println("Gross Salary = " + grossSalary);

        // Close scanner to release system resources
        input.close();
    }
}
