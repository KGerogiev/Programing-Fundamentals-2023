package basicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P06StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int startNumber = number;
        int sumFactorials = 0;


        while (number > 0) {
            int digit = number % 10;
            int factorials = 1;
            for (int i = digit; i > 0; i--) {
                factorials = factorials * i;
            }
            sumFactorials = sumFactorials + factorials;
            number = number / 10;
        }

        if (sumFactorials == startNumber) {
            System.out.printf("yes%n");
        }
        if (sumFactorials != startNumber) {
            System.out.printf("no%n");
        }

    }
}
