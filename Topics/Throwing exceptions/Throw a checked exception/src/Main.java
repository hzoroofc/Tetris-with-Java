import java.io.IOException;

public class Main {

    public static void method() throws Exception {
        // write your code here
        throw new IOException("");
    }

    /* Do not change code below */
    public static void main(String[] args) {
        try {
            method();
        } catch (RuntimeException e) {
            System.out.println("RuntimeException");
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}