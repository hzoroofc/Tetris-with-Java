import java.util.Scanner;

// Base class for vehicles
class Vehicle {
    protected int numWheels;

    public Vehicle(int wheels) {
        numWheels = wheels;
    }


}

// TODO: Create the Bicycle class that extends Vehicle
class Bicycle extends Vehicle {

    public Bicycle(int wheels) {
        super(wheels);
    }

    protected void printWheels() {
        System.out.println("A bicycle has " + numWheels + " wheels.");
    }
}

// TODO: Create the Motorcycle class that extends Vehicle
class Motorcycle extends Vehicle {

    public Motorcycle(int wheels) {
        super(wheels);
    }

    protected void printWheels() {
        System.out.println("A motorcycle has " + numWheels + " wheels.");
    }

}

// TODO: Create the Car class that extends Vehicle
class Car extends Vehicle {
    public Car(int wheels) {
        super(wheels);
    }

    protected void printWheels() {
        System.out.println("A car has " + numWheels + " wheels.");
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String vehicleType = scanner.nextLine();

        // TODO: Create an instance of the appropriate vehicle class based on vehicleType
        switch (vehicleType) {
            case "bicycle":
                Bicycle bicycle = new Bicycle(2);
                bicycle.printWheels();
                break;
            case "motorcycle":
                Motorcycle motorcycle = new Motorcycle(2);
                 motorcycle.printWheels();
                 break;
            case "car":
                Car car = new Car(4);
                car.printWheels();
                break;
        }

        // TODO: Call the printWheels() method on the vehicle instance
    }
}