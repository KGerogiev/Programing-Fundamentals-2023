package DataTypesLExercise;

import java.util.Scanner;

public class P11Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        int snow = 0;
        int time = 0;
        int quality = 0;
        double value = 0;
        //For each snowball, you must calculate its snowballValue by the following formula:
        //(snowballSnow / snowballTime) ^ snowballQuality

        for (int i = 1; i <= count ; i++) {
            int currentSnow = Integer.parseInt(scanner.nextLine());
            int currentTime = Integer.parseInt(scanner.nextLine());
            int currentQuality = Integer.parseInt(scanner.nextLine());
            double currentValue = Math.pow((currentSnow / currentTime * 1.0), currentQuality);
            if (currentValue > value){
                value = currentValue;
                snow = currentSnow;
                time = currentTime;
                quality = currentQuality;
            }
        }

        System.out.printf("%d : %d = %.0f (%d)", snow, time, value,quality);


    }
}
