package Lab;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> starNumbersList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> finalNumbersList = new ArrayList<>();

        for (int i = 0; i < starNumbersList.size() /2 ; i++) {
            int firstElement = starNumbersList.get(i);
            int secondElement = starNumbersList.get(starNumbersList.size()-1 - i);
            int sum = firstElement + secondElement;
            finalNumbersList.add(sum);
        }
        if (starNumbersList.size() % 2 != 0){
            finalNumbersList.add(starNumbersList.get(starNumbersList.size() / 2));
        }

        for (int number : finalNumbersList){
            System.out.print(number + " ");
        }
    }


}
