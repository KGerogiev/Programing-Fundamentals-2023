package MoreExercises;

import java.util.Scanner;

public class demo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1:");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2:");
        int num2 = sc.nextInt();
        System.out.println("Enter number 3:");
        int num3 = sc.nextInt();

        int biggest = 0;
        int mid = 0;
        int smallest = 0;

        if (num1 > num2 && num1 > num3) {
            biggest = num1;
            if (num2 > num3) {
                mid = num2;
                smallest = num3;
            }
            else {
                mid = num3;
                smallest = num2;
            }
        }

        if (num2 > num1 && num2 > num3) {
            biggest = num2;
            if (num1 > num3) {
                mid = num1;
                smallest = num3;
            }
            else {
                mid = num3;
                smallest = num1;
            }
        }

        if (num3 > num1 && num3 > num2) {
            biggest = num3;
            if (num1 > num2) {
                mid = num1;
                smallest = num2;
            }
            else {
                mid = num2;
                smallest = num1;
            }
        }

        System.out.println(biggest);
        System.out.println(mid);
        System.out.println(smallest);

    }
}