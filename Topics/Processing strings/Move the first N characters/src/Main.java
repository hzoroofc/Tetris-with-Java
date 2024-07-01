import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int n = scanner.nextInt();
        if(n >= s.length() || n <= 0) {
            System.out.println(s);
        }else {
            String s1 = s.substring(0, n);
            String s2 = s.substring(n);
            s = s2.concat(s1);
            System.out.println(s);
        }

    }
}