package classWorks.lab;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P03NeedForSpeedIII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int carsCount = Integer.parseInt(scanner.nextLine()); // броят на колите, които мога да карам

        Map<String, Integer> milirageList = new LinkedHashMap<>(); // порбега на всяка кола
        Map<String, Integer> fuelList = new LinkedHashMap<>();     // налично гориво

        for (int i = 0; i < carsCount; i++) {    //добавям входните данни към двата мапа
            String carData = scanner.nextLine(); //  "{car}|{mileage}|{fuel}"  => Audi A6|38000|62
            String currentCarName = carData.split("\\|")[0]; //марката на колата
            int currentCarMileage = Integer.parseInt(carData.split("\\|")[1]); //първоначален пробег
            int currentCarFuel = Integer.parseInt(carData.split("\\|")[2]);   //първоначално налично гориво
            milirageList.put(currentCarName, currentCarMileage);
            fuelList.put(currentCarName, currentCarFuel);
        }

        String command = scanner.nextLine();  // команда за изпълнение пр.: Drive : {car} : {distance} : {fuel}

        while (!command.equals("Stop")) {

            //Drive : {car} : {distance} : {fuel}
            if (command.contains("Drive")) {
                String car = command.split(" : ")[1];  // марката на колата
                int distance = Integer.parseInt(command.split(" : ")[2]); //дистанцията, която трябва да се премине
                int fuel = Integer.parseInt(command.split(" : ")[3]);  // горивото, което ще бъде необходимо
                int avalableFuel = fuelList.get(car);
                if (avalableFuel < fuel) {  // ако наличното гориво е по - малко от необходимото
                    System.out.println("Not enough fuel to make that ride");
                } else {
                    // увеличавам пробега с дадената дистанция
                    int currentMilage = milirageList.get(car); // досегашният пробег
                    milirageList.put(car, currentMilage + distance);
                    // намалявам наличното гориво
                    fuelList.put(car, avalableFuel - fuel);
                    System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n", car, distance, fuel);
                    if (milirageList.get(car) >= 100000) {
                        System.out.printf("Time to sell the %s!%n", car);
                        milirageList.remove(car);  // премахвам колата, ако е достигнала пробег 100000 км
                        fuelList.remove(car);      // премахвам колата, ако е достигнала пробег 100000 км
                    }
                }
            }
            //Refuel : {car} : {fuel}
            if (command.contains("Refuel")) {
                String car = command.split(" : ")[1]; // марката на колата
                int fuel = Integer.parseInt(command.split(" : ")[2]); // горивото, което ми се подава за зареждане
                int avalableFuel = fuelList.get(car); //налично гориво
                // максималният обем е 75, за това от него вадя наличното и получавам това, което мога да добавя
                int canGetIn = 75 - avalableFuel; // горивото, което мога да сипя
                if (fuel <= canGetIn) {
                    fuelList.put(car, avalableFuel + fuel);
                    System.out.printf("%s refueled with %d liters%n", car, fuel);
                } else {
                    fuelList.put(car, 75);
                    System.out.printf("%s refueled with %d liters%n", car, canGetIn);
                }
            }
            //Revert : {car} : {kilometers}:
            if (command.contains("Revert")) {
                String car = command.split(" : ")[1]; // марката на колата
                int kilometers = Integer.parseInt(command.split(" : ")[2]); //Километрите, с които намалявам пробега
                int currentMilage = milirageList.get(car); // настоящите колометри
                int milageAfterDecreassing = currentMilage - kilometers; // пробег след намаляване
                if (milageAfterDecreassing < 10000) {
                    milirageList.put(car, 10000);
                } else {
                    milirageList.put(car, currentMilage - kilometers);
                    System.out.printf("%s mileage decreased by %d kilometers%n", car, kilometers);
                }
            }
        command = scanner.nextLine();
        }
        //принтирам в следният формат: "{car} -> Mileage: {mileage} kms, Fuel in the tank: {fuel} lt."
        for (Map.Entry<String, Integer> entry : milirageList.entrySet()) {
            String car = entry.getKey();
            System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n", entry.getKey(), entry.getValue(), fuelList.get(car));
        }

    }
}
