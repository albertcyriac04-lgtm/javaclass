import java.util.Scanner;

public class Introduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Required datatypes: String, int, double, float
        String name;
        int age;
        double height;
        float weight;

        // 1. String validation
        System.out.print("Enter your name: ");
        name = sc.nextLine().trim();
        if (name.isEmpty()) {
            System.out.println("Error: Name cannot be empty.");
            sc.close();
            return;
        }

        // 2. int validation
        System.out.print("Enter your age: ");
        if (sc.hasNextInt()) {
            age = sc.nextInt();
            if (age < 0) {
                System.out.println("Error: Age cannot be negative.");
                sc.close();
                return;
            }
        } else {
            System.out.println("Error: Age must be a valid integer.");
            sc.close();
            return;
        }

        // 3. double validation
        System.out.print("Enter your height (in meters): ");
        if (sc.hasNextDouble()) {
            height = sc.nextDouble();
            if (height <= 0.0 || height > 3.0) {
                System.out.println("Error: Height must be a realistic positive value (0 to 3 meters).");
                sc.close();
                return;
            }
        } else {
            System.out.println("Error: Height must be a valid number.");
            sc.close();
            return;
        }

        // 4. float validation
        System.out.print("Enter your weight (in kg): ");
        if (sc.hasNextFloat()) {
            weight = sc.nextFloat();
            if (weight <= 0.0f || weight > 500.0f) {
                System.out.println("Error: Weight must be a realistic positive value.");
                sc.close();
                return;
            }
        } else {
            System.out.println("Error: Weight must be a valid float.");
            sc.close();
            return;
        }

        // Display results
        System.out.println("\n--- User Profile ---");
        System.out.println("Hello " + name);
        System.out.println("Age: " + age + " years old");
        System.out.println("Height: " + height + " m");
        System.out.println("Weight: " + weight + " kg");

        sc.close();
    }
}
