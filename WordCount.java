import java.util.Scanner;
public class WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine().trim();

        if (input.isEmpty()) {
            System.out.println("Number of words: 0");
        } else {
            // Split the input by spaces (one or more spaces)
            String[] words = input.split("\\s+");
            System.out.println("Number of words: " + words.length);
        }

        scanner.close();
    }
}