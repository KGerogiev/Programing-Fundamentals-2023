package exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P01Furniture2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String regex = ">>(?<fur>[A-Z]+[a-z]*)<<(?<fprice>\\d+)(?<sprice>\\.?\\d*)!(?<quantity>\\d+)";

        Pattern pattern = Pattern.compile(regex);


        List<String> furnitureList = new ArrayList<>();
        double finalPrice = 0;

        while (!input.equals("Purchase")) {
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                //>>Sofa<<312.23!3
                String furniture = matcher.group("fur");
                String fPrice = matcher.group("fprice");
                String sPrice = matcher.group("sprice");
                String totalPrice = fPrice + sPrice;
                double price = Double.parseDouble(totalPrice);
                int quantity = Integer.parseInt(matcher.group("quantity"));

                double spend = price * quantity;
                finalPrice = finalPrice + spend;

                furnitureList.add(furniture);
            }

            input = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        for (String fur : furnitureList) {
            System.out.println(fur);
        }
        System.out.printf("Total money spend: %.2f", finalPrice);
    }
}
