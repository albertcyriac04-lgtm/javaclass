import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Required datatypes: String, int, double, float
        String messageType;
        int count;
        double limitValue;
        float actualValue;

        // 1. String validation
        System.out.print("Enter category/type: ");
        messageType = input.nextLine().trim();
        if (messageType.isEmpty()) {
            System.out.println("Error: Category cannot be empty.");
            input.close();
            return;
        }

        // 2. int validation
        System.out.print("Enter item count: ");
        if (input.hasNextInt()) {
            count = input.nextInt();
            if (count <= 0) {
                System.out.println("Error: Count must be greater than zero.");
                input.close();
                return;
            }
        } else {
            System.out.println("Error: Count must be a valid integer.");
            input.close();
            return;
        }

        // 3. double validation
        System.out.print("Enter limit value: ");
        if (input.hasNextDouble()) {
            limitValue = input.nextDouble();
            if (limitValue <= 0.0) {
                System.out.println("Error: Limit must be greater than zero.");
                input.close();
                return;
            }
        } else {
            System.out.println("Error: Limit must be a valid decimal number.");
            input.close();
            return;
        }

        // 4. float validation
        System.out.print("Enter actual value: ");
        if (input.hasNextFloat()) {
            actualValue = input.nextFloat();
            if (actualValue < 0.0f) {
                System.out.println("Error: Actual value cannot be negative.");
                input.close();
                return;
            }
        } else {
            System.out.println("Error: Actual value must be a valid float.");
            input.close();
            return;
        }

        // Print final status
        System.out.println("\n--- Status Report ---");
        System.out.println("Category: " + messageType);
        System.out.println("Count: " + count);
        System.out.println("Limit: " + limitValue);
        System.out.println("Actual: " + actualValue);

        input.close();
    }
}
