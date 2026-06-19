/**
 * Represents a Student entity with properties such as name, age, and roll number.
 * Note: Having duplicate class declarations in the same namespace or file causes compilation errors in Java.
 */
class Student {

    String name;  // Name of the student
    int age;      // Age of the student
    int rollNo;   // Roll number of the student

}

/**
 * Alternative declaration of the Student class (omitting rollNo).
 */
class Student2 { // Renamed from Student to Student2 to prevent compilation errors if compiled

    String name;  // Name of the student
    int age;      // Age of the student

}

/**
 * Main entry point of the application to demonstrate Student object creation.
 */
public class Main {

    public static void main(String[] args) {
        // Instantiate a new Student object
        Student s1 = new Student();
    }
}