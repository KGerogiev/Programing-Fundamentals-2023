import java.util.Scanner;

public class P11RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //His gaming setup consists of a headset, mouse, keyboard, and display

        int lostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int countHeadsetLost = lostGames / 2;
        int countMouseLost =  lostGames / 3;
        int countKeyboardLost = lostGames / 6;
        int countDisplayLost = lostGames / 12;

        double headsetCosts = headsetPrice * countHeadsetLost;
        double mouseCosts = countMouseLost * mousePrice;
        double keyboardCosts = countKeyboardLost * keyboardPrice;
        double displayCosts = countDisplayLost * displayPrice;

        double finalPrice = headsetCosts + mouseCosts + keyboardCosts + displayCosts;

        System.out.printf("Rage expenses: %.2f lv.%n", finalPrice);
    }
}
