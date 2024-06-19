// Import statements required
import java.util.Scanner;

// Start with creating a superclass
class Fruit {

    // Create a method taste()
    public String taste() {
        // Implement your code here
        return "some fruit";
    }
}

// Create two subclasses Apple and Orange extending the Fruit class

// Class for Apple
class Apple extends Fruit {
    // Override the taste() method here
    @Override
    public String taste() {
        return "Sweet";
    }
}

// Class for Orange
class Orange extends Fruit {
    // Override the taste() method here
    @Override
    public String taste() {
        return "Sour";
    }
}

class Main {
    public static void main(String[] args) {
        // Take the input of fruit type from the user
        Scanner in = new Scanner(System.in);
        String fruitType = in.nextLine();
        Fruit fruit = new Fruit();
        if ("Apple".equals(fruitType)) {
            fruit = new Apple();
        } else if ("Orange".equals(fruitType)) {
            fruit = new Orange();
        }

        System.out.println(fruit.taste());
        // Depending on the fruit type, create an object of the respective fruit class
        // Call the taste() method and print the result

    }
}