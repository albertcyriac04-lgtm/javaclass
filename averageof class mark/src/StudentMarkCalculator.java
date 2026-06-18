import java.util.Scanner;

public class StudentMarkCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input marks
        System.out.print("Enter mark 1: ");
        int mark1 = sc.nextInt();

        System.out.print("Enter mark 2: ");
        int mark2 = sc.nextInt();

        System.out.print("Enter mark 3: ");
        int mark3 = sc.nextInt();

        // Calculate total and average
        int total = mark1 + mark2 + mark3;
        double average = total / 3.0;

        // Display results
        System.out.println("\nTotal Marks = " + total);
        System.out.println("Average Marks = " + average);

        // Check if average is above 50
        if (average > 50) {
            System.out.println("The student scored above 50 average.");
        } else {
            System.out.println("The student scored 50 or below average.");
        }

        sc.close();
    }
}