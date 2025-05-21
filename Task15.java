// Interface Shape
interface Shape {
    double calculateArea();

    double calculatePerimeter();
}

// Abstract Class AbstractShape
abstract class AbstractShape implements Shape {
    String color;
    double length;
    double width;

    public AbstractShape(String color, double length, double width) {
        this.color = color;
        this.length = length;
        this.width = width;
    }

    // Default implementations (can be overridden)
    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

// Circle Class
class Circle extends AbstractShape {
    double radius;

    public Circle(String color, double radius) {
        super(color, 0, 0); // length and width not used
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Rectangle Class
class Rectangle extends AbstractShape {
    public Rectangle(String color, double length, double width) {
        super(color, length, width);
    }

    // Inherits calculateArea and calculatePerimeter from AbstractShape
}

// Main Class
public class Task15 {
    public static void main(String[] args) {
        Shape circle = new Circle("Red", 5.0);
        Shape rectangle = new Rectangle("Blue", 4.0, 6.0);

        System.out.println("Circle:");
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());

        System.out.println("\nRectangle:");
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
    }
}