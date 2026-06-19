import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double celsius;
        double fahrenheit;

        System.out.print("Enter temperature in Celsius: ");
        celsius = input.nextDouble();

        // Evaluates using double literals (9.0 / 5.0) to enforce precise floating-point math
        fahrenheit = (celsius * 9.0 / 5.0) + 32.0;

        System.out.println("Fahrenheit = " + fahrenheit);

        input.close();
    }
}