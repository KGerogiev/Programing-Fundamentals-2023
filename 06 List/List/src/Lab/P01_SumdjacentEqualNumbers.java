package Lab;

import java.util.*;
import java.util.stream.Collectors;

public class P01_SumdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbers = Arrays.stream(scanner.nextLine().split(" "))
                                .map(Double :: parseDouble)
                                .collect(Collectors.toList());

        for (int index = 0; index < numbers.size() - 1; index++) {
            if (numbers.get(index).equals(numbers.get(index + 1))){
                numbers.set(index, numbers.get(index) + numbers.get(index + 1));
            }
        }

    }
}
