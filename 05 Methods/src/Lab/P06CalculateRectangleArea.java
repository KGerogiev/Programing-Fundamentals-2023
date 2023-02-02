package Lab;

import java.util.Scanner;

public class P06CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wideInput = Integer.parseInt(scanner.nextLine());
        int lengthInput = Integer.parseInt(scanner.nextLine());

        int area = rectangleArea(wideInput, lengthInput);
        System.out.println(area);

    }
    public static int rectangleArea(int firstNum, int secondNum){
        int result = 0;
        result = firstNum * secondNum;
        return result;
    }
}
