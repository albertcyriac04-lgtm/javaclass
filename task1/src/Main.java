import java.util.Scanner;

/**
 * Represents a Student entity using String, int, double, and float datatypes.
 */
class Student {
    String name;   // String datatype
    int age;       // int datatype
    double marks;  // double datatype
    float gpa;     // float datatype
}

/**
 * Main entry point of the application to demonstrate Student object creation and validation.
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student s1 = new Student();

        // 1. String validation
        System.out.print("Enter student name: ");
        s1.name = input.nextLine().trim();
        if (s1.name.isEmpty()) {
            System.out.println("Error: Name cannot be empty.");
            input.close();
            return;
        }

        // 2. int validation
        System.out.print("Enter student age: ");
        if (input.hasNextInt()) {
            s1.age = input.nextInt();
            if (s1.age <= 0) {
                System.out.println("Error: Age must be a positive integer.");
                input.close();
                return;
            }
        } else {
            System.out.println("Error: Age must be a valid integer.");
            input.close();
            return;
        }

        // 3. double validation
        System.out.print("Enter student marks (0 to 100): ");
        if (input.hasNextDouble()) {
            s1.marks = input.nextDouble();
            if (s1.marks < 0.0 || s1.marks > 100.0) {
                System.out.println("Error: Marks must be between 0.0 and 100.0.");
                input.close();
                return;
            }
        } else {
            System.out.println("Error: Marks must be a valid decimal number.");
            input.close();
            return;
        }

        // 4. float usage: calculate a simple GPA out of 4.0
        s1.gpa = (float) (s1.marks / 25.0);

        // Display results
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + s1.name);
        System.out.println("Age: " + s1.age);
        System.out.println("Marks: " + s1.marks);
        System.out.println("GPA: " + s1.gpa);

        input.close();
    }
}