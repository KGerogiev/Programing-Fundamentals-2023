package DataTypesLab;

import java.util.Scanner;

public class P06CharsToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       String combination = "";

        for (int i = 1; i <=3 ; i++) {

            char nextSymbol = scanner.nextLine().charAt(0);
            combination = combination + nextSymbol;
        }

        System.out.printf("%s", combination);
        }

    }

