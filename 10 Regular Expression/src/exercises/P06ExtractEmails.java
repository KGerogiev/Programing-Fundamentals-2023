package exercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P06ExtractEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        // e-mail format => <user>@<host>

        String regex = "(?<user>[A-Za-z0-9]+[\\.\\-\\_]*[A-Za-z0-9]*)@(?<host>[a-z]+\\-?[a-z]*\\.[a-z]+\\-?[a-z]*(\\.[a-z]+\\-?[a-z]*)*)";
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
