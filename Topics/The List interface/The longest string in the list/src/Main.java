import java.util.*;

public class Main {

    static void changeList(List<String> list) {
        // write your code here
        int size = 0;
        int maxSize = 0;
        String maxString = "";
        for(String s : list) {
            size = s.length();
            if(maxSize < size) {
                maxSize = size;
                maxString = s;
            }
        }


        for(int i = 0; i < list.size(); i++) {
            list.set(i,maxString);
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        List<String> lst = Arrays.asList(s.split(" "));
        changeList(lst);
        lst.forEach(e -> System.out.print(e + " "));
    }
}