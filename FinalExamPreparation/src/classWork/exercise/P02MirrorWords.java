package classWork.exercise;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02MirrorWords {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String text = scanner.nextLine(); // първоначалният текст
            // търся двойките думи в текса, които са в следният формат: #wordOne##wordTwo# или @wordOne@@wordTwo@
            String regexPair = "([\\@|\\#]{1})(?<first>[A-Za-z]{3,})\\1{2}(?<second>[A-Za-z]{3,})"; // за двойките думи от текста
            Pattern patternPair = Pattern.compile(regexPair);

            List<String> mirrorWords = new ArrayList<>(); // държа огледални двойки думи в текста
            int countPairs = 0;

            Matcher matcherPaits = patternPair.matcher(text);
            while (matcherPaits.find()) {
                countPairs++;

                String current = matcherPaits.group();
                String firstWord = matcherPaits.group("first"); // Първата дума от двойката
                String secondWord = matcherPaits.group("second"); // Втората дума от двойката
                String secondWordBack = "";  //Втората дума, написана наобратно
                for (int i = secondWord.length() - 1; i >= 0; i--) {
                    char symbol = secondWord.charAt(i);
                    secondWordBack += symbol;
                }
                if (firstWord.equals(secondWordBack)) {
                    mirrorWords.add(firstWord + " <=> " + secondWord);
                }
            }
            if (countPairs == 0){
                System.out.println("No word pairs found!");
            } else {
                System.out.printf("%d word pairs found!%n", countPairs);
            }
            if (mirrorWords.isEmpty()){
                System.out.printf("No mirror words!%n");
            } else {
                System.out.println("The mirror words are: ");
                System.out.println(String.join(", ", mirrorWords));
            }

        }
    }
}
