package MoreExercises;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class P04ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        revert(scanner.nextLine());

    }

    public static void revert (String input){
        String output = "";

        for (int i = input.length() - 1; i >= 0 ; i--) {
            char symbol = input.charAt(i);
            output = output + symbol;
        }
        System.out.println(output);

    }
}
