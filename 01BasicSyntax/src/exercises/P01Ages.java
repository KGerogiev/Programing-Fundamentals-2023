package basicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P01Ages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());

        //•	0-2 – baby;
        //•	3-13 – child;
        //•	14-19 – teenager;
        //•	20-65 – adult;
        //•	>=66 – elder;

        if (age >= 0 && age <= 2){
            System.out.println("baby");
        } else if (age <= 13){
            System.out.println("child");
        } else if (age <= 19){
            System.out.println("teenager");
        } else if (age <= 65){
            System.out.println("adult");
        } else if (age >= 66){
            System.out.println("elder");
        }
    }
}
