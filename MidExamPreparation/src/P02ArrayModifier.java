import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] commandLine = command.split(" ");

            //•	"swap {index1} {index2}"
            if (commandLine[0].equals("swap")){
                int firstIndex = Integer.parseInt(commandLine[1]);
                int secondIndex = Integer.parseInt(commandLine[2]);
                int firstElement = numbersList.get(firstIndex);
                int secondElement = numbersList.get(secondIndex);

                numbersList.set(firstIndex, secondElement);
                numbersList.set(secondIndex, firstElement);
            }
            //•	"multiply {index1} {index2}"
            if (commandLine[0].equals("multiply")){
                int firstIndex = Integer.parseInt(commandLine[1]);
                int secondIndex = Integer.parseInt(commandLine[2]);
                int firstElement = numbersList.get(firstIndex);
                numbersList.set(firstIndex, (firstElement * numbersList.get(secondIndex)));
            }
            //•	"decrease"
            if (commandLine[0].equals("decrease")) {
                for (int i = 0; i < numbersList.size(); i++) {
                    int currentElement = numbersList.get(i);
                    numbersList.set(i, currentElement - 1);
                }
            }

            command = scanner.nextLine();
        }
       List<String> output = new ArrayList<>();
        for (int i = 0; i < numbersList.size(); i++) {
            output.add(String.valueOf(numbersList.get(i)));
        }
        System.out.println(String.join(", ", output));
    }
}
