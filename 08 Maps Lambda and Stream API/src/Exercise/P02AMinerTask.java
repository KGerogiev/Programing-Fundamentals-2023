package Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P02AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String material = scanner.nextLine();

        Map<String, Integer> materialsMap = new LinkedHashMap<>();


        while(!material.equals("stop")){

            int quantity = Integer.parseInt(scanner.nextLine());

            if (materialsMap.containsKey(material)){
                int currentQuantity = materialsMap.get(material);
                materialsMap.put(material, currentQuantity + quantity);
            } else {
                materialsMap.put(material, quantity);
            }


            material = scanner.nextLine();
        }
        materialsMap.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
    }
}
