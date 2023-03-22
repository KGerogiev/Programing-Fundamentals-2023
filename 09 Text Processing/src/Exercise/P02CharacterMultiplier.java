package Exercise;

import java.util.Scanner;

public class P02CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();  //George Peter
        String firstText = input.split("\\s+")[0];
        String secondText = input.split("\\s+")[1];

        int minText = Math.min(firstText.length(), secondText.length());

        int sum = 0;

        for (int i = 0; i < minText; i++) {
            sum = sum + (firstText.charAt(i) * secondText.charAt(i));
        }

        if (firstText.length() == secondText.length()){
            System.out.println(sum);
            return;
        }

        if (firstText.length() == minText){
            // вторият тексе е по - голям
            for (int i = minText; i < secondText.length() ; i++) {
                sum = sum + secondText.charAt(i);
            }
        } else {
            // първият текст е по - голям
            for (int i = minText; i < firstText.length() ; i++) {
                sum = sum + firstText.charAt(i);
            }
        }
        System.out.println(sum);
    }
}
