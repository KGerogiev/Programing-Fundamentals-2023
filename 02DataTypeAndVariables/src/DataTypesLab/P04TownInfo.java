package DataTypesLab;

import java.util.Scanner;

public class P04TownInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine(); // Име на града
        long population = Integer.parseInt(scanner.nextLine()); //население
        float area = Float.parseFloat(scanner.nextLine()); // площ

        System.out.printf("Town %s has population of %d and area %.0f square km.", name, population, area);

    }
}
