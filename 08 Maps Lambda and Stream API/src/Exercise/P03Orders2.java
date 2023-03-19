package Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P03Orders2 {
    static class Product {
        private String name;
        private double price;
        private int quantity;

        public Product(String name, double price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return this.price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public int getQuantity() {
            return this.quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Product> productList = new ArrayList<>();

        while (!input.equals("buy")) {
            String[] productArr = input.split("\\s+");

            String name = productArr[0];
            double price = Double.parseDouble(productArr[1]);
            int quantity = Integer.parseInt(productArr[2]);
            boolean isExisting = false;

            for (Product product : productList) {
                if (product.getName().equals(name)) {
                    int currentQuantity = product.getQuantity();
                    product.setQuantity(currentQuantity + quantity);
                    product.setPrice(price);
                    isExisting = true;
                    break;
                }
            }
            if (!isExisting) {
                Product currentProduct = new Product(name, price, quantity);
                productList.add(currentProduct);
            }

            input = scanner.nextLine();
        }

        productList.forEach(entry -> System.out.printf("%s -> %.2f%n", entry.getName(), (entry.getQuantity() * entry.getPrice())));
    }
}
