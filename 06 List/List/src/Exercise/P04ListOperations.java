package Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("End")) {
            String[] commandLine = command.split("\\s+");

            //•	Add {number} - add number at the end
            if (commandLine[0].equals("Add")) {
                int numberToAdd = Integer.parseInt(commandLine[1]);
                numbersList.add(numberToAdd);
            }

            //•	Insert {number} {index} - insert number at given index
            if (commandLine[0].equals("Insert")) {
                int numvberToInsert = Integer.parseInt(commandLine[1]);
                int insertIndex = Integer.parseInt(commandLine[2]);
                if (insertIndex < 0 || insertIndex > numbersList.size() - 1) {
                    System.out.println("Invalid index");
                } else {
                    numbersList.add(insertIndex, numvberToInsert);
                }
            }

            //•	Remove {index} - remove that index
            if (commandLine[0].equals("Remove")) {
                int indexToRemove = Integer.parseInt(commandLine[1]);
                if (indexToRemove < 0 || indexToRemove > numbersList.size() - 1) {
                    System.out.println("Invalid index");
                } else {
                    numbersList.remove(indexToRemove);
                }
            }

            //•	Shift left {count} - first number becomes last 'count' times']
            if (commandLine[1].equals("left")) {
                int countShifts = Integer.parseInt(commandLine[2]);
                for (int i = 0; i < countShifts; i++) {
                    int currentFirstElement = numbersList.get(0);
                    numbersList.remove(0);
                    numbersList.add(currentFirstElement);
                }
            }

            //•	Shift right {count} - last number becomes first 'count' times
            if (commandLine[1].equals("right")) {
                int countShifts = Integer.parseInt(commandLine[2]);
                for (int i = 0; i < countShifts; i++) {
                    int currentLastElement = numbersList.get(numbersList.size() - 1);
                    numbersList.remove(numbersList.size() - 1);
                    numbersList.add(0, currentLastElement);
                }
            }

            command = scanner.nextLine();
        }

        for (int num : numbersList) {
            System.out.print(num + " ");

        }
    }
}

