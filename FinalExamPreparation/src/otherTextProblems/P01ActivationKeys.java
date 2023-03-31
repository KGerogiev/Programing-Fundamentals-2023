package otherTextProblems;

import java.util.Scanner;

public class P01ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine(); //съдържа само букви и цифри

        String command = scanner.nextLine();

        while (!command.equals("Generate")){
            // split by ">>>":
            String[] data = command.split(">>>");
            //Contains>>>{substring}
            if (data[0].equals("Contains")){
                String substring = data[1];
                if (input.contains(substring)){
                    System.out.printf("%s contains %s%n", input, substring);
                } else {
                    System.out.printf("Substring not found!%n");
                }
            }
            //Flip>>>Upper/Lower>>>{startIndex}>>>{endIndex}
            if (data[0].equals("Flip")){
                String direction = data[1];
                int startIndex = Integer.parseInt(data[2]);
                int endIndex = Integer.parseInt(data[3]);
                switch (direction){
                    case "Upper":
                        String substring = input.substring(startIndex, endIndex).toUpperCase();
                        StringBuilder sb = new StringBuilder(input);
                        sb = sb.replace(startIndex, endIndex, substring);
                        input = sb.toString();
                        System.out.println(input);
                        break;
                    case "Lower":
                        String substring1 = input.substring(startIndex, endIndex).toLowerCase();
                        StringBuilder sb1 = new StringBuilder(input);
                        sb = sb1.replace(startIndex, endIndex, substring1);
                        input = sb.toString();
                        System.out.println(input);
                        break;
                }
            }
            //Slice>>>{startIndex}>>>{endIndex}
            if (data[0].equals("Slice")){
                int startIndex = Integer.parseInt(data[1]);
                int endIndex = Integer.parseInt(data[2]);
                StringBuilder sb = new StringBuilder(input);
                sb = sb.delete(startIndex, endIndex);
                input = sb.toString();
                System.out.println(input);
            }



            command = scanner.nextLine();
        }

        System.out.println("Your activation key is: " + input);
    }
}
