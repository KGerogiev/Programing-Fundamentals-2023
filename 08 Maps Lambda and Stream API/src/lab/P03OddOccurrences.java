package lab;

import java.util.*;

public class P03OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        Map<String, Integer> resultMap = new LinkedHashMap<>();

        for (int i = 0; i < input.length; i++) {
            String current = input[i].toLowerCase();

            if (!resultMap.containsKey(current)){
                resultMap.put(current, 1);
            } else {
                int value = resultMap.get(current);
                resultMap.put(current, value + 1);
            }
        }
        List<String> resultList = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : resultMap.entrySet()){
            if (entry.getValue() % 2 != 0){
                resultList.add(entry.getKey());
            }
        }

        System.out.printf("%s%n", String.join(", ", resultList));

    }
}
