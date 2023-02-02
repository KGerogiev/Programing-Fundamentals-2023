package Lab;

import java.util.Scanner;

public class P02Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double gradeInput = Double.parseDouble(scanner.nextLine());;
        grade(gradeInput);

    }
    public static void grade(double num){
        if (num >= 2 && num <=2.99){
            System.out.println("Fail");
        } else if (num <= 3.49){
            System.out.println("Poor");
        }else if (num <= 4.49) {
            System.out.println("Good");
        } else if (num <= 5.49) {
            System.out.println("Very good");
        } else {
            System.out.println("Excellent");
        }
    }
}
