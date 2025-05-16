import static java.lang.Math.*;

public class Task9 {

    public static int add(int a, int b) {
        return addExact(a, b);
    }

    public static int subtract(int a, int b) {
        return subtractExact(a, b);
    }

    public static int multiply(int a, int b) {
        return multiplyExact(a, b);
    }

    public static int divide(int a, int b) {
        return floorDiv(a, b);
    }

    public static void main(String[] args) {
        int x = 10;
        int y = 3;

        System.out.println("Add: " + add(x, y));
        System.out.println("Subtract: " + subtract(x, y));
        System.out.println("Multiply: " + multiply(x, y));
        System.out.println("Divide: " + divide(x, y));
    }
}