package DataTypesLab;

import java.util.Scanner;

public class P12RefactorSpecialNumbers {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int numManipulated = 0;
        boolean isSpecial = false;
        for (int i = 1; i <= num; i++) {
            numManipulated = i;
            while (i > 0) {
                sum += i % 10;
                i = i / 10;
            }
            isSpecial = (sum == 5) || (sum == 7) || (sum == 11);
            if (isSpecial) {
                System.out.printf("%d -> True%n", numManipulated);
            } else {
                System.out.printf("%d -> False%n", numManipulated);
            }
            sum = 0;
            i = numManipulated;
        }

            }
}
