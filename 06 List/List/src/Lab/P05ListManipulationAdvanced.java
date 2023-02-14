package Lab;

import java.awt.image.FilteredImageSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] commandLine = command.split("\\s+");

            //Contains {number} – check if the list contains the number.
            //If yes, print "Yes", otherwise, print "No such number"
            if (commandLine[0].equals("Contains")) {
                int numberToContain = Integer.parseInt(commandLine[1]);
                if (isContains(numbersList, numberToContain)) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No such number");
                }
            }

            //Print even – print all the numbers that are even separated by a space
            if (commandLine[1].equals("even")) {
                for (int number : printEvenNumbers(numbersList)) {
                    System.out.print(number + " ");
                }
                System.out.println();
            }

            //Print odd – print all the numbers that are oddly separated by a space
            if (commandLine[1].equals("odd")) {
                for (int number : printOddNumbers(numbersList)) {
                    System.out.print(number + " ");
                }
                System.out.println();
            }

            //Get sum – print the sum of all the numbers
            if (commandLine[0].equals("Get")) {
                System.out.println(getSum(numbersList));
            }

            //Filter {condition} {number} – print all the numbers that fulfill that condition.
            // The condition will be either '<', '>', ">=", "<="
            if (commandLine[0].equals("Filter")){
                for (int number : filteredNums(numbersList, commandLine[1], Integer.parseInt(commandLine[2]))){
                    System.out.print(number + " ");
                }
                System.out.println();
            }

            command = scanner.nextLine();
        }
    }

    public static boolean isContains(List<Integer> numbers, int number) {
        int surchedNumber = number;
        return numbers.contains(number);
    }

    public static List<Integer> printEvenNumbers(List<Integer> numbers) {
        List<Integer> evenNumbers = new ArrayList<>();
        for (int index = 0; index < numbers.size(); index++) {
            if (numbers.get(index) % 2 == 0) {
                evenNumbers.add(numbers.get(index));
            }
        }
        return evenNumbers;
    }

    public static List<Integer> printOddNumbers(List<Integer> numbers) {
        List<Integer> oddNumbers = new ArrayList<>();
        for (int index = 0; index < numbers.size(); index++) {
            if (numbers.get(index) % 2 != 0) {
                oddNumbers.add(numbers.get(index));
            }
        }
        return oddNumbers;
    }

    public static int getSum(List<Integer> numbers) {
        int sum = 0;
        for (int index = 0; index < numbers.size(); index++) {
            sum += numbers.get(index);
        }
        return sum;
    }

    public static List<Integer> filteredNums(List<Integer> numbers, String condition, int number){
        List<Integer> resultList = new ArrayList<>();
        switch (condition){
            case "<":
                for (int filterdNum : numbers){
                    if (filterdNum < number){
                        resultList.add(filterdNum);
                    }
                }
                break;
            case">":
                for (int filterdNum : numbers){
                    if (filterdNum > number){
                        resultList.add(filterdNum);
                    }
                }
                break;
            case ">=":
                for (int filterdNum : numbers){
                    if (filterdNum >= number){
                        resultList.add(filterdNum);
                    }
                }
                break;
            case "<=":
                for (int filterdNum : numbers){
                    if (filterdNum <= number){
                        resultList.add(filterdNum);
                    }
                }
                break;
        }
        return resultList;
    }
}
