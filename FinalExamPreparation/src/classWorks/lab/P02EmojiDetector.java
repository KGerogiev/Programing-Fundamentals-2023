package classWorks.lab;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02EmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        List<String> coolEmojisList = new ArrayList<>();  // Списък с готини емоджита
        int countEmojisFound = 0;     // брой намерени валидни емоджита в текста

        String regexNumbers = "[0-9]"; // регекс, с който намирам всички числа от текста
        Pattern patternNumbers = Pattern.compile(regexNumbers);

        BigInteger coolThrshold = new BigInteger(String.valueOf(1)); // праг на готиност

        Matcher matcherNumbers = patternNumbers.matcher(text);  // мачър за числата от текста

        while (matcherNumbers.find()){
            int currentNumber = Integer.parseInt(matcherNumbers.group()); // следващото число от текста
            coolThrshold = coolThrshold.multiply(BigInteger.valueOf(currentNumber)); // умножавам всички числа от текста
        }

        String regexEmojiNames = "(\\*{2}|\\:{2})(?<name>[A-Z]{1}[a-z]{1}[a-z]+)\\1"; //регекс за имената на валидните емоджита
        Pattern patternEmojiNames = Pattern.compile(regexEmojiNames);

        Matcher matcherEmojiCoolnes = patternEmojiNames.matcher(text);

        while (matcherEmojiCoolnes.find()){
            countEmojisFound++;
            String currentEmojiWholeName = matcherEmojiCoolnes.group(); // Цялото име на емоджито ::Smiley::
            String currentEmoji = matcherEmojiCoolnes.group("name"); // Името на Емоджито     Smiley
            int currentCoolnes = 0;  // Колко е готино
            for (Character symbol : currentEmoji.toCharArray() ) {  // добавям кода на всеки символ към сумата за готиност
                int code = symbol;
                currentCoolnes += code;
            }
            //проверявам дали готиността му е повече от прага на готиност
            if (BigInteger.valueOf(currentCoolnes).compareTo(coolThrshold) >= 0){
                // Емоджи е готино
                coolEmojisList.add(currentEmojiWholeName);
            }
        }
        System.out.println("Cool threshold: " + coolThrshold);
        System.out.println(countEmojisFound + " emojis found in the text. The cool ones are:");
        coolEmojisList.forEach(e -> System.out.println(e));

    }
}
