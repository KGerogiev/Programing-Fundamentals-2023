package Exercise;

import java.util.Scanner;

public class P04CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder encrypted = new StringBuilder();

        for (int index = 0; index < input.length(); index++) {
            char currentSymbol = input.charAt(index);

            //int indexOfNewSymbol = (int) currentSymbol + 3;

            char newSymbol = (char) (currentSymbol + 3);
            encrypted.append(newSymbol);

        }
        System.out.println(encrypted);
    }
}
