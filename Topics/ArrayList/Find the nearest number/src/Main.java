import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<Integer> numbers = readArrayList(scanner);
        List<String>
        for(Integer number : numbers) {
            System.out.println(number);
        }
    }

    private static ArrayList<Integer> readArrayList(Scanner scanner) {
        return Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayList::new));
    }
}