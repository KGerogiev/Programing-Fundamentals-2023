package DataTypesLExercise;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        char symbolChar = (char) num;

        System.out.println(symbolChar);
    }
}
