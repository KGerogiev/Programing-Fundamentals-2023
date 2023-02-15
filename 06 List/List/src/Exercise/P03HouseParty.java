package Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P03HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> guestList = new ArrayList<>();

        int countCommands = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < countCommands; i++) {
            String[] commandLine = scanner.nextLine().split("\\s+");
            //•	"{name} is going!"
            if (commandLine[2].equals("going!")){
                String name = commandLine[0];
                if (guestList.contains(name)){
                    System.out.println(name + " is already in the list!");
                } else {
                    guestList.add(name);
                }
            }
            //•	"{name} is not going!"

            if (commandLine[2].equals("not")){
                String name = commandLine[0];
                if (guestList.contains(name)){
                    guestList.remove(name);
                } else {
                    System.out.println(name + " is not in the list!");
                }
            }
        }

        for (String name : guestList){
            System.out.println(name);
        }
    }
}
