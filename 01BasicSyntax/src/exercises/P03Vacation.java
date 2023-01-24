package basicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPeople = Integer.parseInt(scanner.nextLine());
        String typeGroup = scanner.nextLine();
        String day = scanner.nextLine();

        double priceANight = 0;

        if (day.equals("Friday")) {
            if (typeGroup.equals("Students")) {
                priceANight = 8.45;
            } else if (typeGroup.equals("Business")) {
                priceANight = 10.90;
            } else if (typeGroup.equals("Regular")) {
                priceANight = 15;
            }
        } else if (day.equals("Saturday")){
            if (typeGroup.equals("Students")) {
                priceANight = 9.80;
            } else if (typeGroup.equals("Business")) {
                priceANight = 15.60;
            } else if (typeGroup.equals("Regular")) {
                priceANight = 20;
            }
        } else if (day.equals("Sunday")) {
            if (typeGroup.equals("Students")) {
                priceANight = 10.46;
            } else if (typeGroup.equals("Business")) {
                priceANight = 16;
            } else if (typeGroup.equals("Regular")) {
                priceANight = 22.50;
            }
        }

        double price = countPeople * priceANight;
        double discount = 0;

        //•	Students – if the group is bigger than or equal to 30 people, you should reduce the total price by 15%

        if (typeGroup.equals("Students") && countPeople >= 30){
            discount = price * 0.15;
        }

        //•	Business – if the group is bigger than or equal to 100 people 10 of them can stay for free.

        if (typeGroup.equals("Business") && countPeople >= 100) {
        countPeople = countPeople - 10;
        price = countPeople * priceANight;
        }

        //•	Regular – if the group is bigger than or equal to 10 and less than or equal to 20 reduce the total price by 5%

        if (typeGroup.equals("Regular") && countPeople >= 10 && countPeople <= 20) {
            discount = price * 0.05;
        }

        double totalPrice = price - discount;

        System.out.printf("Total price: %.2f", totalPrice);
    }
}
