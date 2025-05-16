import java.util.Scanner;

public class Task7 {

    // Addition method
    static int add(int a, int b) {
        return a + b;
    }

    // Subtraction method
    static int subtract(int a, int b) {
        return a - b;
    }

    // Multiplication method
    static int multiply(int a, int b) {
        return a * b;
    }

    // Division method
    static int divide(int a, int b) {
        return a / b; // Assumes b is not zero
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Perform operations
        System.out.println("Addition: " + add(num1, num2));
        System.out.println("Subtraction: " + subtract(num1, num2));
        System.out.println("Multiplication: " + multiply(num1, num2));
        
        if (num2 != 0) {
            System.out.println("Division: " + divide(num1, num2));
        } else {
            System.out.println("Cannot divide by zero.");
        }

        sc.close();
    }
}   

