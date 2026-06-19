/**
 * MobileDataUsageCalculator computes the remaining mobile data balance
 * in gigabytes (GB) based on a default data ceiling and user usage input.
 */
import java.util.Scanner;

public class MobileDataUsageCalculator {

    public static void main(String[] args) {
        // Instantiate Scanner for console input streams
        Scanner input = new Scanner(System.in);

        // Define immutable systemic baseline ceiling (30 GB limit)
        final double DATA_LIMIT = 30.0;

        // Declarations for usage tracking
        double usedData;      // Data consumed in GB (user input)
        double remainingData; // Data left over in GB (calculated)

        // Read used data input
        System.out.print("Enter data used in GB: ");
        usedData = input.nextDouble();

        // Algorithmic tracking logic: Subtract consumption from systemic limit
        remainingData = DATA_LIMIT - usedData;

        // Print details to the console
        System.out.println("Used: " + usedData + " GB");
        System.out.println("Remaining: " + remainingData + " GB");

        // Close the scanner resource to optimize system memory
        input.close();
    }
}