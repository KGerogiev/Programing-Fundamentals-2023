package Exsercise;

import java.util.Scanner;

public class P06MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String middle = "";

        if (input.length() % 2 == 0){
            middle = middleCharsEven(input);
        } else {
            middle = String.valueOf(middleCharOdd(input));
        }

        System.out.println(middle);
    }
    public static char middleCharOdd(String text){
        char middle = text.charAt(text.length() / 2);
        return  middle;
    }
    public static String middleCharsEven(String text){
        String middles = "";
        char middle1 = text.charAt(text.length() / 2 - 1);
        char middle2 = text.charAt(text.length() / 2);
        middles = middles + middle1 + middle2;
        return middles;

    }
}
