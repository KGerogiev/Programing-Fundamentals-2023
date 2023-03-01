package lab;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01RandomizeWords {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> input = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        Random rnd = new Random();

        for (int i = 0; i < input.size(); i++) {
            int firstIndex = rnd.nextInt(input.size());
            String oldWordPlace = input.get(i);
            input.set(i, input.get(firstIndex));
            input.set(firstIndex, oldWordPlace);

        }

        for (String current : input){
            System.out.println(current);
        }

    }
}
