import java.util.Scanner;

/**
 * Represents a Student entity with basic demographic and academic details.
 * Encapsulates the fields utilizing String, int, double, and float datatypes.
 */
class Student {
    // String data type: Stores the full name of the student
    String name;
    
    // int data type: Stores the age of the student
    int age;
    
    // double data type: Stores the academic score (out of 100) of the student
    double marks;
    
    // float data type: Stores the calculated GPA (out of 4.0) of the student
    float gpa;
}

/**
 * Main application class to demonstrate creating a Student object,
 * prompting the user for details, executing validations, and printing findings.
 */
public class Main {

    /**
     * Entry point of the task1 Main application.
     * Interactively reads student profile info, runs validations without loops,
     * calculates a simple GPA, and prints a receipt.
     *
     * @param args Command-line arguments (not used in this application).
     */
    public static void main(String[] args) {
        // Instantiate a Scanner object to read user input from the console standard input stream
        Scanner input = new Scanner(System.in);
        
        // Instantiate a new Student object to populate
        Student s1 = new Student();

        // Prompt the user to enter the student name
        System.out.print("Enter student name: ");
        // Read and trim whitespace from student name
        s1.name = input.nextLine().trim();
        
        // Validation Step 1: Check if the name string is empty
        if (s1.name.isEmpty()) {
            System.out.println("Error: Name cannot be empty.");
            input.close();
            return; // Terminate execution early due to validation failure
        }

        // Prompt the user to enter student age
        System.out.print("Enter student age: ");
        
        // Validation Step 2: Check if age input is a valid integer
        if (input.hasNextInt()) {
            s1.age = input.nextInt();
            
            // Check if the age is a positive non-zero integer
            if (s1.age <= 0) {
                System.out.println("Error: Age must be a positive integer.");
                input.close();
                return; // Terminate execution early due to validation failure
            }
        } else {
            System.out.println("Error: Age must be a valid integer.");
            input.close();
            return; // Terminate execution early due to validation failure
        }

        // Prompt the user to enter marks
        System.out.print("Enter student marks (0 to 100): ");
        
        // Validation Step 3: Check if marks input is a valid double
        if (input.hasNextDouble()) {
            s1.marks = input.nextDouble();
            
            // Check if the marks fall within the valid academic range (0.0 to 100.0)
            if (s1.marks < 0.0 || s1.marks > 100.0) {
                System.out.println("Error: Marks must be between 0.0 and 100.0.");
                input.close();
                return; // Terminate execution early due to validation failure
            }
        } else {
            System.out.println("Error: Marks must be a valid decimal number.");
            input.close();
            return; // Terminate execution early due to validation failure
        }

        // Calculation: Map marks (out of 100) to GPA (out of 4.0)
        // Cast the double computation to a float to match the datatype of the gpa field
        s1.gpa = (float) (s1.marks / 25.0);

        // Display the populated and validated student details
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + s1.name);
        System.out.println("Age: " + s1.age);
        System.out.println("Marks: " + s1.marks);
        System.out.println("GPA: " + s1.gpa);

        // Close the scanner object to free up associated system resources
        input.close();
    }
}