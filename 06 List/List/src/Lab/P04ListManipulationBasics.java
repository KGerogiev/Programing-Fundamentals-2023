package Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04ListManipulationBasics {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] commandLine = command.split("\\s+");
            //Add {number}: add a number to the end of the list
            if (commandLine[0].equals("Add")) {
                addMethod(numbersList, Integer.parseInt(commandLine[1]));
            }
            //Remove {number}: remove a number from the list
            if (commandLine[0].equals("Remove")) {
                removeMethod(numbersList, Integer.parseInt(commandLine[1]));
            }
            //RemoveAt {index}: remove a number at a given index
            if (commandLine[0].equals("RemoveAt")) {
                removeAtMethod(numbersList, Integer.parseInt(commandLine[1]));
            }
            //Insert {number} {index}: insert a number at a given index
            if (commandLine[0].equals("Insert")) {
                insertMethod(numbersList, Integer.parseInt(commandLine[1]), Integer.parseInt(commandLine[2]));
            }


            command = scanner.nextLine();
        }

        for (int number : numbersList){
            System.out.print(number + " ");
        }

    }

    public static List addMethod(List<Integer> numbersList, int number) {
        int numberToAdd = number;
        numbersList.add(numberToAdd);
        return numbersList;
    }

    public static List removeMethod(List<Integer> numbersList, int number) {
        int numberToRemove = number;
        numbersList.remove(Integer.valueOf(number));
        return numbersList;
    }

    public static List removeAtMethod(List<Integer> numbersList, int number) {
        int indexToRemove = number;
        numbersList.remove(number);
        return numbersList;
    }

    public static List insertMethod(List<Integer> numbersList, int number, int index) {
        int numberToInsert = number;
        int indexToInsert = index;
        numbersList.add(indexToInsert, number);
        return numbersList;
    }
}
