package exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P05NetherRealms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // input -> "{demon name}, {demon name}, … {demon name}"
        String[] input = scanner.nextLine().split("\\s*,\\s*");

        String regexHealt = "[^0-9\\+\\-\\*\\/\\.]";
        Pattern patternHealt = Pattern.compile(regexHealt);

        String baseDamage = "(\\+?\\-?[0-9]+\\.?[0-9]*)";
        Pattern patternBaseDemage = Pattern.compile(baseDamage);

        for (int i = 0; i < input.length; i++) {
            String currentDeamon = input[i];   //M3ph-0.5s-0.5t0.0**
            int healt = 0;
            double baseDemage = 0;

            //да намеря неговото здраве
            Matcher matcherHealt = patternHealt.matcher(currentDeamon);  //"Mphst"
            StringBuilder currentHealt = new StringBuilder();
            while (matcherHealt.find()) {
                currentHealt.append(matcherHealt.group());
            }
            for (Character symobol : currentHealt.toString().toCharArray()) {
                int code = symobol;
                healt += code;
            }
            //да намеря неговите поражения
            // определяне на base demage
            Matcher baseDemageMatcher = patternBaseDemage.matcher(currentDeamon);  //3 -0.5 -0.5 0.0
            while (baseDemageMatcher.find()) {
                baseDemage += Double.parseDouble(baseDemageMatcher.group());
            }
            // преработване на base demage ако съществуват символите '*' или '/';
            for (Character symbol : currentDeamon.toCharArray()) {
                if (symbol == '*'){
                    baseDemage = baseDemage * 2;
                }
                if (symbol == '/') {
                    baseDemage = baseDemage / 2;
                }
            }
            // отпечатвам •	"{demon name} - {health points} health, {damage points} damage"
            System.out.printf("%s - %d health, %.2f damage%n", currentDeamon, healt, baseDemage);
        }

    }
}
