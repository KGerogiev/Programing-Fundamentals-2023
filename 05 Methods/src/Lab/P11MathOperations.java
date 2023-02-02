package Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P11MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //    / * + -

        int firstNumInput = Integer.parseInt(scanner.nextLine());
        char operator = scanner.nextLine().charAt(0);
        int secondNumInput = Integer.parseInt(scanner.nextLine());
        double result = result(operator, firstNumInput, secondNumInput);

        System.out.println(new DecimalFormat("0.##").format(result(operator, firstNumInput, secondNumInput)));

    }
    public static double result(char operator, int firstNum, int secondNum){
        double result = 0;
        switch (operator){
            case '/':
                result = firstNum * 1.0 / secondNum;
                break;
            case '*':
                result = firstNum * 1.0 * secondNum;
                break;
            case '+':
                result = firstNum * 1.0 + secondNum;
                break;
            case '-':
                result = firstNum * 1.0 - secondNum;
                break;
        }
        return result;
    }
}
