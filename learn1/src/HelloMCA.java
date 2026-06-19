import java.util.Scanner;

/**
 * HelloMCA displays a welcoming banner for an MCA student after retrieving
 * and validating student profile and tuition metadata.
 *
 * This program demonstrates standard Java variables, simple input validations
 * without using loops, and resource management. It utilizes four distinct 
 * data types: String, int, double, and float.
 */
public class HelloMCA {

    /**
     * Entry point of the HelloMCA application.
     * Interactively prompts for name, admission year, base fee, and discount percent,
     * performs step-by-step validations, calculates the net tuition, and prints a receipt.
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
        
        // double data type: Stores the high-precision base tuition fee amount
        double tuitionFee;
        
        // float data type: Stores the discount percentage (0 to 100) applied
        float discountPercent;

        // Prompt the user to enter student name
        System.out.print("Enter Student Name: ");
        // Read and trim whitespace from student name input
        studentName = input.nextLine().trim();
        
        // Validation Step 1: Check if name string is empty
        if (studentName.isEmpty()) {
            System.out.println("Error: Name cannot be empty.");
            input.close();
            return; // Terminate execution early due to validation failure
        }

        // Prompt the user to enter admission year
        System.out.print("Enter Admission Year: ");
        
        // Validation Step 2: Check if year input is a valid integer
        if (input.hasNextInt()) {
            admissionYear = input.nextInt();
            
            // Validate that the admission year falls within a realistic bounds (2000 to 2100)
            if (admissionYear < 2000 || admissionYear > 2100) {
                System.out.println("Error: Admission year must be between 2000 and 2100.");
                input.close();
                return; // Terminate execution early due to validation failure
            }
        } else {
            System.out.println("Error: Admission year must be a valid integer.");
            input.close();
            return; // Terminate execution early due to validation failure
        }

        // Prompt the user to enter base tuition fee
        System.out.print("Enter annual tuition fee: ");
        
        // Validation Step 3: Check if tuition fee input is a valid double
        if (input.hasNextDouble()) {
            tuitionFee = input.nextDouble();
            
            // Validate that the tuition fee is a positive non-zero value
            if (tuitionFee <= 0) {
                System.out.println("Error: Tuition fee must be positive.");
                input.close();
                return; // Terminate execution early due to validation failure
            }
        } else {
            System.out.println("Error: Tuition fee must be a valid number.");
            input.close();
            return; // Terminate execution early due to validation failure
        }

        // Prompt the user to enter discount percentage
        System.out.print("Enter scholarship discount percentage (0-100): ");
        
        // Validation Step 4: Check if discount input is a valid float
        if (input.hasNextFloat()) {
            discountPercent = input.nextFloat();
            
            // Validate that the discount percentage is between 0.0 and 100.0
            if (discountPercent < 0.0f || discountPercent > 100.0f) {
                System.out.println("Error: Discount percentage must be between 0.0 and 100.0.");
                input.close();
                return; // Terminate execution early due to validation failure
            }
        } else {
            System.out.println("Error: Discount must be a valid float.");
            input.close();
            return; // Terminate execution early due to validation failure
        }

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
