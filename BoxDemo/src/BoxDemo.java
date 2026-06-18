class Box {
    // Instance variables
    private double length;
    private double width;
    private double height;

    // Constructor
    public Box(double l, double w, double h) {
        length = l;
        width = w;
        height = h;
    }

    // Setter method
    public void setDimensions(double l, double w, double h) {
        length = l;
        width = w;
        height = h;
    }

    // Calculate volume
    public double calculateVolume() {
        return length * width * height;
    }

    // Display details
    public void display() {
        System.out.println("Length : " + length);
        System.out.println("Width  : " + width);
        System.out.println("Height : " + height);
        System.out.println("Volume : " + calculateVolume());
    }
}

public class BoxDemo {
    public static void main(String[] args) {

        // Create objects
        Box box1 = new Box(10, 5, 4);
        Box box2 = new Box(6, 3, 2);

        System.out.println("Box 1 Details");
        box1.display();

        System.out.println();

        System.out.println("Box 2 Details");
        box2.display();

        // Using setter method
        box2.setDimensions(8, 4, 3);

        System.out.println("\nAfter Changing Box 2 Dimensions");
        box2.display();
    }
}