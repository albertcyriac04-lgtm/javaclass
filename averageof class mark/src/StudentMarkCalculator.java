import java.util.Scanner;

/**
 * StudentMarkCalculator prompts the user to enter marks for three subjects,
 * calculates the total and average marks, and prints a feedback message
 * based on whether the average mark is above a threshold.
 *
 * This program demonstrates standard Java variables and calculations.
 * It utilizes four distinct data types: String, int, double, and float.
 */
public class StudentMarkCalculator {

    /**
     * Entry point of the StudentMarkCalculator application.
     * Prompts the user for student name and marks for 3 subjects,
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
        studentName = sc.nextLine();

        // Prompt the user to enter mark 1
        System.out.print("Enter mark 1 (0-100): ");
        mark1 = sc.nextInt();

        // Prompt the user to enter mark 2
        System.out.print("Enter mark 2 (0-100): ");
        mark2 = sc.nextInt();

        // Prompt the user to enter mark 3
        System.out.print("Enter mark 3 (0-100): ");
        mark3 = sc.nextInt();

        // Calculate sum total of all subject marks
        int total = mark1 + mark2 + mark3;
        
        // Calculate average using double division
        average = total / 3.0;

        // Display formatted student marks report to standard output
        System.out.println("\n--- Report for " + studentName + " ---");
        System.out.println("Total Marks = " + total);
        System.out.println("Average Marks = " + average);

        // Check if the average exceeds passing threshold float
        if (average > threshold) {
            System.out.println("Status: The student scored above the " + threshold + "% average threshold.");
        } else {
            System.out.println("Status: The student scored at or below the " + threshold + "% average threshold.");
        }

        // Close the scanner object to free up associated system resources
        sc.close();
    }
}