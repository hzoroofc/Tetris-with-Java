import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        //region Description
        char[] engAlphabet = {'a', 'b', 'c',
                              'd', 'e', 'f',
                              'g', 'h', 'i',
                              'j', 'k', 'l',
                              'm', 'n', 'o',
                              'p', 'q', 'r',
                              's', 't', 'u',
                              'v', 'w', 'x',
                              'y', 'z'};
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String alphabetString = String.valueOf(engAlphabet);
        if(alphabetString.contains(input)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}