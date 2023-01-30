package Exercise;

import java.util.Scanner;

public class P09ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         String[] input = scanner.nextLine().split(" ");
         int[] numbersArr = new int[input.length];
        for (int i = 0; i < numbersArr.length; i++) {
            numbersArr[i] = Integer.parseInt(input[i]);
        }

        String commandLine = scanner.nextLine();

        while (!commandLine.equals("end")){
            String[] command = commandLine.split(" ");

            //swap {index1} {index2}
            if (command[0].equals("swap")){
                int firstPosition = Integer.parseInt(command[1]);
                int secondPosition = Integer.parseInt(command[2]);
                int copyfirstPosition = numbersArr[firstPosition];
                numbersArr[firstPosition] = numbersArr[secondPosition];
                numbersArr[secondPosition] =  copyfirstPosition;
            }

            //multiply {index1} {index2}
            if (command[0].equals("multiply")){
                int firstPosition = Integer.parseInt(command[1]);
                int secondPosition = Integer.parseInt(command[2]);
                numbersArr[firstPosition] = numbersArr[firstPosition] * numbersArr[secondPosition];
            }


            //decrease with 1

            if (command[0].equals("decrease"))
                for (int i = 0; i < numbersArr.length; i++) {
                    numbersArr[i] =  numbersArr[i] - 1;
                }

            commandLine = scanner.nextLine();
        }

        for (int i = 0; i < numbersArr.length; i++) {
            if (i == numbersArr.length - 1){
                System.out.println(numbersArr[numbersArr.length - 1]);
                break;
            }
            System.out.print(numbersArr[i] + ", ");
        }

    }
}
