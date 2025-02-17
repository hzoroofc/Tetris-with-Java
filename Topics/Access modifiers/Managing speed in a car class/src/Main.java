import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int increase = scanner.nextInt();
        // Instantiate a Car object here and use the drive method
        Car car = new Car();
        car.drive(increase);
        // Use displaySpeed to print the current speed
        car.displaySpeed();
    }
}

class Car {
    private int speed;

    public Car() {
        // Initialize the speed field here
    }

    public void drive(int increase) {
        // Write a method that takes an integer as argument 
        // and adds it to the 'speed'.
        speed += increase;
        // Use a condition to check if the speed becomes greater than 200
        // if so, cap the speed at 200
        if (speed > 200) {
            speed = 200;
        }
    }

    public void displaySpeed() {
        // Write a method that prints the current speed
        System.out.println(speed);
    }
}
