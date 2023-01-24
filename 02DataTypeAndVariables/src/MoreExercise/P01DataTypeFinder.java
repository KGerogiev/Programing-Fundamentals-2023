package MoreExercise;

import java.lang.reflect.Type;
import java.net.Proxy;
import java.util.Scanner;

public class P01DataTypeFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        String jobTitle = "Agent";
//        int employeeId = 7;
//        double floating= 10.0;
//        String bond = jobTitle + employeeId;
//
//        System.out.println(((Object)floating).getClass().getSimpleName());
//        System.out.println(((Object)employeeId).getClass().getSimpleName());
//        System.out.println(((Object)jobTitle).getClass().getSimpleName());
//        System.out.println(((Object)bond).getClass().getSimpleName());


//        System.out.println(((Object)income).getClass().getSimpleName());
        String input = scanner.nextLine();
        Scanner type = new Scanner(input);

        if (type.hasNextDouble()) {
            System.out.println("Double");
        } else if (type.hasNextInt()) {
            System.out.println("Integer");
        } else if(type.hasNextBoolean()) {
            System.out.println("Boolean");
        } else if (type.hasNext()){
            if (input.length() == 1) {
                System.out.println("char");
            } else {
                System.out.println("Sting");
            }
        }


}
}
