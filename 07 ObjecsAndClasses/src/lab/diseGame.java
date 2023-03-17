package lab;

import java.util.Random;
import java.util.Scanner;

public class diseGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countComputersWin = 0;
        int countPlayersWin = 0;

        Random rnd = new Random();
        System.out.println("Make your bet:");
        String command = scanner.nextLine();

        while (!command.equals("end")) {
            int currentBet = Integer.parseInt(command);
            if (currentBet < 1 || currentBet > 6) {
                System.out.println("Incorrect input, try again:");
                command = scanner.nextLine();
                continue;
            }

            int computerBet = rnd.nextInt(7);

            if (currentBet == computerBet) {
                System.out.println("You Win!");
                countPlayersWin++;
            } else {
                System.out.println("You Loose!");
                countComputersWin++;
            }
            System.out.println("Try again or type end to quit the game");
            command = scanner.nextLine();
        }
        if (countPlayersWin > countComputersWin) {
            System.out.printf("The final result is %d : %d - YOU WIN THE GAME!", countPlayersWin, countComputersWin);
        } else if (countComputersWin > countPlayersWin) {
            System.out.printf("The final result is %d : %d - YOU LOOSE THE GAME!", countComputersWin, countPlayersWin);
        } else {
            System.out.printf("Equal result: %d : %d", countComputersWin, countPlayersWin);
        }
    }
}
