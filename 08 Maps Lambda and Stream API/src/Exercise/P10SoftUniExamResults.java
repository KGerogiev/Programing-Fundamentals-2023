package Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P10SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> submitionCount = new LinkedHashMap<>();
        Map<String, Integer> pointsCount = new LinkedHashMap<>();

        String command = scanner.nextLine();

        while (!command.equals("exam finished")) {
            // {username}-{language}-{points}
            String[] commandArr = command.split("-");

            //"{username}-banned
            if (commandArr[1].equals("banned")) {
                String user = commandArr[0];
                for (Map.Entry<String, Integer> entry : pointsCount.entrySet()) {
                    if (entry.getKey().equals(user)) {
                        pointsCount.remove(user);
                    }
                }
                command = scanner.nextLine();
                continue;
            }

            String username = commandArr[0];
            String language = commandArr[1];
            int points = Integer.parseInt(commandArr[2]);

            if (!submitionCount.containsKey(language)) {
                submitionCount.put(language, 1);
            } else {
                int currentCount = submitionCount.get(language);
                submitionCount.put(language, currentCount + 1);
            }
            if (!pointsCount.containsKey(username)) {
                pointsCount.put(username, points);
            } else {
                int currentPoints = pointsCount.get(username);
                if (currentPoints <= points) {
                    pointsCount.put(username, points);
                }
            }
            command = scanner.nextLine();
        }
        System.out.println("Results:");
        pointsCount.entrySet().stream().forEach(e -> System.out.printf("%s | %d%n", e.getKey(), e.getValue()));
        System.out.println("Submissions:");
        submitionCount.entrySet().stream().forEach(e -> System.out.printf("%s - %d%n", e.getKey(), e.getValue()));

    }
}

