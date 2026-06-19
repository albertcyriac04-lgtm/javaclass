/**
 * AgeCalculator calculates a person's age based on the current year
 * and their birth year entered by the user.
 */
import java.util.Scanner;

public class AgeCalculator {

    public static void main(String[] args) {
        // Instantiate Scanner for console input streams
        Scanner input = new Scanner(System.in);

        // Primitive integer variable declarations
        int currentYear; // Variable to store the current calendar year
        int birthYear;   // Variable to store the user's birth year
        int age;         // Variable to store the calculated age

        // Interactive User Interface Inputs
        System.out.print("Enter current year: ");
        currentYear = input.nextInt();

        System.out.print("Enter birth year: ");
        birthYear = input.nextInt();

        // Subtraction expression and assignment execution
        // Age is calculated by subtracting birth year from current year
        age = currentYear - birthYear;

        // System output display of the calculated age
        System.out.println("Age = " + age);

        // Resource optimization: Close the Scanner to release resources
        input.close();
    }
}