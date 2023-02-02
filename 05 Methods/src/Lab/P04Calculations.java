package Lab;

import java.util.Scanner;

public class P04Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //"add", "multiply", "subtract", "divide"

        String command = scanner.nextLine();
        int firstNumInput = Integer.parseInt(scanner.nextLine());
        int secondNumInput = Integer.parseInt(scanner.nextLine());
        result(command, firstNumInput, secondNumInput);
    }

    public static void result(String command, int firstNum, int secondNum){
        switch (command){
            case "add":
                add(firstNum, secondNum);
                break;
            case "multiply":
                multiply(firstNum, secondNum);
                break;
            case "subtract":
                substract(firstNum, secondNum);
                break;
            case "divide":
                divide(firstNum, secondNum);
                break;
        }
    }
    public static void add(int firstNum, int secondNum){
        int result = firstNum + secondNum;
        System.out.println(result);
    }
    public static void multiply(int firstNum, int secondNum){
        int result = firstNum * secondNum;
        System.out.println(result);
    }
    public static void substract(int firstNum, int secondNum){
        int result = firstNum - secondNum;
        System.out.println(result);
    }
    public static void divide(int firstNum, int secondNum){
        int result = firstNum / secondNum;
        System.out.println(result);
    }

}
