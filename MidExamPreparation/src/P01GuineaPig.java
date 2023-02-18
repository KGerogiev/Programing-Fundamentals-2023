import java.util.Scanner;

public class P01GuineaPig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double foodInKg = Double.parseDouble(scanner.nextLine());
        double haysInKg = Double.parseDouble(scanner.nextLine());
        double coverInKg = Double.parseDouble(scanner.nextLine());
        double pigWheightInKg = Double.parseDouble(scanner.nextLine());

        double foodInGrams = foodInKg * 1000;
        double hausInGrams = haysInKg * 1000;
        double coverInGrams = coverInKg * 1000;
        double pigInGrams = pigWheightInKg * 1000;

        int countDays = 0;

        boolean isEnough = true;

        while(countDays < 30){
            countDays++;

            double dailyFood = 300;
            foodInGrams = foodInGrams - dailyFood;

            if (countDays % 2 == 0){
                hausInGrams = hausInGrams - (0.05 * foodInGrams);
            }
            if (countDays % 3 == 0){
                coverInGrams = coverInGrams - (pigInGrams / 3);
            }

            if (foodInGrams <= 0 || hausInGrams <= 0 || coverInGrams <= 0){
                isEnough = false;
                break;
            }

        }
        if (isEnough){
            System.out.printf("Everything is fine! Puppy is happy! " +
                               "Food: %.2f, Hay: %.2f, Cover: %.2f.%n", foodInGrams / 1000, hausInGrams / 1000, coverInGrams / 1000);
        } else {
            System.out.printf("Merry must go to the pet store!");
        }
    }
}
