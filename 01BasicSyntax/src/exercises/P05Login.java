package basicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P05Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();

        //The password will be that username reversed.

        String password = "";

        for (int i = username.length() - 1; i >= 0 ; i--) {
            char digit = username.charAt(i);
            password = password + digit;
        }
        String enterdPass = scanner.nextLine();
        int countFails = 0;

        while (!enterdPass.equals(password)){
            countFails++;
            if (countFails == 4){
                System.out.printf("User %s blocked!%n", username);
                break;
            }
            System.out.printf("Incorrect password. Try again.%n");
            enterdPass = scanner.nextLine();
        }

        if (password.equals(enterdPass)){
            System.out.printf("User %s logged in.%n", username);
        }


    }
}
