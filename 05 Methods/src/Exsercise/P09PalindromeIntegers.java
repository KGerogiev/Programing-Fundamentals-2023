package Exsercise;

import java.util.Scanner;

public class P09PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        while (!command.equals("END")){
            boolean isPalindrom = isPalindrom(command);

            if (isPalindrom){
                System.out.printf("true%n");
            } else {
                System.out.printf("false%n");
            }

            command = scanner.nextLine();
        }
    }
    public static boolean isPalindrom(String text){
        String textReversed = "";

        for (int i = text.length() - 1; i >= 0 ; i--) {
            textReversed = textReversed + text.charAt(i);
        }
        return text.equals(textReversed);
    }
}
