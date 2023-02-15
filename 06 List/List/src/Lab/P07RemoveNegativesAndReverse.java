package Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P07RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        for (int index = 0; index < numbersList.size(); index++) {
            if (numbersList.get(index) < 0){
                numbersList.remove(index);
                index--;
            }
        }

        if (numbersList.size() == 0){
            System.out.println("empty");
        } else {
            for (int i = 0; i < getReversedList(numbersList).size(); i++) {
                System.out.print(getReversedList(numbersList).get(i) + " ");
            }
        }
    }

    public static List getReversedList (List<Integer> numbers){
        List<Integer> reversed = new ArrayList<>();

        for (int i = numbers.size() - 1; i >= 0 ; i--) {
            reversed.add(numbers.get(i));
        }
        return reversed;
    }
}
