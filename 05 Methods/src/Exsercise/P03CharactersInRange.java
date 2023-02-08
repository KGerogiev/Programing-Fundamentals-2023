package Exsercise;

import java.util.Scanner;

public class P03CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstInput = scanner.nextLine().charAt(0);
        int secondInput = scanner.nextLine().charAt(0);
        int start = 0;
        int end = 0;

        if (firstInput < secondInput){
            start = firstInput;
            end =  secondInput;
        } else {
            start = secondInput;
            end = firstInput;
        }
        printCharsBetweenTwo(start, end);

    }
    public static void printCharsBetweenTwo(int start, int end){
        for (int i = start + 1; i < end ; i++) {
            char next = (char) i;

            System.out.print(next + " ");
        }
    }
}
