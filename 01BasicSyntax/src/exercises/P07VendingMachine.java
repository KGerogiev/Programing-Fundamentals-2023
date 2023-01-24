import java.util.Scanner;

public class P07VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        double sumCoins = 0;

        //Your vending machine only works with 0.1, 0.2, 0.5, 1, and 2 coins.

        while (!command.equals("Start")) {
            double inputSum = Double.parseDouble(command);
            if (inputSum == 0.1 || inputSum == 0.2 || inputSum == 0.5 || inputSum == 1 || inputSum == 2) {
                sumCoins = sumCoins + inputSum;
                command = scanner.nextLine();
            } else {
                System.out.printf("Cannot accept %.2f%n", inputSum);
                command = scanner.nextLine();
            }
        }


        //Your machine has, however, only "Nuts", "Water", "Crisps", "Soda", "Coke".
        //The prices are:                  2.0,     0.7,     1.5,      0.8,    1.0    respectively.

        String product = command;
        double totalSum = sumCoins;

        //If the person tries to purchase a not existing product, print "Invalid product".

        while (!product.equals("End")) {

            if (!product.equals("Nuts") &&
                    !product.equals("Water") &&
                    !product.equals("Crisps") &&
                    !product.equals("Soda") &&
                    !product.equals("Coke") &&
                    !product.equals("Start")){
                System.out.println("Invalid product");
            }

            if (product.equals("Nuts")) {
                if (sumCoins >= 2.0) {
                    System.out.println("Purchased Nuts");
                    sumCoins = sumCoins - 2.0;
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else if (product.equals("Water")) {
                if (sumCoins >= 0.7) {
                    System.out.println("Purchased Water");
                    sumCoins = sumCoins - 0.7;
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else if (product.equals("Crisps")) {
                if (sumCoins >= 1.5) {
                    System.out.println("Purchased Crisps");
                    sumCoins = sumCoins - 1.5;
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else if (product.equals("Soda")) {
                if (sumCoins >= 0.8) {
                    System.out.println("Purchased Soda");
                    sumCoins = sumCoins - 0.8;
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else if (product.equals("Coke")) {
                if (sumCoins >= 1.0) {
                    System.out.println("Purchased Coke");
                    sumCoins = sumCoins - 1.0;
                } else {
                    System.out.println("Sorry, not enough money");
                }
          //  } else {
          //      System.out.println("Invalid product");
            }
            product = scanner.nextLine();
        }

        //After the "End" command, print the money that is left formatted to the second decimal point in the format
        // "Change: {money left}".

        double change = sumCoins;

        //if (product.equals("End")) {
            System.out.printf("Change: %.2f", change);
        //}
    }


}










