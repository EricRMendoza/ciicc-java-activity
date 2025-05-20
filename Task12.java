class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void print() {
        System.out.println("(" + x + ", " + y + ")");
    }

    // Your code goes here
    public void scale() {
        this.x = this.x / 2;
        this.y = this.y / 2;
    }
}

public class Task12 {
    public static void main(String[] args) {
        Point p = new Point(32, 32);
        p.scale(); // This will change the point to (16.0, 16.0)
        p.print(); // Output: (16.0, 16.0)
    }
}