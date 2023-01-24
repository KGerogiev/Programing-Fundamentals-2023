package basicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P10PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double startMoney = Double.parseDouble(scanner.nextLine());
        int countStudents = Integer.parseInt(scanner.nextLine());
        double saberPrice = Double.parseDouble(scanner.nextLine()); // за един меч
        double robePrice = Double.parseDouble(scanner.nextLine()); // за едно въже
        double beltPrice = Double.parseDouble(scanner.nextLine()); //за един колан

        //The equipment for the Padawan contains lightsabers, belts, and robes.

        double allSaberPrice = ((countStudents * 1.0) * 0.1 + countStudents)  ;
        double finalSaberPrice = Math.ceil(allSaberPrice) * saberPrice;
        double allRobesPrice = countStudents * robePrice;
        int freeBelts = countStudents / 6;
        int neededBelts = countStudents - freeBelts;
        double allBeltsPrice = neededBelts * beltPrice;


        double finalPrice = finalSaberPrice + allRobesPrice + allBeltsPrice;

        if (finalPrice <= startMoney){
            System.out.printf("The money is enough - it would cost %.2flv.%n", finalPrice);
        } else {
            System.out.printf("George Lucas will need %.2flv more.%n", finalPrice - startMoney);
        }

    }
}
