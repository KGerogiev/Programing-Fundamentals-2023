package Exsercise;

import java.util.Scanner;

public class P01SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());
        int smalestNum = smallestOfThreeNumbers(firstNum, secondNum, thirdNum);
        System.out.println(smalestNum);

    }

    public static int smallestOfThreeNumbers (int first, int second, int third){
        int smallestNum = Integer.MAX_VALUE;
        if (first < smallestNum){
            smallestNum = first;
        }
        if (second < smallestNum){
            smallestNum = second;
        }
        if (third < smallestNum){
            smallestNum = third;
        }
        return smallestNum;
    }
}
