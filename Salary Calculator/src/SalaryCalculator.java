import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Required datatypes: String, int, double, float
        String employeeName;
        int monthsWorked;
        double basicSalary;
        float grossSalary;

        // 1. String validation
        System.out.print("Enter employee name: ");
        employeeName = input.nextLine().trim();
        if (employeeName.isEmpty()) {
            System.out.println("Error: Name cannot be empty.");
            input.close();
            return;
        }

        // 2. int validation
        System.out.print("Enter number of months worked: ");
        if (input.hasNextInt()) {
            monthsWorked = input.nextInt();
            if (monthsWorked <= 0) {
                System.out.println("Error: Months worked must be greater than zero.");
                input.close();
                return;
            }
        } else {
            System.out.println("Error: Months worked must be a valid integer.");
            input.close();
            return;
        }

        // 3. double validation
        System.out.print("Enter basic monthly salary: ");
        if (input.hasNextDouble()) {
            basicSalary = input.nextDouble();
            if (basicSalary <= 0) {
                System.out.println("Error: Basic salary must be greater than zero.");
                input.close();
                return;
            }
        } else {
            System.out.println("Error: Basic salary must be a valid number.");
            input.close();
            return;
        }

        // Calculate allowances based on basic salary
        double da = basicSalary * 0.20;
        double hra = basicSalary * 0.10;
        double totalMonthlySalary = basicSalary + da + hra;
        
        // 4. float conversion for total gross salary over the period
        grossSalary = (float) (totalMonthlySalary * monthsWorked);

        // Print details to the console
        System.out.println("\n--- Salary Slip for " + employeeName + " ---");
        System.out.println("Months Worked: " + monthsWorked);
        System.out.println("Monthly Basic Salary: " + basicSalary);
        System.out.println("Monthly DA (20%): " + da);
        System.out.println("Monthly HRA (10%): " + hra);
        System.out.println("Total Gross Salary over period: " + grossSalary);

        input.close();
    }
}
