import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Required datatypes: String, int, double, float
        String appName = "Bare Minimum App";
        int runCode;
        double inputVal;
        float resultVal;

        System.out.println("Running: " + appName);
        System.out.print("Enter integer code: ");
        if (input.hasNextInt()) {
            runCode = input.nextInt();
            if (runCode > 0) {
                System.out.print("Enter decimal value: ");
                if (input.hasNextDouble()) {
                    inputVal = input.nextDouble();
                    resultVal = (float) (inputVal * runCode);
                    System.out.println("Result: " + resultVal);
                } else {
                    System.out.println("Error: Must be a valid decimal number.");
                }
            } else {
                System.out.println("Error: Code must be positive.");
            }
        } else {
            System.out.println("Error: Code must be an integer.");
        }

        input.close();
    }
}
