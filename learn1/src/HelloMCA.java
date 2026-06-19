import java.util.Scanner;

/**
 * HelloMCA displays a welcoming banner for an MCA student after retrieving
 * student profile and tuition metadata.
 *
 * This program demonstrates standard Java variables and calculations.
 * It utilizes four distinct data types: String, int, double, and float.
 */
public class HelloMCA {

    /**
     * Entry point of the HelloMCA application.
     * Interactively prompts for name, admission year, base fee, and discount percent,
     * calculates the net tuition, and prints a receipt.
     *
     * @param args Command-line arguments (not used in this application).
     */
    public static void main(String[] args) {
        // Instantiate a Scanner object to read user input from the console standard input stream
        Scanner input = new Scanner(System.in);

        // --- Data Type Declarations ---
        
        // String data type: Stores the full name of the student
        String studentName;
        
        // int data type: Stores the student's admission year
        int admissionYear;
        
        // double data type: Stores the base tuition fee amount
        double tuitionFee;
        
        // float data type: Stores the discount percentage (0 to 100) applied
        float discountPercent;

        // Prompt the user to enter student name
        System.out.print("Enter Student Name: ");
        studentName = input.nextLine();

        // Prompt the user to enter admission year
        System.out.print("Enter Admission Year: ");
        admissionYear = input.nextInt();

        // Prompt the user to enter base tuition fee
        System.out.print("Enter annual tuition fee: ");
        tuitionFee = input.nextDouble();

        // Prompt the user to enter discount percentage
        System.out.print("Enter scholarship discount percentage (0-100): ");
        discountPercent = input.nextFloat();

        // Calculate the final tuition fee amount after applying the percentage discount
        double finalFee = tuitionFee * (1.0 - (discountPercent / 100.0));

        // Display welcoming header and final calculation outcomes
        System.out.println("\n--- Hello MCA Student ---");
        System.out.println("Welcome, " + studentName + " (Batch: " + admissionYear + ")");
        System.out.println("Base Tuition Fee: " + tuitionFee);
        System.out.println("Scholarship Discount: " + discountPercent + "%");
        // Cast the double calculation to a float to print
        System.out.println("Final Calculated Tuition Fee: " + (float) finalFee);

        // Close the scanner object to free up associated system resources
        input.close();
    }
}
