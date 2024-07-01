import java.util.Locale;
import java.util.Scanner;

record Home(String address, String city, String state, String zipCode) {

    Home {
        address = address.toUpperCase();
        city = city.toUpperCase();
        state = state.toUpperCase();
        zipCode = zipCode.toUpperCase();
    }

    public String address() {
        return address.toUpperCase(Locale.ENGLISH);
    }

    public String city() {
        return city.toUpperCase(Locale.ENGLISH);
    }

    public String state() {
        return state.toUpperCase(Locale.ENGLISH);
    }

    public String zipCode() {
        return zipCode.toUpperCase(Locale.ENGLISH);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Home home = new Home(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine());
        System.out.println(home);
    }
}