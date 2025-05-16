public class NumberToMonth {
    public static void main(String[] args) {
        int month = 2; // Change this number to test different months
        int days;

        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                days = 31;
                break;
            case 4: case 6: case 9: case 11:
                days = 30;
                break;
            case 2:
                days = 28;
                break;
            default:
                System.out.println("Invalid month number");
                return;
        }

        System.out.println("Month " + month + " has " + days + " days.");
    }
}