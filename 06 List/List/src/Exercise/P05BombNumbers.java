package Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> bombNumberAndPower = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        int bombNumber = bombNumberAndPower.get(0);
        int power = bombNumberAndPower.get(1);

        for (int i = 0; i < numbersList.size(); i++) {
            if (numbersList.get(i) == bombNumber) {
                if (i + power <= numbersList.size() - 1) {
                    for (int j = 1; j <= power; j++) {
                        numbersList.remove(i + 1);
                    }
                } else {
                    for (int j = numbersList.size()-1; j > i; j++) {
                        numbersList.remove(j);
                    }
                }

                if (i - power >= 0) {
                    for (int j = 1; j <= power; j++) {
                        numbersList.remove(i - 1);
                        i--;
                    }
                } else {
                    for (int j = 0; j < numbersList.get(i); j++) {
                        numbersList.remove(j);
                    }
                }
                numbersList.remove(i);
            }
        }

        int sum = 0;
        for (int current : numbersList){
            sum += current;
        }
        System.out.println(sum);
    }
}




