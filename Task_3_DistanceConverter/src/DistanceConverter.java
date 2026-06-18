import java.util.Scanner;

public class DistanceConverter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double kilometers;
        double meters;
        double centimeters;

        System.out.print("Enter distance in km: ");
        kilometers = input.nextDouble();

        meters = kilometers * 1000;
        centimeters = meters * 100;

        System.out.println("Meters = " + meters);
        System.out.println("Centimeters = " + centimeters);
    }
}
