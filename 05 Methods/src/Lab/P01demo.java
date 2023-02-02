package Lab;

import java.util.Scanner;

public class P01demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        String numberType = type(number);
        if (numberType.equals("positive")){
            isPositive(number);
        } else if (numberType.equals("negative")){
            isNegative(number);
        } else {
            isZero(number);
        }
    }
    public static String type(int num){
        String type = "";
        if (num < 0){
            type = "negative";
        } else if (num > 0){
            type = "positive";
        } else {
            type = "zero";
        }
        return type;
    }

    public static void isNegative(int num) {
        System.out.printf("The number %d is negative.", num);
    }

    public static void  isPositive(int num){
        System.out.printf("The number %d is positive.", num);
    }

    public static void isZero(int num){
        System.out.printf("The number %d is zero.", num);
    }

}
