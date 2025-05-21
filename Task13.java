// Task13.java

// Base class Vehicle
class Vehicle {
    String make;
    String model;
    int year;

    // Constructor for Vehicle
    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
}

// Derived class Car that extends Vehicle
class Car extends Vehicle {
    int numberOfDoors;

    // Constructor for Car
    public Car(String make, String model, int year, int numberOfDoors) {
        super(make, model, year); // Call to parent class constructor
        this.numberOfDoors = numberOfDoors;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Car Details:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

// Main class to test the Car class
public class Task13 {
    public static void main(String[] args) {
        // Create an instance of Car
        Car myCar = new Car("Toyota", "Camry", 2022, 4);

        // Display car details
        myCar.displayDetails();
    }
}