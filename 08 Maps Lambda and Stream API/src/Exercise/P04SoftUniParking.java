package Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P04SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, String> parking = new LinkedHashMap<>();

        for (int i = 1; i <= n ; i++) {
            String[] inputArr = scanner.nextLine().split("\\s+");

            //register {username} {licensePlateNumber}
            if (inputArr[0].equals("register")) {
                String username = inputArr[1];
                String licensePlate = inputArr[2];
                if (parking.containsKey(username)) {
                    String currentPlate = parking.get(username);
                    System.out.printf("ERROR: already registered with plate number %s%n", currentPlate);
                } else {
                    parking.put(username, licensePlate);
                    System.out.printf("%s registered %s successfully%n", username, licensePlate);
                }
            }
            //unregister {username}
            if (inputArr[0].equals("unregister")) {
                String user = inputArr[1];
                if (!parking.containsKey(user)) {
                    System.out.printf("ERROR: user %s not found%n", user);
                } else {
                    parking.remove(user);
                    System.out.printf("%s unregistered successfully%n", user);
                }
            }
        }

        //•	"{username} => {licensePlateNumber}

        parking.entrySet().forEach(e -> System.out.printf("%s => %s%n", e.getKey(), e.getValue()));

    }
}
