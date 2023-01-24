import java.util.Scanner;

public class P09Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOrders = Integer.parseInt(scanner.nextLine());

        //((daysInMonth * capsulesCount) * pricePerCapsule)
        //orderPrice = 30 * 8 * 1.53 = 367.20

        double totalPrice = 0;

        for (int i = 1; i <= countOrders ; i++) {

            double priceForCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsulesCount = Integer.parseInt(scanner.nextLine());

            double coffeePrice = days * capsulesCount *priceForCapsule;

            totalPrice = totalPrice + coffeePrice;

            System.out.printf("The price for the coffee is: $%.2f%n", coffeePrice);

        }

        System.out.printf("Total: $%.2f%n", totalPrice);

    }
}
