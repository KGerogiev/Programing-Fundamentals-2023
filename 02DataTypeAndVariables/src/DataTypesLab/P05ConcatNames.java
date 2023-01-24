package DataTypesLab;

import java.util.Scanner;

public class P05ConcatNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine(); //първо име
        String secondName = scanner.nextLine(); //второ име
        String delimiter = scanner.nextLine(); //разделител

        String combination = String.format("%s%s%s", firstName, delimiter, secondName);

        System.out.printf("%s", combination);
    }
}
