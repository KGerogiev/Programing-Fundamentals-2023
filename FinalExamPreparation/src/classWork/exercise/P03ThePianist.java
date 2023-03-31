package classWork.exercise;

import java.lang.management.ManagementPermission;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P03ThePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine()); // първоначалният брой пиеси, които имам

        Map<String, String> composerList = new LinkedHashMap<>(); // Името на пиесата -> композитора
        Map<String, String> keyList = new LinkedHashMap<>();      // Името на пиесата -> тоналността

        for (int i = 1; i <= number; i++) {
            String nextPiece = scanner.nextLine(); //"{piece}|{composer}|{key}"
            String currentPiece = nextPiece.split("\\|")[0]; // Името на пиесата
            String currentComposer = nextPiece.split("\\|")[1]; // Композитора
            String currentKey = nextPiece.split("\\|")[2]; // Тоналността
                //добавям в списъците
            composerList.put(currentPiece, currentComposer);
            keyList.put(currentPiece, currentKey);
        }

        String command = scanner.nextLine(); // команди за модифициране на първоначалната информация

        while (!command.equals("Stop")) {
            //Add|{piece}|{composer}|{key}
            if (command.contains("Add")) {
                String currentPiece = command.split("\\|")[1]; // пиесата за добавяне
                String currentComposer = command.split("\\|")[2]; // композитор
                String currentKey = command.split("\\|")[3]; // тоналност
                    // добавям в списъците, ако я няма
                if (!composerList.containsKey(currentPiece)) {
                    composerList.put(currentPiece, currentComposer);
                    keyList.put(currentPiece, currentKey);
                    System.out.printf("%s by %s in %s added to the collection!%n", currentPiece, currentComposer, currentKey);
                } else {
                    System.out.printf("%s is already in the collection!%n", currentPiece);
                }
            }
            //Remove|{piece}
            if (command.contains("Remove")){
                String currentPiece = command.split("\\|")[1]; // Името на пиесата, която ще премахна
                if (composerList.containsKey(currentPiece)){
                    composerList.remove(currentPiece);
                    keyList.remove(currentPiece);
                    System.out.printf("Successfully removed %s!%n", currentPiece);
                } else {
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n", currentPiece);
                }
            }
            //ChangeKey|{piece}|{new key}
            if (command.contains("ChangeKey")){
                String currentPiece = command.split("\\|")[1]; // Името на пиесата
                String newKey = command.split("\\|")[2]; // Новата тоналност
                    // Променям данните за тоналността, ако пиесата съществува
                if (composerList.containsKey(currentPiece)){
                    keyList.put(currentPiece, newKey);
                    System.out.printf("Changed the key of %s to %s!%n", currentPiece, newKey);
                } else {
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n", currentPiece);
                }
            }
            command = scanner.nextLine();
        }
        //{Piece} -> Composer: {composer}, Key: {key}

        for (Map.Entry<String, String> entry : composerList.entrySet()) {
            String currentPiece = entry.getKey();
            System.out.printf("%s -> Composer: %s, Key: %s%n", currentPiece, entry.getValue(), keyList.get(currentPiece));
        }


    }
}
