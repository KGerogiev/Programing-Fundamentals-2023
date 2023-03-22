package lab;

import java.util.Scanner;

public class P04TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] banedWordsArr = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String baned : banedWordsArr) {
            String asteriks = replacement(baned);
            text = text.replace(baned,asteriks);
        }
        System.out.println(text);
    }

    public static String replacement(String word) {
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            result += '*';
        }
        return result;
    }
}
