package Lab;

import java.util.*;

public class P06ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countProducts = Integer.parseInt(scanner.nextLine());
        List<String> products = new ArrayList<>();

        for (int i = 0; i < countProducts; i++) {
            products.add(scanner.nextLine());
        }
        Collections.sort(products);

        for (int i = 0; i < countProducts ; i++) {
            int countProduct = i + 1;
            System.out.println(countProduct + "." + products.get(i));
        }
    }
}
