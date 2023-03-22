package lab;

import java.util.Scanner;

public class P03Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        String text = scanner.nextLine();

        /*while (text.contains(word)){
           String newString = text.replace(word, "");
           text = newString;
        }*/

        int index = text.indexOf(word);
        while (index != -1) {
            String current = text.replace(word, "");
            text = current;
            index = current.indexOf(word);
        }

        System.out.println(text);
    }
}
