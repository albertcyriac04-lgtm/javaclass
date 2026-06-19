import java.util.Scanner;

/**
 * StudentMarkCalculator prompts the user to enter marks for three subjects,
 * calculates the total and average marks, and prints a feedback message
 * based on whether the average mark is above a threshold.
 *
 * This program demonstrates standard Java variables, simple input validations
 * without using loops, and resource management. It utilizes four distinct 
 * data types: String, int, double, and float.
 */
public class StudentMarkCalculator {

    /**
     * Entry point of the StudentMarkCalculator application.
     * Prompts the user for student name and marks for 3 subjects, performs checks,
     * calculates average grade, and determines if it exceeds threshold.
     *
     * @param args Command-line arguments (not used in this application).
     */
    public static void main(String[] args) {
        // Instantiate a Scanner object to read user input from the console standard input stream
        Scanner sc = new Scanner(System.in);

        // --- Data Type Declarations ---
        
        // String data type: Stores the full name of the student
        String studentName;
        
        // int data type: Stores the individual marks obtained in 3 different subjects
        int mark1, mark2, mark3;
        
        // double data type: Stores the calculated average score
        double average;
        
        // float data type: Represents the passing threshold percentage value (50.0%)
        float threshold = 50.0f;

        // Prompt the user to enter student name
        System.out.print("Enter student name: ");
        // Read and trim whitespace from student name
        studentName = sc.nextLine().trim();
        
        // Validation Step 1: Check if student name string is empty
        if (studentName.isEmpty()) {
            System.out.println("Error: Student name cannot be empty.");
            sc.close();
            return; // Terminate execution early due to validation failure
        }

        // Prompt the user to enter mark 1
        System.out.print("Enter mark 1 (0-100): ");
        
        // Validation Step 2: Check if mark 1 is a valid integer
        if (sc.hasNextInt()) {
            mark1 = sc.nextInt();
            
            // Check if mark lies within academic bounds (0 to 100)
            if (mark1 < 0 || mark1 > 100) {
                System.out.println("Error: Marks must be between 0 and 100.");
                sc.close();
                return; // Terminate early
            }
        } else {
            System.out.println("Error: Mark must be a valid integer.");
            sc.close();
            return; // Terminate early
        }

        // Prompt the user to enter mark 2
        System.out.print("Enter mark 2 (0-100): ");
        
        // Validation Step 3: Check if mark 2 is a valid integer
        if (sc.hasNextInt()) {
            mark2 = sc.nextInt();
            
            // Check if mark lies within academic bounds (0 to 100)
            if (mark2 < 0 || mark2 > 100) {
                System.out.println("Error: Marks must be between 0 and 100.");
                sc.close();
                return; // Terminate early
            }
        } else {
            System.out.println("Error: Mark must be a valid integer.");
            sc.close();
            return; // Terminate early
        }

        // Prompt the user to enter mark 3
        System.out.print("Enter mark 3 (0-100): ");
        
        // Validation Step 4: Check if mark 3 is a valid integer
        if (sc.hasNextInt()) {
            mark3 = sc.nextInt();
            
            // Check if mark lies within academic bounds (0 to 100)
            if (mark3 < 0 || mark3 > 100) {
                System.out.println("Error: Marks must be between 0 and 100.");
                sc.close();
                return; // Terminate early
            }
        } else {
            System.out.println("Error: Mark must be a valid integer.");
            sc.close();
            return; // Terminate early
        }

        // Calculate sum total of all subject marks
        int total = mark1 + mark2 + mark3;
        
        // Calculate average using double division
        average = total / 3.0;

        // Display formatted student marks report to standard output
        System.out.println("\n--- Report for " + studentName + " ---");
        System.out.println("Total Marks = " + total);
        System.out.println("Average Marks = " + average);

        // Validation Step 5: Check if the average exceeds passing threshold float
        if (average > threshold) {
            System.out.println("Status: The student scored above the " + threshold + "% average threshold.");
        } else {
            System.out.println("Status: The student scored at or below the " + threshold + "% average threshold.");
        }

        // Close the scanner object to free up associated system resources
        sc.close();
    }
}