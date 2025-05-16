package Task121;

public class MyDate {
    public static void main(String[] args) {
        DateTask date1 = new DateTask(1, 1, 1978);      // Step 13
        DateTask date2 = new DateTask(9, 21, 1984);     // Step 13

        System.out.println(date1.toString());           // Print date1
        System.out.println(date2.toString());           // Print date2

        DateTask.leapYears();                            // Step 14: display leap years
    }
}