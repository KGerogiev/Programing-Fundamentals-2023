package otherRegexProblems;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String regex = "(\\@{1}\\#+)(?<name>[A-Z]{1}[A-Za-z0-9]{4,}[A-Z]{1})(\\@{1}\\#+)";
        Pattern pattern = Pattern.compile(regex);

        for (int i = 1; i <= n ; i++) {
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()){
                String name = matcher.group("name");
                String group = returnGroup(name);
                if (group.isEmpty()){
                    System.out.printf("Product group: 00%n");
                    continue;
                } else {
                    System.out.printf("Product group: %s%n", group);
                    continue;
                }
            }
            System.out.println("Invalid barcode");
        }

    }
    public static String returnGroup (String name){
        String group = "";
        for (int i = 0; i < name.length(); i++) {
            if (Character.isDigit(name.toCharArray()[i])){
                group += name.toCharArray()[i];
            }
        }
       return group;
    }
}
