import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPeopleWating = Integer.parseInt(scanner.nextLine());
        List<Integer> wagons = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int currentCountPeople = countPeopleWating;
        boolean seatsAreEnofht = false;
        // максимален брой в кабинка = 4 души

        for (int i = 0; i < wagons.size(); i++) {
            int spaceAvalable = 4 - wagons.get(i);
            if (spaceAvalable <= 0) {
                continue;
            }
            if (currentCountPeople >= spaceAvalable) {
                currentCountPeople = currentCountPeople - spaceAvalable;

                wagons.set(i, spaceAvalable + wagons.get(i));
            } else {
                wagons.set(i, currentCountPeople);
                currentCountPeople = 0;
                seatsAreEnofht = true;
                break;
            }
        }

        if (seatsAreEnofht){
            System.out.println("The lift has empty spots!");
            for (int number : wagons){
                System.out.print(number + " ");
            }
        } else {
            System.out.printf("There isn't enough space! %d people in a queue!%n", currentCountPeople);
            for (int number : wagons){
                System.out.print(number + " ");
            }
        }
    }
}
