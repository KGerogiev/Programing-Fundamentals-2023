package DataTypesLExercise;

import java.util.Scanner;

public class P04SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sumChars = 0;

        for (int i = 1; i <= n; i ++){
            char symbol = scanner.nextLine().charAt(0);
            int symbolNum = (int) symbol;
            sumChars = sumChars + symbolNum;
        }
        System.out.printf("The sum equals: %d", sumChars);
    }
}
