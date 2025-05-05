public class SumAverage {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25};
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        double average = (double) sum / numbers.length;
        
        System.out.println("the Sum: " + sum);
        System.out.println("the Average: " + average);
    }
}