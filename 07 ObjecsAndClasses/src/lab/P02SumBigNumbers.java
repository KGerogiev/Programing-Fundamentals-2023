package lab;

import java.math.BigInteger;
import java.util.Scanner;

public class P02SumBigNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger bg1 = new BigInteger(scanner.next());
        BigInteger bg2 = new BigInteger(scanner.next());
        BigInteger sum = bg1.add(bg2);
        System.out.println(sum);


    }
}
