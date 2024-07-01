import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String inPutStr = scanner.nextLine();
        StringBuilder outPutStr = new StringBuilder();
        int inpStrLen = inPutStr.length();
        int midNum1;
        int midNum2;
        if (inpStrLen % 2 != 0) {
            midNum1 = ((inpStrLen+1)/2)-1;
            for (int i = 0; i < inPutStr.length(); i++) {
                if (midNum1 != i) {
                    outPutStr.append(String.valueOf(inPutStr.charAt(i)));
                 }
            }
        }else {
            midNum1 = ((inpStrLen)/2)-1;
            midNum2 = ((inpStrLen)/2);
            for (int i = 0; i < inPutStr.length(); i++) {
                if (midNum1 != i && midNum2 != i) {
                    outPutStr.append(String.valueOf(inPutStr.charAt(i)));
                }
            }
        }
        System.out.println(outPutStr);

    }
}