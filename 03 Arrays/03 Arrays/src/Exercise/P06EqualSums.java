package Exercise;

import java.util.Scanner;

public class P06EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int[] numbersArr = new int[input.length];

        for (int i = 0; i < numbersArr.length; i++) {
            numbersArr[i] = Integer.parseInt(input[i]);
        }
        boolean indexExist = true;
        for (int num = 0; num < numbersArr.length; num++) {
            int currentNum = numbersArr[num];
            int leftSum = 0;
            int rightSum = 0;
            //за сумата в ляво от моето число
            for (int i = 0; i < num; i++) {
                leftSum = leftSum + numbersArr[i];
            }
            //за сумата в дясно от моето число
            for (int i = num + 1; i < numbersArr.length; i++) {
                rightSum = rightSum + numbersArr[i];
            }
            if (leftSum == rightSum) {
                System.out.println(num);
                indexExist = false;
//                return;
            }
        }
        if (indexExist) {
            System.out.println("no");
        }
    }
}
