package otherRegexProblems;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        Map<String, List<String>> productList = new LinkedHashMap<>();
        int totalCalories = 0;
        // да извлека информация за храните от текста
        //String regex = "([\\||\\#])(?<name>[A-Za-z]+(\\s+[A-Za-z]+)*)\\1(?<exDate>(?<day>\\d{2})(\\/)(?<month>\\d{2})\\6(?<year>)\\d{2})\\1(?<cal>\\d+)\\b\\1";
        String regex = "([\\||\\#])(?<name>[A-Za-z]+(\\s[A-Za-z]*)*)\\1(?<exDate>[0-9]{2}\\/[0-9]{2}\\/[0-9]{2})\\1(?<cal>[0-9]+)\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            //String product = matcher.group("name");
            //String exDate = matcher.group("exDate");
            int callories = Integer.parseInt(matcher.group("cal"));

            totalCalories += callories;

            /*List<String> currentList = new ArrayList<>();
            currentList.add(exDate);
            currentList.add(matcher.group("cal"));
            productList.put(product, currentList);*/

        }
        int days = totalCalories / 2000;
        System.out.printf("You have food to last you for: %d days!%n", days);
        Pattern pattern1 = Pattern.compile(regex);
        Matcher matcher1 = pattern1.matcher(text);

        while (matcher1.find()) {
            String product = matcher1.group("name");
            String exDate = matcher1.group("exDate");
            int callories = Integer.parseInt(matcher1.group("cal"));

          // totalCalories += callories;

           /* List<String> currentList = new ArrayList<>();
            currentList.add(exDate);
            currentList.add(matcher.group("cal"));
            productList.put(product, currentList);*/
            System.out.printf("Item: %s, Best before: %s, Nutrition: %s%n", product, exDate, callories);
        }

        //Item: {item name}, Best before: {expiration date}, Nutrition: {calories}
       /* if (!productList.isEmpty()) {
            productList.entrySet().forEach(entry ->
                    System.out.printf("Item: %s, Best before: %s, Nutrition: %s%n", entry.getKey(), entry.getValue().get(0), entry.getValue().get(1)));
        }*/

    }
}
