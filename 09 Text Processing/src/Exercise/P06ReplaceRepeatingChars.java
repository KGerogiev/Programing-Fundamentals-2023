package Exercise;

import java.util.Scanner;

public class P06ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder result = new StringBuilder();
        result.append(input.charAt(0));

        for (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i + 1) != input.charAt(i)) {
                result.append(input.charAt(i + 1));
            }
        }
        System.out.println(result);
    }
}
