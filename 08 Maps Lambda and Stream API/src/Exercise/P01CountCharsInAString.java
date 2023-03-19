package Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P01CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] text = scanner.nextLine().toCharArray();

        Map<Character, Integer> countCharacters = new LinkedHashMap<>();

        for (int i = 0; i < text.length; i++) {
            char currentChar = text[i];

            if (currentChar == ' '){
                continue;
            }
            if (!countCharacters.containsKey(currentChar)){
                countCharacters.put(currentChar, 1);
            } else {
                int currentValue = countCharacters.get(currentChar);
                countCharacters.put(currentChar, currentValue + 1);
            }

        }
        countCharacters.entrySet().forEach(e -> System.out.println(e.getKey() + " -> " + e.getValue()));


    }
}
