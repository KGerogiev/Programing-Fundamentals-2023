package Exsercise;

import java.util.Scanner;

public class P05AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int tirdNum = Integer.parseInt(scanner.nextLine());*/

        //int sumOfFirst = sumOfFirstTwoIntegers(firstNum, secondNum);
        int finalResult = substract(sumOfFirstTwoIntegers(Integer.parseInt(scanner.nextLine()), Integer.parseInt(scanner.nextLine())),
                                                          Integer.parseInt(scanner.nextLine()));
        System.out.printf("%d", finalResult);

    }
    public static int sumOfFirstTwoIntegers(int first, int second){
        int sum = 0;
        sum = first + second;
        return  sum;
    }
    public static int substract(int first, int second){
        int sum = 0;
        sum = first - second;
        return sum;
    }

}
