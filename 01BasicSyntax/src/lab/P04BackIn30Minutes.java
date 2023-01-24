package lab;

import java.util.Scanner;

public class P04BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int allTime = (hours * 60) + minutes + 30;

        int finalHour = allTime / 60;
        int finalMinutes = allTime % 60;

        if (finalHour == 24){
            finalHour = 0;
        }

        if (finalMinutes < 10) {
            System.out.printf("%d:%02d", finalHour, finalMinutes);
        } else {
            System.out.printf("%d:%d", finalHour, finalMinutes);
        }

    }
}
