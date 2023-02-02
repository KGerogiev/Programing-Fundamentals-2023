package Lab;

import java.util.Scanner;

public class P03PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        makeTriangle(n);

    }
    public static void makeTriangle(int num){
        positiveSide(num);
        negativeSide(num);
    }

    public static void positiveSide(int num){
        for (int i = 1; i <=num; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void negativeSide(int num){
        for (int i = num - 1; i >= 1 ; i--) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
