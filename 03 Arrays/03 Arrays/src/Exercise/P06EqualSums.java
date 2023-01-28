package Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P06EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer :: parseInt).toArray();

        for (int index = 0; index <= numbersArr.length - 1; index++) {
            int currentNum = numbersArr[index];
            int leftSum = 0;
            int rightSum = 0;

            // за лявата сума

            for (int i = numbersArr[0]; i < index; i++) {
                leftSum = leftSum + numbersArr[i];
            }

            // за дясната сума

            for (int i =numbersArr[numbersArr.length - 1]; i > index; i--) {
                rightSum = rightSum + numbersArr[i];
            }
        }
    }
}
