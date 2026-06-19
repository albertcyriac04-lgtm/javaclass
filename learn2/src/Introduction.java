import java.util.Scanner;

/**
 * Introduction prompts the user to enter their demographic profile details,
 * validates inputs, and prints a polite greeting and profile summary.
 *
 * This program demonstrates standard Java variables, simple input validations
 * without using loops, and resource management. It utilizes four distinct 
 * data types: String, int, double, and float.
 */
public class Introduction {

    /**
     * Entry point of the Introduction application.
     * Interactively reads name, age, height, and weight, validates them,
     * and displays a structured user profile to standard output.
     *
     * @param args Command-line arguments (not used in this application).
     */
    public static void main(String[] args) {
        // Instantiate a Scanner object to read user input from the console standard input stream
        Scanner sc = new Scanner(System.in);

        // --- Data Type Declarations ---
        
        // String data type: Stores the full name of the user
        String name;
        
        // int data type: Stores the age of the user in years
        int age;
        
        // double data type: Stores the user's height in meters
        double height;
        
        // float data type: Stores the user's weight in kilograms
        float weight;

        // Prompt the user to enter their name
        System.out.print("Enter your name: ");
        // Read and trim whitespace from user name
        name = sc.nextLine().trim();
        
        // Validation Step 1: Check if name string is empty
        if (name.isEmpty()) {
            System.out.println("Error: Name cannot be empty.");
            sc.close();
            return; // Terminate execution early due to validation failure
        }

        // Prompt the user to enter their age
        System.out.print("Enter your age: ");
        
        // Validation Step 2: Check if age input is a valid integer
        if (sc.hasNextInt()) {
            age = sc.nextInt();
            
            // Check if age value is non-negative
            if (age < 0) {
                System.out.println("Error: Age cannot be negative.");
                sc.close();
                return; // Terminate execution early due to validation failure
            }
        } else {
            System.out.println("Error: Age must be a valid integer.");
            sc.close();
            return; // Terminate execution early due to validation failure
        }

        // Prompt the user to enter their height
        System.out.print("Enter your height (in meters): ");
        
        // Validation Step 3: Check if height input is a valid double
        if (sc.hasNextDouble()) {
            height = sc.nextDouble();
            
            // Validate that height falls within realistic limits (0.0 to 3.0 meters)
            if (height <= 0.0 || height > 3.0) {
                System.out.println("Error: Height must be a realistic positive value (0 to 3 meters).");
                sc.close();
                return; // Terminate execution early due to validation failure
            }
        } else {
            System.out.println("Error: Height must be a valid number.");
            sc.close();
            return; // Terminate execution early due to validation failure
        }

        // Prompt the user to enter their weight
        System.out.print("Enter your weight (in kg): ");
        
        // Validation Step 4: Check if weight input is a valid float
        if (sc.hasNextFloat()) {
            weight = sc.nextFloat();
            
            // Validate that weight falls within realistic limits (0.0 to 500.0 kg)
            if (weight <= 0.0f || weight > 500.0f) {
                System.out.println("Error: Weight must be a realistic positive value.");
                sc.close();
                return; // Terminate execution early due to validation failure
            }
        } else {
            System.out.println("Error: Weight must be a valid float.");
            sc.close();
            return; // Terminate execution early due to validation failure
        }

        // Display the collected and validated profile details
        System.out.println("\n--- User Profile ---");
        System.out.println("Hello " + name);
        System.out.println("Age: " + age + " years old");
        System.out.println("Height: " + height + " m");
        System.out.println("Weight: " + weight + " kg");

        // Close the scanner object to free up associated system resources
        sc.close();
    }
}
