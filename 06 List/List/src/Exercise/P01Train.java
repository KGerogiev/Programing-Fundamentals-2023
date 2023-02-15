package Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int maxCapacity = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();

        while (!command.equals("end")){
            String[] commandLine = command.split("\\s+");

            //•	Add {passengers} - add a wagon to the end with the given number of passengers
            if (commandLine[0].equals("Add")){
                int wagonWithPassengers = Integer.parseInt(commandLine[1]);
                wagons.add(wagonWithPassengers);
            }

            //•	{passengers} -  find an existing wagon to fit all the passengers (starting from the first wagon)
            else {
                int passengersToFit = Integer.parseInt(commandLine[0]);
                for (int i = 0; i < wagons.size(); i++) {
                    int seatsLeft = maxCapacity - wagons.get(i);
                    if (passengersToFit <= seatsLeft){
                        int currentNum = wagons.get(i);
                        wagons.set(i, currentNum + passengersToFit);
                        break;
                    }
                }
            }

            command = scanner.nextLine();
        }
        for (int num : wagons){
            System.out.print(num + " ");
        }
    }
}
