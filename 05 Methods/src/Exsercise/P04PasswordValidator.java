package Exsercise;

import java.util.Scanner;

public class P04PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        boolean isValid = true;

        //•	6 – 10 characters (inclusive);
        int countCharacters = characterCount(input);
        if (countCharacters < 6 || countCharacters > 10) {
            System.out.printf("Password must be between 6 and 10 characters%n");
            isValid = false;
        }

        //•	Consists only of letters and digits;
        boolean consistLettersOrDidjits = lettersOrDigitsOnly(input);
        if (!consistLettersOrDidjits) {
            System.out.printf("Password must consist only of letters and digits%n");
            isValid = false;
        }

        //•	Have at least 2 digits.
        int countDigits = consistNumberOfDigits(input);
        if (countDigits < 2){
            System.out.printf("Password must have at least 2 digits%n");
            isValid = false;
        }
        if (isValid){
            System.out.printf("Password is valid%n");
        }
    }

    public static int characterCount(String text) {
        int count = text.length();
        return count;
    }

    public static boolean lettersOrDigitsOnly(String text) {
        boolean isCorrect = true;
        char[] charArr = text.toCharArray();
        for (char character : charArr) {
            if (!Character.isLetterOrDigit(character)) {
                isCorrect = false;
            }
        }
        return isCorrect;
    }

    public static int consistNumberOfDigits(String text) {
        int count = 0;
        char[] charArr = text.toCharArray();
        for (char character : charArr) {
            if (Character.isDigit(character)) {
                count++;
            }
        }
        return count;
    }
}
