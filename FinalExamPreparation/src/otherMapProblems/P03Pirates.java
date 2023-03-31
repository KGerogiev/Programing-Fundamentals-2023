package otherMapProblems;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P03Pirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> population = new LinkedHashMap<>();
        Map<String, Integer> gold = new LinkedHashMap<>();

        String input;
        while (!"Sail".equals(input = scanner.nextLine())){
            //Tortuga||345000||1250
            String[] data = input.split("\\|\\|");
            String city = data[0];
            int popul = Integer.parseInt(data[1]);
            int currentgold = Integer.parseInt(data[2]);

            if (!population.containsKey(city)){
                population.put(city, popul);
                gold.put(city, currentgold);
            } else {
                int currentPopulation = population.get(city);
                int currGold = gold.get(city);
                population.put(city, popul + currentPopulation);
                gold.put(city, currentgold + currGold);
            }
        }
        String command = scanner.nextLine();
        while (!command.equals("End")){
            String[] commandLine = command.split("=>");

            //Plunder=>{town}=>{people}=>{gold}
            if (commandLine[0].equals("Plunder")){
                String city = commandLine[1];
                int killedPeople = Integer.parseInt(commandLine[2]);
                int stollenGold = Integer.parseInt(commandLine[3]);
                int alivePeople = population.get(city) - killedPeople;
                int avalableGold = gold.get(city) - stollenGold;
                population.put(city, alivePeople);
                gold.put(city, avalableGold);
                System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n", city, stollenGold, killedPeople);
                if (alivePeople <= 0 || avalableGold <= 0){
                    population.remove(city);
                    gold.remove(city);
                    System.out.printf("%s has been wiped off the map!%n", city);
                }
            }
            //Prosper=>{town}=>{gold}
            if (commandLine[0].equals("Prosper")){
                String city = commandLine[1];
                int currentGold = Integer.parseInt(commandLine[2]);
                if (currentGold < 0){
                    System.out.printf("Gold added cannot be a negative number!%n");
                    command = scanner.nextLine();
                    continue;
                }
                gold.put(city, gold.get(city) + currentGold);
                System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n", currentGold, city, gold.get(city));
            }

            command = scanner.nextLine();
        }

        if (!population.isEmpty()){
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n", population.size());
            for (Map.Entry<String, Integer> entry : population.entrySet()) {
                String town = entry.getKey();
                System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n", town, entry.getValue(), gold.get(town));
            }
        } else{
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        }
    }
}

