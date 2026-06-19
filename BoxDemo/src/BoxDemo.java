/**
 * Represents a 3D Box with length, width, and height dimensions.
 * Demonstrates the concepts of data encapsulation (private fields),
 * constructor initialization, setter methods, and instance methods.
 */
class Box {
    // Private instance variables to enforce encapsulation
    private double length;
    private double width;
    private double height;

    /**
     * Constructor to initialize a Box object with specified dimensions.
     * 
     * @param l Length of the box.
     * @param w Width of the box.
     * @param h Height of the box.
     */
    public Box(double l, double w, double h) {
        length = l;
        width = w;
        height = h;
    }

    /**
     * Setter method to update the dimensions of the Box.
     * 
     * @param l New length of the box.
     * @param w New width of the box.
     * @param h New height of the box.
     */
    public void setDimensions(double l, double w, double h) {
        length = l;
        width = w;
        height = h;
    }

    /**
     * Computes the volume of the Box.
     * Volume formula: length * width * height.
     * 
     * @return The volume as a double.
     */
    public double calculateVolume() {
        return length * width * height;
    }

    /**
     * Displays the dimensions and the calculated volume of the Box on the console.
     */
    public void display() {
        System.out.println("Length : " + length);
        System.out.println("Width  : " + width);
        System.out.println("Height : " + height);
        System.out.println("Volume : " + calculateVolume());
    }
}

/**
 * Main application class to demonstrate creating and manipulating Box objects.
 */
public class BoxDemo {
    public static void main(String[] args) {

        // Instantiate two Box objects with different initial dimensions using the constructor
        Box box1 = new Box(10, 5, 4);
        Box box2 = new Box(6, 3, 2);

        // Display the details of the first box
        System.out.println("Box 1 Details");
        box1.display();

        System.out.println();

        // Display the details of the second box
        System.out.println("Box 2 Details");
        box2.display();

        // Update the dimensions of the second box using the setter method
        box2.setDimensions(8, 4, 3);

        // Display the details of the second box after updates
        System.out.println("\nAfter Changing Box 2 Dimensions");
        box2.display();
    }
}