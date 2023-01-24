package DataTypesLExercise;

import java.util.Scanner;

public class P09SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startYeald = Integer.parseInt(scanner.nextLine());
        // след всеки ден добивът спада с 10
        //когато добивът падне под 100 - източникът се изоставя
        int currentYeald = startYeald;
        int spiceMined = 0;
        int days = 0;

        while (currentYeald >= 100){
            days++;
            spiceMined = spiceMined + currentYeald;
            currentYeald = currentYeald - 10;
            if (spiceMined < 26){
                spiceMined = 0;
            } else {
                spiceMined = spiceMined - 26;
            }

        }
        if (currentYeald < 100) {
            if (spiceMined < 26) {
                spiceMined = 0;
            } else {
                spiceMined = spiceMined - 26;
            }

        }
        System.out.println(days);
        System.out.println(spiceMined);
    }
}
