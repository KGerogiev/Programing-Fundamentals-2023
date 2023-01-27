package Lab;

import java.util.Scanner;

public class P07CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int[] nubmersArr = new int[input.length];

        for (int i = 0; i <= input.length - 1 ; i++) {
            nubmersArr[i] = Integer.parseInt(input[i]);
        }
        int counter = nubmersArr.length;

        while (counter > 1){
            int[] temp = new int[counter - 1];
            for (int i = 0; i <= counter - 2 ; i++) {
                int sum = 0;
                sum = nubmersArr[i] + nubmersArr[i + 1];
                temp[i] = sum;
                nubmersArr[i] = temp [i];
            }
            counter--;
        }
        System.out.println(nubmersArr[0]);
    }
}
