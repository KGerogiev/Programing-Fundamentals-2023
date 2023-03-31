package otherTextProblems;

import java.util.Scanner;

public class P01SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String concealdMessage = scanner.nextLine(); //скрито съобщение
        StringBuilder message = new StringBuilder(concealdMessage);

        String command = scanner.nextLine();
        while (!command.equals("Reveal")){
            String[] data = command.split(":\\|:");

            //InsertSpace:|:{index}:
            switch (data[0]){
                case "InsertSpace":
                    message.insert(Integer.parseInt(data[1]), " ");
                    System.out.println(message);
                    break;
            //Reverse:|:{substring}
                case "Reverse":
                    String substring = data[1];
                    if (message.toString().contains(substring)){
                        //String newMessage = message.toString().replaceFirst(substring, "");
                        //message = new StringBuilder(newMessage);
                        int firstIndex = message.indexOf(substring);
                        int lastIndex = firstIndex + substring.length();
                        message = message.delete(firstIndex, lastIndex);
                        String reversed = "";
                        for (int i = substring.length() - 1; i >= 0; i--) {
                            reversed += substring.toCharArray()[i];
                        }
                        message.append(reversed);
                        System.out.println(message);
                    } else {
                        System.out.println("error");
                    }
                    break;
                    //ChangeAll:|:{substring}:|:{replacement}
                case "ChangeAll":
                    String substr = data[1];
                    String replacement = data[2];
                    String messageReplaced = message.toString().replace(substr, replacement);
                    message = new StringBuilder(messageReplaced);
                    System.out.println(message);
                    break;
            }


            command = scanner.nextLine();
        }
        System.out.println("You have a new text message: " + message);
    }
}
