package DataTypesLExercise;

import java.util.Scanner;

public class P10PokeMon {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            int power = Integer.parseInt(scanner.nextLine());
            int currentPower = power;
            int distance = Integer.parseInt(scanner.nextLine());
            int exFactor = Integer.parseInt(scanner.nextLine());
            int countPokes = 0;

            while (currentPower >= distance){

                currentPower = currentPower - distance;
                countPokes++;

                if (currentPower == power / 2){
                    if (exFactor != 0){
                        currentPower = currentPower / exFactor;
                        continue;
                    }
                }
            }
        System.out.println(currentPower);
        System.out.println(countPokes);
    }
}
