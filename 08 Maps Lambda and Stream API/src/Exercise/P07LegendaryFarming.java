package Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P07LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isWon = false;
        Map<String, Integer> legendaryItems = new LinkedHashMap<>();
        legendaryItems.put("shards", 0);
        legendaryItems.put("fragments", 0);
        legendaryItems.put("motes", 0);
        Map<String, Integer> junk = new LinkedHashMap<>();

        while (!isWon) {
            //"{quantity1} {material1} {quantity2} {material2}
            String[] inputArr = scanner.nextLine().toLowerCase().split(" ");

            //Shards", "Fragments", and "Motes" 
            for (int i = 1; i < inputArr.length; i += 2) {
                if (inputArr[i].equals("shards") || inputArr[i].equals("fragments") || inputArr[i].equals("motes")) {
                    String currentItem = inputArr[i];
                    int newValue = Integer.parseInt(inputArr[i - 1]);
                    int currentValue = legendaryItems.get(currentItem);
                    legendaryItems.put(currentItem, currentValue + newValue);
                } else {
                    String currentItem = inputArr[i];
                    int newValue = Integer.parseInt(inputArr[i - 1]);
                    if (!junk.containsKey(currentItem)) {
                        junk.put(currentItem, newValue);
                    } else {
                        int currentValue = junk.get(currentItem);
                        junk.put(currentItem, currentValue + newValue);
                    }
                }

                if (legendaryItems.get("shards") >= 250){
                    System.out.println("Shadowmourne obtained!");
                    legendaryItems.put("shards", legendaryItems.get("shards") - 250);
                    isWon = true;
                    break;
                } else if (legendaryItems.get("fragments") >= 250) {
                    System.out.println("Valanyr obtained!");
                    legendaryItems.put("fragments", legendaryItems.get("fragments") - 250);
                    isWon = true;
                    break;
                } else if (legendaryItems.get("motes") >= 250) {
                    System.out.println("Dragonwrath obtained!");
                    legendaryItems.put("motes", legendaryItems.get("motes") - 250);
                    isWon = true;
                    break;
                }
                if (isWon) {
                    break;
                }
            }
        }

        legendaryItems.entrySet().forEach(e -> System.out.printf("%s: %d%n", e.getKey(), e.getValue()));
        junk.entrySet().forEach(e -> System.out.printf("%s: %d%n", e.getKey(), e.getValue()));
    }
}
