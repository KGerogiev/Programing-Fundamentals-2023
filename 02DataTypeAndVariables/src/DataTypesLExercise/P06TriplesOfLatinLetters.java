package DataTypesLExercise;

import java.util.Scanner;

public class P06TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= n - 1 ; i++) {;
            for (int j = 0; j <= n - 1 ; j++) {
                for (int k = 0; k <= n - 1 ; k++) {
                   char firstChar = (char) ('a' + i);
                   char secondChar = (char) ('a' + j);
                   char thirdChar = (char) ('a' + k);
                   String result = String.format("%c%c%c", firstChar, secondChar, thirdChar);
                    System.out.printf("%s%n", result);
                }

            }

        }
    }
}
