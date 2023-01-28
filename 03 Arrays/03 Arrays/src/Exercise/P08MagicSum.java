package Exercise;

import java.util.Scanner;

public class P08MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int magicNum = Integer.parseInt(scanner.nextLine());
        int[] numberArr = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            numberArr[i] = Integer.parseInt(input[i]);
        }

        for (int rotations = 0; rotations < numberArr.length - 1; rotations++) {
            int currentNum = numberArr[rotations];
            for (int i = rotations + 1; i < numberArr.length; i++) {

                if (currentNum + numberArr[i] == magicNum){
                    System.out.printf("%d %d%n", currentNum, numberArr[i]);
                }
            }

        }
    }
}
