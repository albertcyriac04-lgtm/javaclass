// This program utilizes the unnamed/implicit class and instance main method feature (Java 21+ preview).
// The class wrapper is omitted, allowing the method to run directly.

/**
 * Entry point of the implicit main program.
 */
void main() {
    // Prints a welcome message to standard output using the implicit IO utility
    IO.println(String.format("Hello and welcome!"));

    // Iterate through a for loop from 1 to 5
    for (int i = 1; i <= 5; i++) {
        // Print the current iteration index
        IO.println("i = " + i);
    }
}
