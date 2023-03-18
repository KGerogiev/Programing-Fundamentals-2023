package Exercise.P05VehicleCatalogue;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        List<VehicleCatalogue> catalogue = new ArrayList<>();

        while (!command.equals("End")) {
            //"{typeOfVehicle} {model} {color} {horsepower}"
            String[] commandLine = command.split("\\s+");
            String type = commandLine[0];
            String model = commandLine[1];
            String color = commandLine[2];
            int horsepower = Integer.parseInt(commandLine[3]);

            VehicleCatalogue currentVehicle = new VehicleCatalogue(type, model, color, horsepower);
            catalogue.add(currentVehicle);

            command = scanner.nextLine();
        }

        //Type: {typeOfVehicle}
        //Model: {modelOfVehicle}
        //Color: {colorOfVehicle}
        //Horsepower: {horsepowerOfVehicle}

        command = scanner.nextLine();

        while(!command.equals("Close the Catalogue")){

            for (VehicleCatalogue model : catalogue){
                String currentModel = model.getModel();

                if (currentModel.equals(command)){
                    String type = model.getType();
                    if (type.equals("car")){
                        type = "Car";
                    } else {
                        type = "Truck";
                    }

                    String myModel = model.getModel();
                    String color = model.getColor();
                    int hp = model.getHorsepower();

                    System.out.println("Type: " + type);
                    System.out.println("Model: " + myModel);
                    System.out.println("Color: " + color);
                    System.out.println("Horsepower: " + hp);
                }

            }
            command = scanner.nextLine();
        }
        int totalCarHp = 0;
        int countCars = 0;
        int totalTruckHp = 0;
        int countTruck = 0;

        for (int i = 0; i < catalogue.size(); i++) {
            VehicleCatalogue current = catalogue.get(i);

            if (current.getType().equals("car")){
                totalCarHp += current.getHorsepower();
                countCars++;
            } else {
                totalTruckHp += current.getHorsepower();
                countTruck++;
            }
        }
        double avgHpCars = totalCarHp * 1.0 / countCars;
        if (countCars == 0){
            avgHpCars = 0;
        }
        double avgHpTrucks = totalTruckHp * 1.0 / countTruck;
        if (countTruck == 0){
            avgHpTrucks = 0;
        }

        System.out.printf("Cars have average horsepower of: %.2f.%n", avgHpCars);
        System.out.printf("Trucks have average horsepower of: %.2f.%n", avgHpTrucks);

    }
}
