package Lab;

import java.util.Scanner;

public class P03SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split(" ");

        int[] numbersArr = new int[inputArr.length];

        for (int i = 0; i <= numbersArr.length - 1; i++){
            numbersArr[i] = Integer.parseInt(inputArr[i]);
        }
        int sumNumbers = 0;

        for (int i = 0; i <= numbersArr.length - 1; i++) {
            if (numbersArr[i] % 2 == 0) {
                sumNumbers += numbersArr[i];
            }
        }
        System.out.println(sumNumbers);

    }
}
