package Task121;

public class DateTask {
    private byte day;
    private byte month;
    private short year;

    // No-args constructor with default values
    public DateTask() {
        this(1, 1, 1); // Step 5
    }

    // Constructor that takes 3 arguments
    public DateTask(int m, int d, int y) {
        setDate(m, d, y);
    }

    // Format to MM/DD/YYYY
    public String toString() {
        return String.format("%02d/%02d/%04d", month, day, year); // Step 6
    }

    // Set the full date
    public void setDate(int m, int d, int y) {
        if (valid(d, m, y)) {
            day = (byte) d;
            month = (byte) m;
            year = (short) y;
        } else {
            day = 0;
            month = 0;
            year = 0;
        }
    }

    // Static method to print leap years
    public static void leapYears() {
        for (int i = 1980; i <= 2023; i++) {
            if (((i % 4 == 0) && (i % 100 != 0)) || (i % 400 == 0)) {
                System.out.println("The year " + i + " is a leap year");
            }
        }
    }

    // Getter and setter for day
    public int getDay() {
        return day; // Step 7
    }

    public int setDay(int day) {
        if (valid(day, month, year)) {
            this.day = (byte) day;
            return day;
        }
        return 0; // Step 8
    }

    // Getter and setter for month
    public int getMonth() {
        return month; // Step 9
    }

    public int setMonth(int month) {
        if (valid(day, month, year)) {
            this.month = (byte) month;
            return month;
        }
        this.month = 0;
        return 0; // Step 10
    }

    // Getter and setter for year
    public int getYear() {
        return year; // Step 11
    }

    public int setYear(int year) {
        if (valid(day, month, year)) {
            this.year = (short) year;
            return year;
        }
        this.year = 0;
        return 0; // Step 12
    }

    // Private method to validate the date
    private boolean valid(int day, int month, int year) {
        if (day > 31 || day < 1 || month > 12 || month < 1 || year < 1) {
            System.out.println("Attempting to create a non-valid date " + month + "/" + day + "/" + year);
            return false;
        }
        switch (month) {
            case 4: case 6: case 9: case 11:
                return day <= 30;
            case 2:
                return day <= 28 || (day == 29 && year % 4 == 0);
            default:
                return true;
        }
    }
}