package Lab;

import java.util.Scanner;

public class P06EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input1 = scanner.nextLine().split(" ");
        String[] input2 = scanner.nextLine().split(" ");

        int[] numbers1Arr = new int[input1.length];
        int[] numbers2Arr = new int[input2.length];

        for (int i = 0; i <= numbers1Arr.length - 1 ; i++) {
            numbers1Arr[i] = Integer.parseInt(input1[i]);
        }
        for (int i = 0; i <= numbers2Arr.length - 1 ; i++) {
            numbers2Arr[i] = Integer.parseInt(input2[i]);
        }

        int sum = 0;
        int diffIndex = -1;
        boolean areDifferent = true;

        for (int i = 0; i <= numbers1Arr.length - 1; i++){
            int currentNum1 = numbers1Arr[i];
            int currentNum2 = numbers2Arr[i];

            if (currentNum1 == currentNum2){
                sum += currentNum1;
            } else {
                diffIndex = i;
                areDifferent = false;
                break;
            }
        }
        if (areDifferent){
            System.out.printf("Arrays are identical. Sum: %d%n", sum);
        } else {
            System.out.printf("Arrays are not identical. Found difference at %d index.%n", diffIndex);
        }

    }
}
