import java.util.Scanner;

class EvenUpperCase {

    public static String upperEvenLetters(String message) {
        // write your code here
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            stringBuilder.append((i%2 == 0) ? Character.toUpperCase(message.charAt(i)) : Character.toLowerCase(message.charAt(i)));
        }
        return stringBuilder.toString();
    }

    // Don't change the code below
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = scanner.next();

        System.out.println(upperEvenLetters(message));
    }
}