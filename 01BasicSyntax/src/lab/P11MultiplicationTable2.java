package lab;

import java.util.Scanner;

public class P11MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());


        if (secondNum > 10) {
            int sum = firstNum * secondNum;
            System.out.printf("%d X %d = %d", firstNum, secondNum, sum);
        }

        for (int i = secondNum; i <= 10; i++) {
            int sum = firstNum * i;
            System.out.printf("%d X %d = %d%n", firstNum, i, sum);

        }
    }
}
