package Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P08MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstNumInput = Double.parseDouble(scanner.nextLine());
        double secondNumInput = Double.parseDouble(scanner.nextLine());
        double result = rasedNumber(firstNumInput, secondNumInput);


        System.out.println(new DecimalFormat("0.####").format(result));

    }
    public static double rasedNumber(double firstNum, double secondNum){
        double result = 0;
        result = Math.pow(firstNum, secondNum);
        return result;
    }
}
