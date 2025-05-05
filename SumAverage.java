public class SumAverage {
    public static void main(String[] args) {
        int[] numbers = {95, 90, 80, 90, 79};
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        double average = (double) sum / numbers.length;
        
        System.out.println("the Sum: " + sum);
        System.out.println("the Average: " + average);
    }
}
