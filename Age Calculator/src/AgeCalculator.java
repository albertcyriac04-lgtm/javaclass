import java.util.Scanner;

public class AgeCalculator {

    public static void main(String[] args) {
        // Instantiate Scanner for console input streams
        Scanner input = new Scanner(System.in);

        // Primitive integer variable declarations
        int currentYear;
        int birthYear;
        int age;

        // Interactive User Interface Inputs
        System.out.print("Enter current year: ");
        currentYear = input.nextInt();

        System.out.print("Enter birth year: ");
        birthYear = input.nextInt();

        // Subtraction expression and assignment execution
        age = currentYear - birthYear;

        // System output display
        System.out.println("Age = " + age);

        // Resource optimization
        input.close();
    }
}