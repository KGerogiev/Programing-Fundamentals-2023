package Lab;

import java.util.Scanner;

public class P01SignOfIntegerNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        signType(number);

    }
    public static void signType(int num){
        if (num < 0){
            System.out.printf("The number %d is negative.", num);
        } else if (num > 0){
            System.out.printf("The number %d is positive.", num);
        } else {
            System.out.printf("The number %d is zero.", num);
        }
    }
}
