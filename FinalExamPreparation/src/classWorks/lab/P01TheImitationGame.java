package classWorks.lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class P01TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String message = scanner.nextLine(); //криптираното съобщение

        String command = scanner.nextLine();  //инструкции за декриптиране

        while (!command.equals("Decode")) {

            if (command.contains("Move")) {
                //Move|{number of letters}
                int numberOfLetters = Integer.parseInt(command.split("\\|")[1]); // броят на буквите, които ще местя
                //  zzHe -> 2 букви -> премествам отзад -> "Hezz"
                String move = message.substring(0, numberOfLetters); // "zz" (букви за местене)
                message = message.replace(move, ""); // замествам буквите в съобщението с нищо
                message = message + move;  //долепям буквите на края на съобщението
            }
            if (command.contains("Insert")){
                //Insert|{index}|{value}
                int indexToIsert = Integer.parseInt(command.split("\\|")[1]); // индексът, на който ще вмъквам => 3
                String valueToInsert = command.split("\\|")[2]; // това, което трябва да вмъкна на индекса => "are"
                StringBuilder current = new StringBuilder(message);
                current.insert(indexToIsert,valueToInsert);
                message = current.toString();
            }
            if (command.contains("ChangeAll")){
                //ChangeAll|{substring}|{replacement} "Hazzo"
                String substring = command.split("\\|")[1];  //частта, която трябва да заместя  "z"
                String replacement = command.split("\\|")[2]; // частта, с която ще замествам   "l"
                message = message.replace(substring, replacement); // "Hazzo" => "Hallo"
            }


            command = scanner.nextLine();
        }
        // Принтирам декриптираното съобщение
        System.out.printf("The decrypted message is: %s", message);

    }

}
