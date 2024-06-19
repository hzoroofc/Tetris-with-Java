import java.util.*;

public class Main {

    public static String getDayOfWeekName(int number) throws IllegalArgumentException {
        // write your code here
        if (number < 1 || number > 7) {
            throw new IllegalArgumentException();
        }else {
            Map<Integer, String> map = new HashMap<Integer, String>();
            map.put(1, "Mon");
            map.put(2, "Tue");
            map.put(3, "Wed");
            map.put(4, "Thu");
            map.put(5, "Fri");
            map.put(6, "Sat");
            map.put(7, "Sun");
            return map.get(number);
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dayNumber = scanner.nextInt();
        try {
            System.out.println(getDayOfWeekName(dayNumber));
        } catch (Exception e) {
            System.out.println(e.getClass().getName());
        }
    }
}