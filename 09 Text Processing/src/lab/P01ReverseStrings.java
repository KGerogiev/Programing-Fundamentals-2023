package lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P01ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<String> resultList = new ArrayList<>();

        while (!input.equals("end")) {
            //"{word} = {reversed word}".
            String result = input + " = " + reversedWord(input);
            resultList.add(result);

            input = scanner.nextLine();
        }
        resultList.forEach(e -> System.out.println(e));
    }

    public static String reversedWord(String word) {
        StringBuilder sb = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            char currentSymbol = word.charAt(i);
            sb.append(currentSymbol);
        }
        return sb.toString();
    }
}
