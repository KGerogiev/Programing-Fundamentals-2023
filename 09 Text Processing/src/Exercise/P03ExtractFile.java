package Exercise;

import java.util.Scanner;

public class P03ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String [] inputArr = input.split("\\\\");

       String[] fileAndExtantion = inputArr[inputArr.length - 1].split("\\.");
       String fileName = fileAndExtantion[0];
       String fileExtantion = fileAndExtantion[1];

        /*String fileAndExtraxtion = inputArr[inputArr.length - 1];
        int indexOfDoth = fileAndExtraxtion.indexOf('.');
        String fileName = fileAndExtraxtion.substring(0, indexOfDoth);
        String fileExtantion = fileAndExtraxtion.substring(indexOfDoth + 1, fileAndExtraxtion.length());*/

        System.out.printf("File name: %s%n", fileName);
        System.out.printf("File extension: %s", fileExtantion);
    }
}
