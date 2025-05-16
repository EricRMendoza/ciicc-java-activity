import java.util.Scanner;
public class StringBuilderExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input;
        // Prompt until user enters a string with at least 10 characters
        do {
            System.out.print("Enter a string (at least 10 characters): ");
            input = scanner.nextLine();
        } while (input.length() < 10);

        StringBuilder sb = new StringBuilder(input);

        // 1. Print the length of the string
        System.out.println("Length: " + sb.length());

        // 2. Print the first character
        System.out.println("First character: " + sb.charAt(0));

        // 3. Print the last character
        System.out.println("Last character: " + sb.charAt(sb.length() - 1));

        // 4. Print index of first occurrence of 'a'
        int indexA = sb.indexOf("a");
        if (indexA != -1) {
            System.out.println("Index of first 'a': " + indexA);
        } else {
            System.out.println("No 'a' found in the string.");
        }

        // 5. Print substring from index 3 to 6 (exclusive)
        // Check if string length is enough for substring (at least 7 chars)
        if (sb.length() >= 7) {
            System.out.println("Substring (3 to 6): " + sb.substring(3, 7));
        } else {
            System.out.println("String too short for substring (3 to 6).");
        }

        // 6. Append "123"
        sb.append("123");
        System.out.println("After append: " + sb);

        // 7. Insert "xyz" at index 4
        if (sb.length() >= 4) {
            sb.insert(4, "xyz");
            System.out.println("After insert: " + sb);
        } else {
            System.out.println("String too short to insert at index 4.");
        }

        // 8. Delete substring from index 2 to 4 (exclusive)
        if (sb.length() >= 4) {
            sb.delete(2, 4);
            System.out.println("After delete (2 to 4): " + sb);
        } else {
            System.out.println("String too short to delete substring (2 to 4).");
        }

        // 9. Delete character at index 8
        if (sb.length() > 8) {
            sb.deleteCharAt(8);
            System.out.println("After deleteCharAt(8): " + sb);
        } else {
            System.out.println("String too short to delete char at index 8.");
        }

        // 10. Reverse the string and print it
        sb.reverse();
        System.out.println("Reversed string: " + sb);

        scanner.close();
    }
}