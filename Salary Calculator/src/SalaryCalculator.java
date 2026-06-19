import java.util.Scanner;

/**
 * SalaryCalculator computes the monthly allowances (DA, HRA) and total gross salary
 * for an employee based on user inputs for basic salary and working period.
 *
 * This program demonstrates standard Java variables, simple input validations
 * without using loops, and resource management. It utilizes four distinct 
 * data types: String, int, double, and float.
 */
public class SalaryCalculator {

    /**
     * Entry point of the SalaryCalculator application.
     * Prompts the user for employee name, working duration, and monthly basic salary,
     * performs step-by-step validations, calculates allowances and gross salary, and displays them.
     *
     * @param args Command-line arguments (not used in this application).
     */
    public static void main(String[] args) {
        // Instantiate a Scanner object to read user input from the console standard input stream
        Scanner input = new Scanner(System.in);

        // --- Data Type Declarations ---
        
        // String data type: Stores the full name of the employee being processed
        String employeeName;
        
        // int data type: Stores the total number of months worked in the billing period
        int monthsWorked;
        
        // double data type: Stores the high-precision base monthly salary of the employee
        double basicSalary;
        
        // float data type: Stores the final calculated total gross salary over the working period
        float grossSalary;

        // Prompt the user to enter the employee name
        System.out.print("Enter employee name: ");
        // Read and trim whitespace from employee name
        employeeName = input.nextLine().trim();
        
        // Validation Step 1: Check if employee name string is empty
        if (employeeName.isEmpty()) {
            System.out.println("Error: Name cannot be empty.");
            input.close();
            return; // Terminate execution early due to validation failure
        }

        // Prompt the user to enter months worked
        System.out.print("Enter number of months worked: ");
        
        // Validation Step 2: Check if months input is a valid integer
        if (input.hasNextInt()) {
            monthsWorked = input.nextInt();
            
            // Check if the months duration is a positive non-zero value
            if (monthsWorked <= 0) {
                System.out.println("Error: Months worked must be greater than zero.");
                input.close();
                return; // Terminate execution early due to validation failure
            }
        } else {
            System.out.println("Error: Months worked must be a valid integer.");
            input.close();
            return; // Terminate execution early due to validation failure
        }

        // Prompt the user to enter monthly basic salary
        System.out.print("Enter basic monthly salary: ");
        
        // Validation Step 3: Check if salary input is a valid double
        if (input.hasNextDouble()) {
            basicSalary = input.nextDouble();
            
            // Check if basic salary is a positive non-zero value
            if (basicSalary <= 0) {
                System.out.println("Error: Basic salary must be greater than zero.");
                input.close();
                return; // Terminate execution early due to validation failure
            }
        } else {
            System.out.println("Error: Basic salary must be a valid number.");
            input.close();
            return; // Terminate execution early due to validation failure
        }

        // Perform calculation of monthly allowances based on basic salary
        // Dearness Allowance (DA) is calculated at 20% of basic salary
        double da = basicSalary * 0.20;
        // House Rent Allowance (HRA) is calculated at 10% of basic salary
        double hra = basicSalary * 0.10;
        
        // Sum total monthly salary components
        double totalMonthlySalary = basicSalary + da + hra;
        
        // Calculate cumulative gross salary over the work period
        // Cast the double computation to a float to match the grossSalary variable's datatype
        grossSalary = (float) (totalMonthlySalary * monthsWorked);

        // Display formatted salary slip details to standard output
        System.out.println("\n--- Salary Slip for " + employeeName + " ---");
        System.out.println("Months Worked: " + monthsWorked);
        System.out.println("Monthly Basic Salary: " + basicSalary);
        System.out.println("Monthly DA (20%): " + da);
        System.out.println("Monthly HRA (10%): " + hra);
        System.out.println("Total Gross Salary over period: " + grossSalary);

        // Close the scanner object to free up associated system resources
        input.close();
    }
}
