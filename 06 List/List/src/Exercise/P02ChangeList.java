package Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")){
            String[] commandLine = command.split("\\s+");

            //•	Delete {element} - delete all elements in the array which are equal to the given element
            if (commandLine[0].equals("Delete")){
                int elementToDelete = Integer.parseInt(commandLine[1]);

                for (int i = 0; i < numbersList.size(); i++) {
                    if (numbersList.get(i) == elementToDelete){
                        numbersList.remove(i);
                        i--;
                    }
                }

            }
            //•	Insert {element} {position} - insert element at the given position
            if (commandLine[0].equals("Insert")){
                int elementToInsert = Integer.parseInt(commandLine[1]);
                int insertIndex = Integer.parseInt(commandLine[2]);

                numbersList.add(insertIndex, elementToInsert);
            }
            command = scanner.nextLine();
        }

        for (int num : numbersList){
            System.out.print(num + " ");
        }
    }
}
