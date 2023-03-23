package Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P07StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] sybols = scanner.nextLine().toCharArray();

        int allStength = 0;

        for (int i = 0; i < sybols.length; i++) {
            char current = sybols[i];

            while (allStength > 0 && current != '>'){
                sybols[i] = '-';
                allStength = allStength - 1;
                break;
            }

            if (current != '>'){
                continue;
            } else {
                int strength = Integer.parseInt(String.valueOf(sybols[i + 1])); // 1
                allStength = allStength + strength;
            }
        }
        List<Character> finalString = new ArrayList<>();
        for (int index = 0; index < sybols.length; index++) {
            if (sybols[index] != '-'){
                finalString.add(sybols[index]);
            }
        }
        finalString.forEach(e -> System.out.printf("%s", e));

    }
}

