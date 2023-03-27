import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "(\\:{2}|\\*{2})(?<name>[A-Z]{1}[a-z]{2,})\\1";
    }
}
