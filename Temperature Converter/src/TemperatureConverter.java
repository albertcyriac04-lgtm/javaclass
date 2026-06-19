import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Required datatypes: String, int, double, float
        String scale = "Celsius";
        int lowerLimit = -273;
        double celsius;
        float fahrenheit;

        System.out.print("Enter temperature in Celsius: ");
        if (input.hasNextDouble()) {
            celsius = input.nextDouble();
            // Simple validation: check if temperature is above absolute zero
            if (celsius >= lowerLimit) {
                fahrenheit = (float) ((celsius * 9.0 / 5.0) + 32.0);
                System.out.println("Fahrenheit (" + scale + " conversion) = " + fahrenheit);
            } else {
                System.out.println("Error: Temperature cannot be below " + lowerLimit + "°C.");
            }
        } else {
            System.out.println("Error: Invalid input. Please enter a valid number.");
        }

        input.close();
    }
}