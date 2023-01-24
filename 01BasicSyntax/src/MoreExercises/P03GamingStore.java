package MoreExercises;

import java.util.Scanner;

public class P03GamingStore {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double startBalance = Double.parseDouble(scanner.nextLine());
        double currentBalance = startBalance;
        String nextGame = scanner.nextLine();
        String currentGame = "";

        while (!nextGame.equals("Game Time")){
            double gamePrice = 0;
            if (nextGame.equals("OutFall 4")){
                gamePrice = 39.99;
                currentGame = "OutFall 4";
            } else if (nextGame.equals("CS: OG")){
                gamePrice = 15.99;
                currentGame = "CS: OG";
            }else if (nextGame.equals("Zplinter Zell")){
                gamePrice = 19.99;
                currentGame = "Zplinter Zell";
            }else if (nextGame.equals("Honored 2")){
                gamePrice = 59.99;
                currentGame = "Honored 2";
            }else if (nextGame.equals("RoverWatch")){
                gamePrice = 29.99;
                currentGame = "RoverWatch";
            }else if (nextGame.equals("RoverWatch Origins Edition")){
                gamePrice = 39.99;
                currentGame = "RoverWatch Origins Edition";
            } else {
                System.out.println("Not Found");
                nextGame = scanner.nextLine();
                continue;
            }
            currentBalance = currentBalance - gamePrice;
            if (currentBalance > 0){
                System.out.printf("Bought %s%n", currentGame);
                nextGame = scanner.nextLine();
                continue;
            }
            if (gamePrice > currentBalance && currentBalance != 0){
                System.out.println("Too Expensive");
                currentBalance = currentBalance + gamePrice;
                nextGame = scanner.nextLine();
                continue;
            }
            if (currentBalance <= 0){
                System.out.printf("Bought %s%n", currentGame);
                System.out.println("Out of money!");
                break;
            }

        }
        if (currentBalance != 0) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", startBalance - currentBalance, currentBalance);
        }

    }
}
