package lab;

import java.util.Scanner;

public class P07TheatrePromotion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine();
        short age = Short.parseShort(scanner.nextLine());
        double priceTicket = 0;

        switch (day){
            case "Weekday":
                if (age >= 0 && age <= 18){
                    priceTicket = 12;
                } else if (age > 18 && age <= 64){
                    priceTicket = 18;
                } else if (age > 64 && age <= 122){
                    priceTicket = 12;
                } else {
                    System.out.printf("Error!%n");
                }
                break;
            case "Weekend":
                if (age >= 0 && age <= 18){
                    priceTicket = 15;
                } else if (age > 18 && age <= 64){
                    priceTicket = 20;
                } else if (age > 64 && age <= 122){
                    priceTicket = 15;
                } else {
                    System.out.printf("Error!%n");
                }
                break;
            case "Holiday":
                if (age >= 0 && age <= 18){
                    priceTicket = 5;
                } else if (age > 18 && age <= 64){
                    priceTicket = 12;
                } else if (age > 64 && age <= 122){
                    priceTicket = 10;
                } else {
                    System.out.printf("Error!%n");
                }
                break;
        }
        if (priceTicket != 0){
            System.out.printf("%.0f$", priceTicket);
        }

    }
}
