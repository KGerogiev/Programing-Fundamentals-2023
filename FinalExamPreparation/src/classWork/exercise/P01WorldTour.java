package classWork.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine(); // първоначаните спирки
        StringBuilder stops = new StringBuilder(input);

        String command = scanner.nextLine(); // команди за манипулиране на първоначалните спирки

        while (!command.equals("Travel")){

            //•	"Add Stop:{index}:{string}"
            if (command.contains("Add")){

                int index = Integer.parseInt(command.split(":")[1]); // индексът, на който ще добавям
                String text = command.split(":")[2]; // текстът, който ще добавям
                // проверка за валидност на индекса
                if (index >= 0 && index <= stops.length() - 1) {  // индексът е валиден
                    stops.insert(index, text);
                }
                System.out.println(stops);
            }
            //•	"Remove Stop:{start_index}:{end_index}"
            if (command.contains("Remove")){
                int startIndex = Integer.parseInt(command.split(":")[1]); // индексът, от който ще запоне премахването
                int endIndex = Integer.parseInt(command.split(":")[2]);   // индексът, на който ще завърши премахването
                // проверка, дали двата индекса са валидни
                if (startIndex >= 0 && startIndex <= endIndex && endIndex <= stops.length() - 1){  // валидни индекси
                    stops.delete(startIndex, endIndex + 1);
                }
                System.out.println(stops);
            }
            //•	"Switch:{old_string}:{new_string}":
            if (command.contains("Switch")){
                String oldString = command.split(":")[1]; // текст, който трябва да се премахне
                String newString = command.split(":")[2]; // текст, с който трябва да заместя премахнатия
                String current = stops.toString(); // преобразувам билдъра в стринг
                if (current.contains(oldString)){  // проверка, дали се съдържа
                    current = current.replace(oldString, newString);
                }
                stops = new StringBuilder(current); // преобразувам стринга в билдър
                System.out.println(stops);
            }
            command = scanner.nextLine();
        }
        System.out.printf("Ready for world tour! Planned stops: %s%n", stops);
    }
}
