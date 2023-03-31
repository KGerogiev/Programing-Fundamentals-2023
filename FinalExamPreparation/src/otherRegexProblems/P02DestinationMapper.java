package otherRegexProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String regex = "(\\=|\\/){1}(?<place>[A-Z]{1}[A-Za-z]{2,})\\1";
        List<String> destinations = new ArrayList<>();
        int points = 0;
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()){
            String destination = matcher.group("place");
            destinations.add(destination);
            points += destination.length();
        }
        System.out.printf("Destinations: %s%n", String.join(", ", destinations));
        System.out.printf("Travel Points: %d", points);

    }
}
