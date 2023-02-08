package Exsercise;

import java.util.Scanner;

public class P02VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        char[] inputArr = input.toLowerCase().toCharArray();
        //a, e, i, o, u

        int countValwels = countVowels(inputArr);
        System.out.println(countValwels);
    }

    public static int countVowels(char[] text) {
        int count = 0;
        for (char character : text) {
            if (character == 'a' || character == 'e' || character == 'i' ||
                    character == 'o' || character == 'u'){
                count++;
            }
        }

        return count;
    }
}
