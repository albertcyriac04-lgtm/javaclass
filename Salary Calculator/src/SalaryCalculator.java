import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final double DA_RATE = 0.20;
        final double HRA_RATE = 0.10;

        double basicSalary;
        double da;
        double hra;
        double grossSalary;

        System.out.print("Enter basic salary: ");
        basicSalary = input.nextDouble();

        da = basicSalary * DA_RATE;
        hra = basicSalary * HRA_RATE;

        grossSalary = basicSalary + da + hra;

        System.out.println("DA = " + da);
        System.out.println("HRA = " + hra);
        System.out.println("Gross Salary = " + grossSalary);
    }
}
