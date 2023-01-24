package DataTypesLExercise;

import java.util.Scanner;

public class P07WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tankCapacity = 255;
        int n = Integer.parseInt(scanner.nextLine());// брой вливания
        int leftCapacity = tankCapacity;

        for (int i = 1; i <= n; i++) {
            int currentFlow = Integer.parseInt(scanner.nextLine());
            if (leftCapacity < currentFlow){
                System.out.printf("Insufficient capacity!%n");
                continue;
            }
            leftCapacity = leftCapacity - currentFlow;
        }
        int poored = tankCapacity - leftCapacity;
        System.out.printf("%d", poored);
    }
}
