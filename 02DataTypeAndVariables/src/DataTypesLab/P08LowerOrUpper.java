package DataTypesLab;

import java.util.Scanner;

public class P08LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char symbol = scanner.nextLine().charAt(0);

        if (symbol >= 'a' && symbol <= 'z'){
            System.out.println("lower-case");
        } else if (symbol >= 'A' && symbol <= 'Z'){
            System.out.println("upper-case");
        }
    }
}
