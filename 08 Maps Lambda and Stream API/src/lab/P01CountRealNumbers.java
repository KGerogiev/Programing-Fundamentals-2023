package lab;

import java.text.DecimalFormat;
import java.util.*;

public class P01CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numbersArr = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(w -> Double.parseDouble(w)).toArray();

        Map<Double, Integer> numMap = new TreeMap<>();

        for (int i = 0; i < numbersArr.length; i++) {
            double num = numbersArr[i];

            if (!numMap.containsKey(num)){
                numMap.put(num, 1);
            } else {
                int value = numMap.get(num);
                numMap.put(num, value + 1);
            }
        }

        DecimalFormat df = new DecimalFormat("#.######");

        for (Map.Entry<Double, Integer> entry : numMap.entrySet()) {
            System.out.printf("%s -> %d%n", df.format(entry.getKey()), entry.getValue());
        }


    }
}
