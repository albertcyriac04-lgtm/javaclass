/**
 * StudentMarkCalculator prompts the user to enter marks for three subjects,
 * calculates the total and average marks, and prints a feedback message
 * based on whether the average mark is above 50.
 */
import java.util.Scanner;

public class StudentMarkCalculator {
    public static void main(String[] args) {
        // Instantiate Scanner for console input streams
        Scanner sc = new Scanner(System.in);

        // Input marks for three subjects
        System.out.print("Enter mark 1: ");
        int mark1 = sc.nextInt();

        System.out.print("Enter mark 2: ");
        int mark2 = sc.nextInt();

        System.out.print("Enter mark 3: ");
        int mark3 = sc.nextInt();

        // Calculate total and average
        // total is the sum of all three marks
        int total = mark1 + mark2 + mark3;
        // average is calculated dividing total by 3.0 to enforce floating-point division
        double average = total / 3.0;

        // Display results to the user
        System.out.println("\nTotal Marks = " + total);
        System.out.println("Average Marks = " + average);

        // Check if average is above 50 and display appropriate status
        if (average > 50) {
            System.out.println("The student scored above 50 average.");
        } else {
            System.out.println("The student scored 50 or below average.");
        }

        // Close scanner to release resources
        sc.close();
    }
}