import java.util.Scanner;

public class SumOfIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;

        System.out.println("Enter integers to sum (enter 0 to stop):");

        do {
            number = scanner.nextInt();
            sum += number;
        } while (number != 0);

        System.out.println("The total sum is: " + sum);
        scanner.close();
    }
}
