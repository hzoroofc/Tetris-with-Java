import java.util.Scanner;

class ConcatenateStringsProblem {

    public static String concatenateStringsWithoutDigits(String[] strings) {
        // write your code with StringBuilder here
        StringBuilder result = new StringBuilder();
        for (String s : strings) {
            if (!s.isEmpty()) {
                for (int i = 0; i < s.length(); i++) {
                    if(!"0123456789".contains(String.valueOf(s.charAt(i)))) {
                        result.append(s.charAt(i));
                    }
                }
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split("\\s+");
        String result = concatenateStringsWithoutDigits(strings);
        System.out.println(result);
    }
}