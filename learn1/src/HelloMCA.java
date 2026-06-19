import java.util.Scanner;

public class HelloMCA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Required datatypes: String, int, double, float
        String studentName;
        int admissionYear;
        double tuitionFee;
        float discountPercent;

        // 1. String validation
        System.out.print("Enter Student Name: ");
        studentName = input.nextLine().trim();
        if (studentName.isEmpty()) {
            System.out.println("Error: Name cannot be empty.");
            input.close();
            return;
        }

        // 2. int validation
        System.out.print("Enter Admission Year: ");
        if (input.hasNextInt()) {
            admissionYear = input.nextInt();
            if (admissionYear < 2000 || admissionYear > 2100) {
                System.out.println("Error: Admission year must be between 2000 and 2100.");
                input.close();
                return;
            }
        } else {
            System.out.println("Error: Admission year must be a valid integer.");
            input.close();
            return;
        }

        // 3. double validation
        System.out.print("Enter annual tuition fee: ");
        if (input.hasNextDouble()) {
            tuitionFee = input.nextDouble();
            if (tuitionFee <= 0) {
                System.out.println("Error: Tuition fee must be positive.");
                input.close();
                return;
            }
        } else {
            System.out.println("Error: Tuition fee must be a valid number.");
            input.close();
            return;
        }

        // 4. float validation
        System.out.print("Enter scholarship discount percentage (0-100): ");
        if (input.hasNextFloat()) {
            discountPercent = input.nextFloat();
            if (discountPercent < 0.0f || discountPercent > 100.0f) {
                System.out.println("Error: Discount percentage must be between 0.0 and 100.0.");
                input.close();
                return;
            }
        } else {
            System.out.println("Error: Discount must be a valid float.");
            input.close();
            return;
        }

        // Calculations
        double finalFee = tuitionFee * (1.0 - (discountPercent / 100.0));

        // Display results
        System.out.println("\n--- Hello MCA Student ---");
        System.out.println("Welcome, " + studentName + " (Batch: " + admissionYear + ")");
        System.out.println("Base Tuition Fee: " + tuitionFee);
        System.out.println("Scholarship Discount: " + discountPercent + "%");
        System.out.println("Final Calculated Tuition Fee: " + (float) finalFee);

        input.close();
    }
}
