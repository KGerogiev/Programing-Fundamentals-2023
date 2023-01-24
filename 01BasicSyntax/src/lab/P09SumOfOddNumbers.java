package lab;

import java.util.Scanner;

public class P09SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        int startNum = 1;
        short counter = 1;
        int sum = 0;

        while (counter <= count) {
            if (startNum % 2 != 0) {
                System.out.println(startNum);
                sum = sum + startNum;
                counter += 1;
            }
            startNum += 1;

        }
        System.out.printf("Sum: %d", sum);
    }
}
