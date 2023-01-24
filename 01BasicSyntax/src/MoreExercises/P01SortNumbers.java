package MoreExercises;

import java.util.Scanner;

public class P01SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num = Double.parseDouble(scanner.nextLine());

        double minNumber = Double.MAX_VALUE;
        double firstNum = 0;
        double secondNum = 0;
        double thirdNum = 0;

        for (int i = 1; i <= 3; i++) {
            if (num < minNumber) {
                minNumber = num;
            }
            if (i == 1) {
                firstNum = num;
                num = Double.parseDouble(scanner.nextLine());
                continue;
            }
            if (i == 2) {
                secondNum = num;
                num = Double.parseDouble(scanner.nextLine());
                continue;
            }
            if (i == 3) {
                thirdNum = num;
            }
        }

        double min = minNumber;
        double middle = 0;
        double max = 0;

        double maxNumber = Double.MIN_EXPONENT;
        double j = 0;
        for (int i = 1; i <= 3; i++) {
            if (i == 1) {
                j = firstNum;
            }
            if (i == 2) {
                j = secondNum;
            }
            if (i == 3) {
                j = thirdNum;
            }
            if (j > maxNumber) {
                maxNumber = j;
            }
        }
        max = maxNumber;

        for (double i = min + 1; i < max ; i++) {
            if (i == firstNum){
                middle = firstNum;
            }
            if (i == secondNum){
                middle = secondNum;
            }
            if (i == thirdNum){
                middle = thirdNum;
            }
        }

        if (min == firstNum){
            firstNum  = 0;
        } else if (min == secondNum){
            secondNum = 0;
        } else if (min == thirdNum){
            thirdNum = 0;
        }

        if (max == firstNum){
            firstNum  = 0;
        } else if (max == secondNum){
            secondNum = 0;
        } else if (max == thirdNum){
            thirdNum = 0;
        }

        if (firstNum != 0){
            middle = firstNum;
        } else if (secondNum != 0){
            middle = secondNum;
        } else if (thirdNum != 0){
            middle = thirdNum;
        } else {
            middle = 0;
        }


        System.out.printf("%.0f%n%.0f%n%.0f%n", max, middle, min);

    }
}