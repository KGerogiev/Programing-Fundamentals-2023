package MoreExercises;

import java.util.Scanner;

public class P02EnglishNamOfTheLastDigit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        inputNum(Integer.parseInt(scanner.nextLine()));

    }
    public static void inputNum(int num) {

        int lastDigit = num % 10;
        String name = "";

        switch (lastDigit) {
            case 0:
                name = "zero";
                break;
            case 1:
                name = "one";
                break;
            case 2:
                name = "two";
                break;
            case 3:
                name = "tree";
                break;
            case 4:
                name = "four";
                break;
            case 5:
                name = "five";
                break;
            case 6:
                name = "six";
                break;
            case 7:
                name = "seven";
                break;
            case 8:
                name = "eight";
                break;
            case 9:
                name = "nine";
                break;

        }
        System.out.println(name);
    }
}
