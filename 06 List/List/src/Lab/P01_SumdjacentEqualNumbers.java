package Lab;


import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01_SumdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbers = Arrays.stream(scanner.nextLine()
                        .split("\\s+"))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        for (int index = 0; index < numbers.size() - 1; index++) {

            double currentElement = numbers.get(index);

            if (currentElement == numbers.get(index + 1)) {

                double sum = currentElement + numbers.get(index + 1);
                numbers.set(index, sum);
                numbers.remove(index + 1);
                index = -1;
            }

        }

        String result = getString(numbers);
        System.out.println(result);
    }

    public static String getString(List<Double> numbers) {
        String result = "";
        for (int i = 0; i <= numbers.size() - 1; i++) {
            String delimiter = " ";
            DecimalFormat df = new DecimalFormat("0.##");
            String text = df.format(numbers.get(i)) + delimiter;
            result = result + text;
        }
        return result;
    }
}
