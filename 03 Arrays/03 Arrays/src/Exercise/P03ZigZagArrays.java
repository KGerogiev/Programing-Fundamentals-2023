package Exercise;

import java.sql.SQLOutput;
import java.util.Scanner;

public class P03ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputCount = Integer.parseInt(scanner.nextLine());

        int[] firstArr = new int[inputCount];
        int[] secondArr = new int[inputCount];
        //1 10 31 20
        //5 9 81 41

        for (int i = 1; i <= inputCount; i++) {
            String[] input = scanner.nextLine().split(" ");
             int element1 = Integer.parseInt(input[0]);
             int element2 = Integer.parseInt(input[1]);

             if (i % 2 != 0){
                 firstArr[i - 1] = element1;
                 secondArr[i - 1] = element2;
             } else {
                 firstArr[i - 1] = element2;
                 secondArr[i - 1] = element1;
             }
        }
        for (int element : firstArr ){
            System.out.print(element + " ");
        }
        System.out.println();
        for (int element : secondArr) {
            System.out.print(element + " ");
        }
    }

}



