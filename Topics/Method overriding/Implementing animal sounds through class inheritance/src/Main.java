public class Main {
    public static void main(String[] args) {
        // Your code here
        Dog fido = new Dog();
        System.out.println(fido.speak());
    }
}

class Animal {
    public String speak() {
        // Your code here
        return "I am an animal";
    }
}

class Dog extends Animal {
    public String speak() {
        // Your code here
        return "Bark!";
    }
}