package DataTypesLExercise;

import java.util.Scanner;

public class P08BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countKeg = Integer.parseInt(scanner.nextLine());
        String model = "";
        double maxVolume = 0;

        //π * r^2 * h.

        for (int i = 1; i <= countKeg ; i++) {
            String currentModel = scanner.nextLine();
            double currentRadius = Double.parseDouble(scanner.nextLine());
            int currentHight = Integer.parseInt(scanner.nextLine());
            double currentVolume = Math.PI * (currentRadius * currentRadius) * currentHight;
            if (currentVolume > maxVolume){
                maxVolume = currentVolume;
                model = currentModel;
            }
        }
        System.out.printf("%s%n", model);
    }
}
