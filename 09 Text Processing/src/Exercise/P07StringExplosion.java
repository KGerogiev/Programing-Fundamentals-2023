package Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P07StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] characters = scanner.nextLine().toCharArray();
        List<String> charList = new ArrayList<>();
        for (Character symbol : characters) {
            charList.add(String.valueOf(symbol));
        }

        for (int i = 0; i < charList.size(); i++) {
            String currentSymbol = charList.get(i);
            int strength = 0;
            if (currentSymbol.equals(">")) {
                int newStrength = Integer.parseInt(charList.get(i + 1));

                for (int j = i + 1; j <= i + newStrength; j++) {

                    if (charList.get(j).equals(">")){
                        newStrength += Integer.parseInt(charList.get(j + 1));
                        continue;
                    } else {
                        charList.remove(j);
                    }
                }

            }

        }

    }
}

