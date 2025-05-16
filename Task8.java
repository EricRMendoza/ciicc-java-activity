public class Task8 {

    // Method using varArgs to accept multiple integers
    static int calculateCumulativeSum(int... numbers) {
        int totalSum = 0;

        // Loop through each number in the varArgs array
        for (int num : numbers) {
            int sum = 0;

            // Calculate sum from 1 to num (cumulative sum)
            for (int i = 1; i <= num; i++) {
                sum += i;
            }

            // Print the cumulative sum for this number
            System.out.println("Cumulative sum of " + num + " = " + sum);

            // Add this cumulative sum to total
            totalSum += sum;
        }

        // Return the total of all cumulative sums
        return totalSum;
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Example: you can pass any number of arguments here
        int result = calculateCumulativeSum(4, 5, 10);

        // Print the final total sum
        System.out.println("Total of all cumulative sums = " + result);
    }
}