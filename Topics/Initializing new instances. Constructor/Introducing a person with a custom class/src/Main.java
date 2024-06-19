import java.util.Scanner;

// Define the Person class here
class Person {
    public String name;
    public int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String introduce() {
        return "Hello, my name is " + name + " and I am " + age + " years old.";
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read name and age from the user
        String name = scanner.nextLine();
        int age = scanner.nextInt();

        // Create a Person instance with the given name and age
        Person person = new Person(name, age);

        // Call the introduce() method of the Person instance
        System.out.println(person.introduce());

        scanner.close();
    }
}