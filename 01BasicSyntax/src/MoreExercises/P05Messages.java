package MoreExercises;

import java.util.Scanner;

public class P05Messages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //o	Find the number of digits the number has "e.g. 222 -> 3 digits"
        //o	Find the main digit of the number "e.g.  222 -> 2"
        //o	Find the offset of the number. To do that, you can use the formula: (main digit - 2) * 3
        //o	If the main digit is 8 or 9, we need to add 1 to the offset since the digits 7 and 9 have 4 letters each
        //o	Finally, find the letter index (a -> 0, c -> 2, etc.). To do that, we can use the following formula: (offset + digit length - 1).
        //o	After we've found the letter index, we can just add that to the ASCII code of the lowercase letter "a" (97)

        int lenght = Integer.parseInt(scanner.nextLine());
        String message = "";

        for (int i = 1; i <=lenght ; i++) {

            int input = Integer.parseInt(scanner.nextLine());

            int counter = 0;

            int numManipulated = input;
            while (numManipulated > 0) {
                counter++;
                numManipulated = numManipulated / 10;
            }
            int mainDigit = input % 10;
            if (mainDigit == 0){
                char  space = ' ';
                message = message + space;
                continue;
            }
            int offset = (mainDigit - 2) * 3;
            if (mainDigit == 8 || mainDigit == 9) {
                offset = offset + 1;
            }
            int letterIndex = offset + counter - 1;
            char symbol = (char) (97 + letterIndex);
            message = message + symbol;
        }
        System.out.println(message);
    }
}
