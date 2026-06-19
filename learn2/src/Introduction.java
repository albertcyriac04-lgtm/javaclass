import java.util.Scanner;

/**
 * Introduction prompts the user to enter their demographic profile details
 * and prints a polite greeting and profile summary.
 *
 * This program demonstrates standard Java variables and simple terminal inputs.
 * It utilizes four distinct data types: String, int, double, and float.
 */
public class Introduction {

    /**
     * Entry point of the Introduction application.
     * Interactively reads name, age, height, and weight,
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
        name = sc.nextLine();

        // Prompt the user to enter their age
        System.out.print("Enter your age: ");
        age = sc.nextInt();

        // Prompt the user to enter their height
        System.out.print("Enter your height (in meters): ");
        height = sc.nextDouble();

        // Prompt the user to enter their weight
        System.out.print("Enter your weight (in kg): ");
        weight = sc.nextFloat();

        // Display the collected profile details
        System.out.println("\n--- User Profile ---");
        System.out.println("Hello " + name);
        System.out.println("Age: " + age + " years old");
        System.out.println("Height: " + height + " m");
        System.out.println("Weight: " + weight + " kg");

        // Close the scanner object to free up associated system resources
        sc.close();
    }
}
