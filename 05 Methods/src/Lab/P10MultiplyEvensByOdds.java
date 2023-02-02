package Lab;

import java.util.Scanner;

public class P10MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int sum = sumEven(number);
        int sumEvens = sumEven(number);
        int sumOdds = sumOdds(number);
        int result = multiplyTwoNumbers(sumEvens, sumOdds);
        System.out.println(result);

    }
    public static int sumEven(int num){
        int sum = 0;
        int number = Math.abs(num);
        while (number > 0){
            int current = number % 10;
            if (current % 2 == 0){
                sum += current;
            }
            number = number / 10;
        }
        return sum;
    }
    public static int sumOdds(int num){
        int sum = 0;
        int number = Math.abs(num);
        while (number > 0){
            int current = number % 10;
            if (current % 2 != 0){
                sum += current;
            }
            number = number / 10;
        }
        return sum;
    }
    public static int multiplyTwoNumbers(int firstNum, int secondNun){
        int product = firstNum * secondNun;
        return product;
    }
}
