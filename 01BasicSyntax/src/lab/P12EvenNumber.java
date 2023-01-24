package lab;

import java.util.Scanner;

public class P12EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        boolean isEven =  true;

        while (isEven){
            if (num % 2 == 0){
                System.out.printf("The number is: %d", Math.abs(num));
                isEven = false;
                continue;
                }
            System.out.printf("Please write an even number.%n");
            num = Integer.parseInt(scanner.nextLine());
        }
    }
}
