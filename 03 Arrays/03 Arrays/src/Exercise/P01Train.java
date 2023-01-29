package Exercise;

import java.util.Scanner;

public class P01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countVagons = Integer.parseInt(scanner.nextLine());


        int[] peopleCount = new int[countVagons];
        int sumPeople = 0;

        for (int i = 0; i <= peopleCount.length - 1 ; i++) {
            peopleCount[i] = Integer.parseInt(scanner.nextLine());
            sumPeople += peopleCount[i];
        }
        for (int print : peopleCount) {
            System.out.print(print + " ");
        }
        System.out.println();
        System.out.println(sumPeople);
    }
}
