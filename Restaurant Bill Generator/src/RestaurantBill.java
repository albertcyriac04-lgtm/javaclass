import java.util.Scanner;

public class RestaurantBill {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final double GST_RATE = 0.05;
        final double SERVICE_RATE = 0.10;

        double foodCost;
        double gst;
        double serviceCharge;
        double total;

        System.out.print("Enter food cost: ");
        foodCost = input.nextDouble();

        gst = foodCost * GST_RATE;
        serviceCharge = foodCost * SERVICE_RATE;

        total = foodCost + gst + serviceCharge;

        System.out.println("GST = " + gst);
        System.out.println("Service Charge = " + serviceCharge);
        System.out.println("Final Bill = " + total);
    }
}


