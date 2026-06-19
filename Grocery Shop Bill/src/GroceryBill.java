import java.util.Scanner;

public class GroceryBill {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Constant declaring a 10% global discount rate
        final double DISCOUNT_RATE = 0.10;

        double item1, item2, item3;
        double total;
        double discountAmount;
        double finalAmount;

        System.out.print("Enter price of item 1: ");
        item1 = input.nextDouble();

        System.out.print("Enter price of item 2: ");
        item2 = input.nextDouble();

        System.out.print("Enter price of item 3: ");
        item3 = input.nextDouble();

        // Mathematical pipelines
        total = item1 + item2 + item3;
        discountAmount = total * DISCOUNT_RATE;
        finalAmount = total - discountAmount;

        System.out.println("Total = " + total);
        System.out.println("Discount = " + discountAmount);
        System.out.println("Final Amount = " + finalAmount);

        input.close();
    }
}