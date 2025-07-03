
// Superclass Vehicle
class Vehicle {
    void display() {
        System.out.println("This is a vehicle.");
    }
}

// Subclass Car
class Car extends Vehicle {
    void display() {
        System.out.println("This is a car.");
    }
}

// Subclass Bike
class Bike extends Vehicle {
    void display() {
        System.out.println("This is a bike.");
    }
}

// Subclass Truck
class Truck extends Vehicle {
    void display() {
        System.out.println("This is a truck.");
    }
}
class Goat extends Vehicle {
    void display() {
        System.out.println("This is a Goat.");
    }
}


public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();
        Truck truck = new Truck();
        Goat goat = new Goat();

        car.display();   // Output: This is a car.
        bike.display();  // Output: This is a bike.
        truck.display(); // Output: This is a truck.
        goat.display();
    }
}
