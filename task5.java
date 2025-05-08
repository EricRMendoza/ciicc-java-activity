/* Task 5: Check whose largest number in 3 inputs
Write a program that takes in three numbers from the user 
and outputs the largest number. If all numbers are 
equal, it will print "All numbers are equal." */
public class task5 {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Prompt the user for three numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Determine the largest number
        if (num1 == num2 && num2 == num3) {
            System.out.println("All numbers are equal.");
        } else if (num1 >= num2 && num1 >= num3) {
            System.out.println("The largest number is: " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("The largest number is: " + num2);
        } else {
            System.out.println("The largest number is: " + num3);
        }

        // Close the scanner
        scanner.close();
    }
}