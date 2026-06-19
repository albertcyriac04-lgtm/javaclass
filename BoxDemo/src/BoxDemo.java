import java.util.Scanner;

/**
 * Represents a 3D Box with length, width, and height dimensions.
 * Demonstrates basic encapsulation and volume calculations.
 */
class Box {
    // String data type: Stores a unique label or name of the box
    private String label;
    
    // double data type: Stores the length dimension of the box
    private double length;
    
    // double data type: Stores the width dimension of the box
    private double width;
    
    // double data type: Stores the height dimension of the box
    private double height;

    /**
     * Constructor to initialize a Box object with specified details.
     *
     * @param label Unique label of the box.
     * @param l Length of the box.
     * @param w Width of the box.
     * @param h Height of the box.
     */
    public Box(String label, double l, double w, double h) {
        this.label = label;
        this.length = l;
        this.width = w;
        this.height = h;
    }

    /**
     * Calculates the volume of the box.
     * Volume formula: length * width * height.
     *
     * @return The volume as a double.
     */
    public double calculateVolume() {
        return length * width * height;
    }

    /**
     * Displays details of the box, including quantity and calculated mass.
     *
     * @param count The number of boxes (int).
     * @param density The substance density (float).
     */
    public void display(int count, float density) {
        double volume = calculateVolume();
        // Calculate mass (volume * density) and cast to float
        float mass = (float) (volume * density);
        
        System.out.println("Box Label: " + label);
        System.out.println("Count: " + count);
        System.out.println("Dimensions: " + length + " x " + width + " x " + height);
        System.out.println("Volume: " + volume + " cubic units");
        System.out.println("Density: " + density + " units/vol");
        System.out.println("Calculated Mass: " + mass);
    }
}

/**
 * Main application class to demonstrate creating and manipulating Box objects.
 *
 * This program demonstrates standard Java variables, simple input validations
 * without using loops, and resource management. It utilizes four distinct 
 * data types: String, int, double, and float.
 */
public class BoxDemo {

    /**
     * Entry point of the BoxDemo application.
     * Prompts the user for box details (label, count, and dimensions), performs
     * step-by-step validations, and displays calculations.
     *
     * @param args Command-line arguments (not used in this application).
     */
    public static void main(String[] args) {
        // Instantiate a Scanner object to read user input from the console standard input stream
        Scanner input = new Scanner(System.in);

        // --- Data Type Declarations ---
        
        // String data type: Stores user input box label
        String label;
        
        // int data type: Stores the quantity count of boxes
        int count;
        
        // double data type: Stores the dimensions of the box
        double length, width, height;
        
        // float data type: Represents the density of material stored in the box
        float density = 1.25f;

        // Prompt the user to enter box label
        System.out.print("Enter Box Label: ");
        // Read and trim whitespace from box label input
        label = input.nextLine().trim();
        
        // Validation Step 1: Check if box label string is empty
        if (label.isEmpty()) {
            System.out.println("Error: Box label cannot be empty.");
            input.close();
            return; // Terminate execution early due to validation failure
        }

        // Prompt the user to enter box quantity count
        System.out.print("Enter number of boxes: ");
        
        // Validation Step 2: Check if box count input is a valid integer
        if (input.hasNextInt()) {
            count = input.nextInt();
            
            // Check if count is a positive non-zero integer
            if (count <= 0) {
                System.out.println("Error: Box count must be positive.");
                input.close();
                return; // Terminate execution early due to validation failure
            }
        } else {
            System.out.println("Error: Box count must be a valid integer.");
            input.close();
            return; // Terminate execution early due to validation failure
        }

        // Prompt the user to enter box length
        System.out.print("Enter Box Length: ");
        
        // Validation Step 3: Check if length input is a valid double
        if (input.hasNextDouble()) {
            length = input.nextDouble();
            
            // Check if length is positive and greater than zero
            if (length <= 0) {
                System.out.println("Error: Length must be positive.");
                input.close();
                return; // Terminate execution early due to validation failure
            }
        } else {
            System.out.println("Error: Length must be a valid number.");
            input.close();
            return; // Terminate execution early due to validation failure
        }

        // Prompt the user to enter box width
        System.out.print("Enter Box Width: ");
        
        // Validation Step 4: Check if width input is a valid double
        if (input.hasNextDouble()) {
            width = input.nextDouble();
            
            // Check if width is positive and greater than zero
            if (width <= 0) {
                System.out.println("Error: Width must be positive.");
                input.close();
                return; // Terminate execution early due to validation failure
            }
        } else {
            System.out.println("Error: Width must be a valid number.");
            input.close();
            return; // Terminate execution early due to validation failure
        }

        // Prompt the user to enter box height
        System.out.print("Enter Box Height: ");
        
        // Validation Step 5: Check if height input is a valid double
        if (input.hasNextDouble()) {
            height = input.nextDouble();
            
            // Check if height is positive and greater than zero
            if (height <= 0) {
                System.out.println("Error: Height must be positive.");
                input.close();
                return; // Terminate execution early due to validation failure
            }
        } else {
            System.out.println("Error: Height must be a valid number.");
            input.close();
            return; // Terminate execution early due to validation failure
        }

        // Instantiate Box class object using user input details
        Box box = new Box(label, length, width, height);
        
        // Display calculations output
        System.out.println("\n--- Box Details ---");
        box.display(count, density);

        // Close the scanner object to free up associated system resources
        input.close();
    }
}