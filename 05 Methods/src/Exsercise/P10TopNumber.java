package Exsercise;

import java.util.Scanner;

public class P10TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        //•	Its sum of digits is divisible by 8
        //•	Holds at least one odd digit,
        for (int i = 1; i <= n; i++) {
            boolean isTopNumber = isDivisibleBy8(i) && hasAtLeastOneOdd(i);
            if (isTopNumber) {
                System.out.printf("%d%n", i);
            }
        }
    }
    public static boolean isDivisibleBy8(int number) {
        int sum = 0;
        while (number > 0) {
            int currentDigit = number % 10;
            sum += currentDigit;
            number = number / 10;
        }
        return sum % 8 == 0;
    }

    public static boolean hasAtLeastOneOdd(int number) {
        boolean hasOddDigit = false;
        while (number > 0) {
            int currentDigit = number % 10;
            if (currentDigit % 2 != 0) {
                hasOddDigit = true;
                break;
            }
            number = number / 10;
        }
        return hasOddDigit;
    }

}
