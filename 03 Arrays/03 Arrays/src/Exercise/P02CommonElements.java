package Exercise;

import java.util.Scanner;

public class P02CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] firstArr = scanner.nextLine().split(" ");
        String[] secondArr = scanner.nextLine().split(" ");

        for (int secondArrIndex = 0; secondArrIndex < secondArr.length; secondArrIndex++) {
            String currentElement = secondArr[secondArrIndex];
            for (int fitstArrIndex = 0; fitstArrIndex < firstArr.length; fitstArrIndex++) {
                if (currentElement.equals(firstArr[fitstArrIndex])){
                    System.out.print(firstArr[fitstArrIndex] + " ");
                    break;
                }
            }
        }
    }
}
