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
 * This program demonstrates standard Java variables and simple terminal inputs.
 * It utilizes four distinct data types: String, int, double, and float.
 */
public class BoxDemo {

    /**
     * Entry point of the BoxDemo application.
     * Prompts the user for box details (label, count, and dimensions),
     * and displays calculations.
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
        label = input.nextLine();

        // Prompt the user to enter box quantity count
        System.out.print("Enter number of boxes: ");
        count = input.nextInt();

        // Prompt the user to enter box length
        System.out.print("Enter Box Length: ");
        length = input.nextDouble();

        // Prompt the user to enter box width
        System.out.print("Enter Box Width: ");
        width = input.nextDouble();

        // Prompt the user to enter box height
        System.out.print("Enter Box Height: ");
        height = input.nextDouble();

        // Instantiate Box class object using user input details
        Box box = new Box(label, length, width, height);
        
        // Display calculations output
        System.out.println("\n--- Box Details ---");
        box.display(count, density);

        // Close the scanner object to free up associated system resources
        input.close();
    }
}