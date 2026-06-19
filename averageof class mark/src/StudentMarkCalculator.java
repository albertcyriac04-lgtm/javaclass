import java.util.Scanner;

public class StudentMarkCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Required datatypes: String, int, double, float
        String studentName;
        int mark1, mark2, mark3;
        double average;
        float threshold = 50.0f;

        // 1. String validation
        System.out.print("Enter student name: ");
        studentName = sc.nextLine().trim();
        if (studentName.isEmpty()) {
            System.out.println("Error: Student name cannot be empty.");
            sc.close();
            return;
        }

        // 2. int validation (Mark 1)
        System.out.print("Enter mark 1 (0-100): ");
        if (sc.hasNextInt()) {
            mark1 = sc.nextInt();
            if (mark1 < 0 || mark1 > 100) {
                System.out.println("Error: Marks must be between 0 and 100.");
                sc.close();
                return;
            }
        } else {
            System.out.println("Error: Mark must be a valid integer.");
            sc.close();
            return;
        }

        // int validation (Mark 2)
        System.out.print("Enter mark 2 (0-100): ");
        if (sc.hasNextInt()) {
            mark2 = sc.nextInt();
            if (mark2 < 0 || mark2 > 100) {
                System.out.println("Error: Marks must be between 0 and 100.");
                sc.close();
                return;
            }
        } else {
            System.out.println("Error: Mark must be a valid integer.");
            sc.close();
            return;
        }

        // int validation (Mark 3)
        System.out.print("Enter mark 3 (0-100): ");
        if (sc.hasNextInt()) {
            mark3 = sc.nextInt();
            if (mark3 < 0 || mark3 > 100) {
                System.out.println("Error: Marks must be between 0 and 100.");
                sc.close();
                return;
            }
        } else {
            System.out.println("Error: Mark must be a valid integer.");
            sc.close();
            return;
        }

        // Calculate total and average using double
        int total = mark1 + mark2 + mark3;
        average = total / 3.0;

        // Display results
        System.out.println("\n--- Report for " + studentName + " ---");
        System.out.println("Total Marks = " + total);
        System.out.println("Average Marks = " + average);

        // 3. Float comparison threshold
        if (average > threshold) {
            System.out.println("Status: The student scored above the " + threshold + "% average threshold.");
        } else {
            System.out.println("Status: The student scored at or below the " + threshold + "% average threshold.");
        }

        sc.close();
    }
}