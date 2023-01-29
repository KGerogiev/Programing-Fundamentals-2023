package Exercise;

import java.util.Scanner;

public class P07MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int[] numArr = new int[input.length];
        for (int i = 0; i < numArr.length; i++){
            numArr[i] = Integer.parseInt(input[i]);
        }
        int outNum = 0;
        int sum = 0;
        for (int num = 0; num  < numArr.length; num ++) {
            int equals = 1;
            int currentNum = numArr[num];
            for (int i = num + 1; i < numArr.length; i++) {
                int nextNum = numArr[i];
                if (currentNum == nextNum){
                    equals++;
                } else {
                    break;
                }
            }
            if (equals > sum){
                sum = equals;
                outNum = currentNum;
            }
        }
        for (int i = 1; i <= sum ; i++) {
            System.out.print(outNum + " ");
        }
    }
}
