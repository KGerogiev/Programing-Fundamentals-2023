package otherTextProblems;

import java.util.Scanner;

public class P01PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder input = new StringBuilder(scanner.nextLine());

        String command = scanner.nextLine();

        while (!command.equals("Done")){
            String[] data = command.split(" ");
            // •	"TakeOdd"
            if (data[0].equals("TakeOdd")){
                StringBuilder odd = new StringBuilder();
                for (int i = 0; i < input.length(); i++) {
                    if (i % 2 != 0){
                        odd.append(input.toString().toCharArray()[i]);
                    }
                }
                input = odd;
                System.out.println(input);

                //Cut {index} {length}
            } else if (data[0].equals("Cut")){
                int index = Integer.parseInt(data[1]);
                int length = Integer.parseInt(data[2]);
                String substring = input.substring(index, index + length);
                input = input.delete(input.indexOf(substring), input.indexOf(substring) + length);
                System.out.println(input);

                //Substitute {substring} {substitute}
            } else if (data[0].equals("Substitute")){
                String substring = data[1];
                String substitute = data[2];
                if (input.toString().contains(substring)){
                    String text = input.toString().replace(substring, substitute);
                    input = new StringBuilder(text);
                    System.out.println(input);
                } else {
                    System.out.println("Nothing to replace!");
                }
            }


            command = scanner.nextLine();
        }
        System.out.println("Your password is: " + input);
    }
}
