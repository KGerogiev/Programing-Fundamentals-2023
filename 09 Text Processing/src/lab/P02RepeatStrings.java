package lab;

import java.util.Scanner;

public class P02RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputArr = input.split("\\s+");

        StringBuilder resultString = new StringBuilder();

        for (int i = 0; i < inputArr.length; i++) {
            String currentWord = inputArr[i];
            int timesRepeated = inputArr[i].length();
            resultString.append(createString(currentWord, timesRepeated));
        }
        System.out.println(resultString);
    }
    public static StringBuilder createString (String word, int n){
        StringBuilder newWord = new StringBuilder();
        for (int i = 0; i < n; i++) {
            newWord.append(word);
        }
        return newWord;
    }
}
