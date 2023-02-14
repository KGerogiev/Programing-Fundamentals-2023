package Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstNumList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondNumList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> resultList = new ArrayList<>();

        int minValue = Math.min(firstNumList.size(), secondNumList.size());

        for (int index = 0; index < minValue; index++) {
            int firstNum = firstNumList.get(index);
            int secondNum = secondNumList.get(index);

            resultList.add(firstNum);
            resultList.add(secondNum);
        }

        if (firstNumList.size() > secondNumList.size()) {
            for (int index = minValue; index < firstNumList.size(); index++) {
                resultList.add(firstNumList.get(index));
            }
        } else {
            for (int index = minValue; index < secondNumList.size(); index++) {
                resultList.add(secondNumList.get(index));
            }
        }
        for (int i = 0; i < resultList.size(); i++) {
            System.out.print(resultList.get(i) + " ");
        }
    }
}

