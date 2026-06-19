/**
 * Factorialfn demonstrates how to calculate the factorial of a number
 * recursively in Java.
 */
class Factorialfn {

    /**
     * Calculates the factorial of an integer n recursively.
     * Factorial of n (n!) = n * (n-1) * (n-2) * ... * 1.
     * 
     * @param n The integer value to compute the factorial for.
     * @return The factorial of n.
     */
    static int Factorialfn(int n) {
        // Base case / stopping condition: factorial of 1 is 1
        if (n == 1) {
            return 1;
        }

        // Recursive case: n! = n * (n - 1)!
        return n * Factorialfn(n - 1);
    }

    /**
     * Entry point of the factorial application.
     */
    public static void main(String args[]) {
        // Compute and print the factorial of 10
        System.out.println(Factorialfn(10));
    }
}

