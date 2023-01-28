package Exercise;

import java.util.Scanner;

public class P04ArrayRotations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int numberRotations = Integer.parseInt(scanner.nextLine());


        String[] array = input.split(" ");

       for (int i = 1; i <= numberRotations; i++) {
           String currentFirst = array[0];
           for (int j = 0; j < array.length - 1; j++) {
               array[j] = array[j + 1];
           }
           array[array.length - 1] = currentFirst;
       }
        for (int i = 0; i <= array.length - 1; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

