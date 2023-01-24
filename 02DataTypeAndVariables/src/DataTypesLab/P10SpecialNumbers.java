package DataTypesLab;

import java.util.Scanner;

public class P10SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        //A number is special when its sum of digits is 5, 7, or 11.

//        int sum = 0;
//
//        int numManipulated = num;
//
//        while (numManipulated > 0){
//            int currentNum = numManipulated % 10;
//            sum = sum + currentNum;
//            numManipulated = numManipulated / 10;
//        }
//
//        boolean isSpecial = sum == 5 || sum == 7 || sum == 11;
//
//        if (isSpecial){
//            System.out.println(num + " -> True");
//        } else {
//            System.out.println(num + " -> False");
//        }

        for (int i = 1; i <= num ; i++) {
            int sum = 0;
            int currentNum = i;
            while (currentNum > 0){
                int digit = currentNum % 10;
                sum = sum + digit;
                currentNum = currentNum / 10;
            }
            boolean isSpecial = sum == 5 || sum == 7 || sum == 11;
            if (isSpecial){
                System.out.println(i + " -> True");
            } else {
                System.out.println(i + " -> False");
            }
        }

    }
}
