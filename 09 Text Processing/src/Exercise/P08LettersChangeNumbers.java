package Exercise;

import java.util.Scanner;

public class P08LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split("\\s+"); //A12b s17G

        double sum = 0;

        for (int i = 0; i < inputArr.length; i++) {
            String currentCombination = inputArr[i]; //A12b
            String firstLetter = String.valueOf(currentCombination.charAt(0));
            String lastLetter = String.valueOf(currentCombination.charAt(currentCombination.length() - 1));
            double number = Double.parseDouble(currentCombination.replace(firstLetter, "").replace(lastLetter, ""));
            double numberAfterFirstManipulation = firstLetterManipulation(firstLetter, number);
            double numberAfterSeconManipulation = secondLetterManipulation(lastLetter, numberAfterFirstManipulation);

            sum += numberAfterSeconManipulation;
        }
        System.out.printf("%.2f", sum);
    }

    public static double firstLetterManipulation(String firstLetter, double number) {
        char letter = firstLetter.charAt(0);
        if (Character.isUpperCase(letter)) {
            int letterPosition = letter - 64;
            number = number * 1.0 / letterPosition;
        } else {
            int leetterPosition = letter - 96;
            number = number * leetterPosition;
        }
        return number;
    }

    public static double secondLetterManipulation(String secondLetter, double number) {
        char letter = secondLetter.charAt(0);
        if (Character.isUpperCase(letter)) {
            int letterPosition = letter - 64;
            number = number - letterPosition;
        } else {
            int letterPosition = letter - 96;
            number = number + letterPosition;
        }
        return number;
    }

}
