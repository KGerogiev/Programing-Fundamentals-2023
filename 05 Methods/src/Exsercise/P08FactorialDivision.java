package Exsercise;

import java.util.Scanner;

public class P08FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        if (firstNum <= 0 || secondNum <= 0){
            return;
        }

        long firstNumFactoriel = factorialFinder(firstNum);
        long secondNumFactoriel = factorialFinder(secondNum);

        double result = firstNumFactoriel * 1.0 / secondNumFactoriel;

        System.out.printf("%.2f", result);

    }
    public static long factorialFinder(int n){
        long factorial = 1;
        for (int i = 1; i <= n ; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
}
