package DataTypesLab;

import java.util.Scanner;

public class P07ReversedChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstSymbol = scanner.nextLine().charAt(0);
        char secondSymbol = scanner.nextLine().charAt(0);
        char thirdSymbol = scanner.nextLine().charAt(0);

        String combination = String.format("%c %c %c", thirdSymbol, secondSymbol, firstSymbol);

        System.out.printf("%s%n", combination);
    }
}
