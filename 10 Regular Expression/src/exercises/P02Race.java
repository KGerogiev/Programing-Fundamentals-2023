package exercises;

import javax.print.DocFlavor;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] racersNames = scanner.nextLine().split(", ");

        String regexName = "[A-Za-z]";   //regex for the name
        Pattern patternName = Pattern.compile(regexName);

        String regexDistance = "\\d";  //regex for the distance
        Pattern patternDistance = Pattern.compile(regexDistance);

        Map<String, Integer> finishMap = new LinkedHashMap<>();

        for (int i = 0; i < racersNames.length; i++) {
            finishMap.put(racersNames[i], 0);
        }

        String input = scanner.nextLine();

        while (!input.equals("end of race")) {
            //input = "G!32e%o7r#32g$235@!2e"

            //събирм буквите от името
            StringBuilder name = new StringBuilder();
            Matcher matcherName = patternName.matcher(input);
            while (matcherName.find()){
                name.append(matcherName.group());
            }

            //събирам цифрите, за да намеря дистанцията
            int distance = 0;
            Matcher matcherDistance = patternDistance.matcher(input);
            while (matcherDistance.find()){
                distance += Integer.parseInt(matcherDistance.group());
            }

            if (finishMap.containsKey(name.toString())){
                int currentDistance = finishMap.get(name.toString());
                finishMap.put(name.toString(), currentDistance + distance);
            }

            input = scanner.nextLine();
        }

        for (int i = 0; i < 3; i++) {
            if (i == 0){
                System.out.printf("1st place: %s%n", racersNames[i]);
            } else if (i == 1) {
                System.out.printf("2nd place: %s%n", racersNames[i]);
            } else if (i == 2){
                System.out.printf("3rd place: %s%n", racersNames[i]);
            }

        }
    }
}
