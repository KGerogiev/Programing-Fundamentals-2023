package Exsercise;

import java.util.Scanner;

public class P07NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        matrix(input);

    }
    public static void matrix(int n){
        int currentNum = n;
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= n ; j++) {
                System.out.print(currentNum + " ");
            }
            System.out.println();
        }
    }
}
