import java.util.*;
import java.util.stream.Collectors;

public class P03Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int sum = 0;

        for (int i = 0; i < numbers.size(); i++) {
            sum = sum + numbers.get(i);
        }

        double averageNum = sum * 1.0 / numbers.size();

        List<Integer> topNumbers = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > averageNum) {
                topNumbers.add(numbers.get(i));
            }
        }
        Collections.sort(topNumbers);
        Collections.reverse(topNumbers);

        if (!topNumbers.isEmpty()) {
            int count = 1;
            for (int num : topNumbers) {
                if (count > 5) {
                    break;
                }
                System.out.print(num + " ");
                count++;
            }
        } else {
            System.out.println("No");
        }
    }
}
