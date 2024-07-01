import java.util.*;
import java.util.stream.Collectors;

class SetUtils {

    public static Set<Integer> getSetFromString(String str) {
        // write your code here
        Set<Integer> set1 = new HashSet<>();

        List<String> strings = Arrays.asList(str.split("\\s+"));
        set1 = strings.stream().map(Integer::parseInt).collect(Collectors.toSet());

        return set1;
    }

    public static void removeAllNumbersGreaterThan10(Set<Integer> set) {
        // write your code here
        set.removeIf(num -> num > 10);

    }

}

/* Do not change code below */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numbers = scanner.nextLine();
        Set<Integer> set = SetUtils.getSetFromString(numbers);
        SetUtils.removeAllNumbersGreaterThan10(set);
        set.forEach(e -> System.out.print(e + " "));
    }
}