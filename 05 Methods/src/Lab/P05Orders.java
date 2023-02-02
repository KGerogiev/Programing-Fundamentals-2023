package Lab;

import java.util.Scanner;

public class P05Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //coffee, water, coke, snacks

        String productInput = scanner.nextLine();
        int quantityInput = Integer.parseInt(scanner.nextLine());
        productsCosts(productInput, quantityInput);
    }
    public static void productsCosts(String product, int quantity){
        double result = 0;
        switch (product){
            case "coffee":
                result = quantity * 1.50;
                System.out.printf("%.2f",result);
                break;
            case "water":
                result = quantity;
                System.out.printf("%.2f",result);
                break;
            case "coke":
                result = quantity * 1.40;
                System.out.printf("%.2f",result);
                break;
            case "snacks":
                result = quantity * 2.00;
                System.out.printf("%.2f",result);
                break;
        }
    }
}
