import java.util.Scanner;

class Box {
    private String label;
    private double length;
    private double width;
    private double height;

    public Box(String label, double l, double w, double h) {
        this.label = label;
        this.length = l;
        this.width = w;
        this.height = h;
    }

    public double calculateVolume() {
        return length * width * height;
    }

    public void display(int count, float density) {
        double volume = calculateVolume();
        float mass = (float) (volume * density);
        System.out.println("Box Label: " + label);
        System.out.println("Count: " + count);
        System.out.println("Dimensions: " + length + " x " + width + " x " + height);
        System.out.println("Volume: " + volume + " cubic units");
        System.out.println("Density: " + density + " units/vol");
        System.out.println("Calculated Mass: " + mass);
    }
}

public class BoxDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Required datatypes: String, int, double, float
        String label;
        int count;
        double length, width, height;
        float density = 1.25f;

        // 1. String validation
        System.out.print("Enter Box Label: ");
        label = input.nextLine().trim();
        if (label.isEmpty()) {
            System.out.println("Error: Box label cannot be empty.");
            input.close();
            return;
        }

        // 2. int validation
        System.out.print("Enter number of boxes: ");
        if (input.hasNextInt()) {
            count = input.nextInt();
            if (count <= 0) {
                System.out.println("Error: Box count must be positive.");
                input.close();
                return;
            }
        } else {
            System.out.println("Error: Box count must be a valid integer.");
            input.close();
            return;
        }

        // 3. double validation (length)
        System.out.print("Enter Box Length: ");
        if (input.hasNextDouble()) {
            length = input.nextDouble();
            if (length <= 0) {
                System.out.println("Error: Length must be positive.");
                input.close();
                return;
            }
        } else {
            System.out.println("Error: Length must be a valid number.");
            input.close();
            return;
        }

        // double validation (width)
        System.out.print("Enter Box Width: ");
        if (input.hasNextDouble()) {
            width = input.nextDouble();
            if (width <= 0) {
                System.out.println("Error: Width must be positive.");
                input.close();
                return;
            }
        } else {
            System.out.println("Error: Width must be a valid number.");
            input.close();
            return;
        }

        // double validation (height)
        System.out.print("Enter Box Height: ");
        if (input.hasNextDouble()) {
            height = input.nextDouble();
            if (height <= 0) {
                System.out.println("Error: Height must be positive.");
                input.close();
                return;
            }
        } else {
            System.out.println("Error: Height must be a valid number.");
            input.close();
            return;
        }

        // Create box and display info
        Box box = new Box(label, length, width, height);
        System.out.println("\n--- Box Details ---");
        box.display(count, density);

        input.close();
    }
}