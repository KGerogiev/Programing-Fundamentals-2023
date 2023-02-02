package Lab;

import java.util.Scanner;

public class P07RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int countInput = Integer.parseInt(scanner.nextLine());
        String result = textRepeater(input, countInput);
        System.out.println(result);

    }
    public static String textRepeater(String text, int times){
        String textRepeated = "";
        for (int i = 1; i <= times ; i++) {
            textRepeated += text;
        }
        return textRepeated;
    }
}
