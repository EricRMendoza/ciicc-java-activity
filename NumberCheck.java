import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if number is positive, negative, or zero
        if (number > 0) {
            System.out.println("The number is Positive.");
        } else if (number < 0) {
            System.out.println("The number is Negative.");
        } else {
            System.out.println("The number is Zero.");
        }

        // Check if number is even or odd
        if (number != 0) {
            if (number % 2 == 0) {
                System.out.println("The number is Even.");
            } else {
                System.out.println("The number is Odd.");
            }
        }

        scanner.close();
    }
}