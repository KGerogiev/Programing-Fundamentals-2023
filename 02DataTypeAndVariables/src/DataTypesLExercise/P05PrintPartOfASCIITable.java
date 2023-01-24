package DataTypesLExercise;

import java.util.Scanner;

public class P05PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNum = Integer.parseInt(scanner.nextLine());
        int stopNum = Integer.parseInt(scanner.nextLine());

        for (int i = startNum; i <= stopNum ; i++) {
            char symbolChar = (char) i;
            System.out.print(symbolChar + " ");
        }

    }

}
