import java.lang.Integer;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        // Write your code here.
        System.out.println(convertToList(number));
    }

    public static List<Integer> convertToList(int number){
        // Write your code here.
        String numberAsString = String.valueOf(number);
        List<Integer> numbers = new ArrayList<>();
        for (char c : numberAsString.toCharArray()) {
            numbers.add(Integer.parseInt(String.valueOf(c)));
        }
        Collections.sort(numbers);
        return numbers;
    }
}