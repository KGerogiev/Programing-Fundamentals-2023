package exercises;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P04StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countMessages = Integer.parseInt(scanner.nextLine());
        String regexCountLetters = "[SsTtAaRr]";
        Pattern patternCount = Pattern.compile(regexCountLetters);

        String regexDecrypted = "[^\\@\\-\\!\\:\\>]*\\@(?<planetName>[A-Za-z]+)[^\\@\\-\\!\\:\\>]*\\:(?<population>[0-9]+)[^\\@\\-\\!\\:\\>]*\\!(?<attackType>[A|D])\\![^\\@\\-\\!\\:\\>]*->(?<solgerCount>[0-9]+)[^\\@\\-\\!\\:\\>]*";
        Pattern patternDecrypted = Pattern.compile(regexDecrypted);

        List<String> attackedPlanets = new ArrayList<>();
        List<String> destroiedPlannets = new ArrayList<>();

        for (int i = 1; i <= countMessages; i++) {
            String cryptedMessage = scanner.nextLine();// "STCDoghudd4=63333$D$0A53333"

            //преброявам броят на буквите S, T, A, R във криптираното съобщение
            StringBuilder specialLetters = new StringBuilder(); //"STA"
            Matcher matcherCountLetters = patternCount.matcher(cryptedMessage);
            while (matcherCountLetters.find()) {
                specialLetters.append(matcherCountLetters.group());
            }
            int decrypedNumber = specialLetters.length();

            //декриптирам съобщението
            StringBuilder decryptedMessage = new StringBuilder(); // декриптираното съобщение -> "PQ@Alderaa1:30000!A!->20000"
            for (Character symbol : cryptedMessage.toCharArray()) {
                int currentCode = symbol;
                char decrypted = (char) (currentCode - decrypedNumber);
                decryptedMessage.append(decrypted);
            }

            //изваждам данни от декриптираното съобщение
            String decrypted = decryptedMessage.toString();
            Matcher matcherDecrypted = patternDecrypted.matcher(decrypted);
            if (matcherDecrypted.find()) {
                String plannetName = matcherDecrypted.group("planetName");
                String attackType = matcherDecrypted.group("attackType");

                if (attackType.equals("A")) {
                    attackedPlanets.add(plannetName);
                } else {
                    destroiedPlannets.add(plannetName);
                }
            }
        }

        Collections.sort(attackedPlanets);
        Collections.sort(destroiedPlannets);

        System.out.printf("Attacked planets: %d%n", attackedPlanets.size());
        if (attackedPlanets.size() > 0){
            attackedPlanets.forEach(e -> System.out.println("-> " + e));
        }
        System.out.printf("Destroyed planets: %d%n", destroiedPlannets.size());
        if (destroiedPlannets.size() > 0){
            destroiedPlannets.forEach(e -> System.out.println("-> " + e));
        }
    }
}
