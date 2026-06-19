/**
 * TemperatureConverter converts a user-entered temperature from Celsius
 * to Fahrenheit using standard mathematical formulas.
 */
import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        // Instantiate Scanner for console input streams
        Scanner input = new Scanner(System.in);

        // Declare variables for input and output values
        double celsius;    // Temperature in Celsius degree
        double fahrenheit; // Calculated temperature in Fahrenheit degree

        // Interactive User Interface Inputs
        System.out.print("Enter temperature in Celsius: ");
        celsius = input.nextDouble();

        // Evaluates using double literals (9.0 / 5.0) to enforce precise floating-point math.
        // Fahrenheit formula: (Celsius * 9/5) + 32
        fahrenheit = (celsius * 9.0 / 5.0) + 32.0;

        // Display the converted temperature
        System.out.println("Fahrenheit = " + fahrenheit);

        // Resource optimization: Close the Scanner to free up system resources
        input.close();
    }
}