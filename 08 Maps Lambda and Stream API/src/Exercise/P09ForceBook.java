package Exercise;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P09ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        Map<String, ArrayList<String>> teamsList = new LinkedHashMap<>();

        while (!command.equals("Lumpawaroo")) {
            //"{force_side} | {force_user}"
            if (command.contains("|")) {
                String[] inputArr = command.split(" \\| ");
                String side = inputArr[0];
                String player = inputArr[1];
                boolean isNotExisting = true;
                for (Map.Entry<String, ArrayList<String>> entry : teamsList.entrySet()) {
                    for (int i = 0; i < entry.getValue().size(); i++) {
                        if (entry.getValue().contains(player)) {
                            isNotExisting = false;
                        }
                    }
                }
                if (!teamsList.containsKey(side) && isNotExisting) {
                    teamsList.put(side, new ArrayList<>());
                    teamsList.get(side).add(player);
                } else if (teamsList.containsKey(side) && isNotExisting) {
                    teamsList.get(side).add(player);
                }
            }

            //"{force_user} -> {force_side}"
            if (command.contains("->")) {
                String[] commandArr = command.split(" -> ");
                String side = commandArr[1];
                String user = commandArr[0];
                for (Map.Entry<String, ArrayList<String>> entry : teamsList.entrySet()) {
                    for (int i = 0; i < entry.getValue().size(); i++) {
                        if (entry.getValue().get(i).equals(user)) {
                            entry.getValue().remove(i);
                        }
                    }
                }
                if (!teamsList.containsKey(side)) {
                    teamsList.put(side, new ArrayList<>());
                }
                teamsList.get(side).add(user);
                System.out.printf("%s joins the %s side!%n", user, side);

            }
            command = scanner.nextLine();
        }

        for (Map.Entry<String, ArrayList<String>> entry : teamsList.entrySet()) {
            if (entry.getValue().isEmpty()) {
                continue;
            }
            System.out.printf("Side: %s, Members: %d%n", entry.getKey(), entry.getValue().size());
            for (int i = 0; i < entry.getValue().size(); i++) {
                System.out.printf("! %s%n", entry.getValue().get(i));
            }
        }
    }
}
