package Exercise;

import java.util.Scanner;

public class P05TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int[] numbersArr = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            numbersArr[i] = Integer.parseInt(input[i]);
        }

        for (int num = 0; num < numbersArr.length; num++) {
            boolean isBigger = true;
            int firstNum = numbersArr[num];
            for (int num2 = num + 1; num2 < numbersArr.length; num2++) {
                int secondNum = numbersArr[num2];
                if (secondNum >= firstNum) {
                    isBigger = false;
                    break;
                }
            }
            if (isBigger) {
                System.out.print(firstNum + " ");
            }
        }
    }
}
