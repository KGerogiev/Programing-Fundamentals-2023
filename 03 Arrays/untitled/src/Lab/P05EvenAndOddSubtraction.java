package Lab;

import java.util.Scanner;

public class P05EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int[] numbers = new int[input.length];

        for (int i = 0; i <= input.length - 1 ; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i <= numbers.length - 1; i++) {
            int currentNum = numbers[i];
            if (currentNum % 2 == 0){
                sumEven += currentNum;
            } else {
                sumOdd += currentNum;
            }
        }
        int diff = sumEven - sumOdd;
        System.out.println(diff);

    }
}
