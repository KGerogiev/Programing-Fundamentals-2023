import java.util.Scanner;

public class P01ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        double price = 0;


        while (!command.equals("special") && !command.equals("regular")) {
            double nextPrice = Double.parseDouble(command);

            if (nextPrice < 0) {
                System.out.println("Invalid price!");
                command = scanner.nextLine();
                continue;
            }
            price += nextPrice;

            command = scanner.nextLine();
        }

        double taxes = price * 0.2;
        double totalPrice = price + taxes;

        if (command.equals("special")) {
            totalPrice = totalPrice * 0.9;
        }
        if (totalPrice == 0) {
            System.out.println("Invalid order!");
            return;
        }
        System.out.printf("Congratulations you've just bought a new computer!%n");
        System.out.printf("Price without taxes: %.2f$%n", price);
        System.out.printf("Taxes: %.2f$%n",taxes);
        System.out.println("-----------");
        System.out.printf("Total price: %.2f$%n", totalPrice);


    }
}
