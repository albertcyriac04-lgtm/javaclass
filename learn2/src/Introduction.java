/**
 * Introduction program prompts the user to enter their name and age,
 * and then prints a polite greeting and message indicating their age.
 */
import java.util.Scanner;

public class Introduction {
    public static void main(String[] args) {
        // Instantiate Scanner for console input streams
        Scanner sc = new Scanner(System.in);

        // Prompt the user for their name and read as a line of text
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // Prompt the user for their age and read as an integer
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // Print greetings and information
        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old.");

        // Close scanner resource to optimize system memory
        sc.close();
    }
}
