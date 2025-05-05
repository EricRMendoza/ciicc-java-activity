public class SumAverage {
    public static void main(String[] args) {
        int[] numbers = {95, 90, 80, 90, 79};
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        double average = (double) sum / numbers.length;
        System.out.println("The numbers are: " 
                + numbers[0] + ", " + numbers[1] + ", " + numbers[2] + ", "
                + numbers[3] + ", " + numbers[4]);
        System.out.println("The Sum: " + sum);
        System.out.println("The Average: " + average);
    }
}
