import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // 1. Length of the string
        System.out.println("Length: " + input.length());

        // 2. Uppercase
        System.out.println("Uppercase: " + input.toUpperCase());

        // 3. Lowercase
        System.out.println("Lowercase: " + input.toLowerCase());

        // 4. First character
        if (!input.isEmpty()) {
            System.out.println("First character: " + input.charAt(0));
        }

        // 5. Last character
        if (!input.isEmpty()) {
            System.out.println("Last character: " + input.charAt(input.length() - 1));
        }

        // 6. Substring from 2nd to 5th character
        if (input.length() >= 5) {
            System.out.println("Substring (2nd to 5th): " + input.substring(1, 5));
        } else {
            System.out.println("Substring (2nd to 5th): Not enough characters.");
        }

        scanner.close();
    }
}