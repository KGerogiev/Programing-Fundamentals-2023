package Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P03Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Double> priceList = new LinkedHashMap<>();
        Map<String, Integer> quantityList = new LinkedHashMap<>();

        while (!input.equals("buy")){
            String[] productArr = input.split("\\s+");//Beer 2.20 100
            String product = productArr[0];
            double price = Double.parseDouble(productArr[1]);
            int quantity = Integer.parseInt(productArr[2]);

            if (!priceList.containsKey(product)){
                priceList.put(product, price);
                quantityList.put(product, quantity);
            } else {
                int currentQuantity = quantityList.get(product);
                quantityList.put(product, currentQuantity + quantity);
                priceList.put(product, price);
            }

            input = scanner.nextLine();
        }

        Map<String, Double> finalPriceList = new LinkedHashMap<>();

        for (Map.Entry<String, Double> entry : priceList.entrySet()) {
            String product = entry.getKey();
            double price = entry.getValue();
            int count = quantityList.get(product);
            finalPriceList.put(product, count * price);
        }

        finalPriceList.entrySet().forEach(e -> System.out.printf("%s -> %.2f%n", e.getKey(), e.getValue()));
    }
}
