package otherMapProblems;

import java.util.*;

public class P03PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine()); //борй цветя
        Map<String, Integer> panstsList = new LinkedHashMap<>(); // Списък с цветя и тяхната рядкост
        Map<String, List<Double>> ratingList = new LinkedHashMap<>(); //рейтинга на цветята

        for (int i = 1; i <= n; i++) {
            // получавам инфорация за всяко срещнато цвете във вида: {plant}<->{rarity}
            String currentInfor = scanner.nextLine();
            String plant = currentInfor.split("<->")[0]; // Името на растението
            int rearity = Integer.parseInt(currentInfor.split("<->")[1]); // Рядкост на растението
            // правя проверка, дали съответното разстение се съдържа в списъка

            panstsList.put(plant, rearity);
            ratingList.putIfAbsent(plant, new ArrayList<>());


        }
        String input = scanner.nextLine(); //команди за модифициране на списъка

        while (!input.equals("Exhibition")) {
            String[] data = input.split(": ");
            String command = data[0];
            String[] action = data[1].split(" - ");
            String plant = action[0];

            //проверка, дали името на растението е валидно
            if (!panstsList.containsKey(plant)) {
                System.out.println("error");
                input = scanner.nextLine();
                continue;
            }

            if (command.equals("Rate")) {
                //Rate: {plant} - {rating}

                double rating = Double.parseDouble(action[1]);
                ratingList.get(plant).add(rating);

            } else if (command.equals("Update")) {
                //Update: {plant} - {new_rarity}

                int rerity = Integer.parseInt(action[1]);
                panstsList.put(plant, rerity);

            } else if (command.equals("Reset")) {
                //Reset: {plant}

                ratingList.get(plant).clear();

            } else {
                System.out.println("error");
            }

            input = scanner.nextLine();
        }
        //Plants for the exhibition:
        //- {plant_name1}; Rarity: {rarity}; Rating: {average_rating}

        Map<String, Double> avgRating = new LinkedHashMap<>();

        for (Map.Entry<String, List<Double>> entry : ratingList.entrySet()) {
            String current = entry.getKey();
            double totalValue = 0;
            for (int i = 0; i < entry.getValue().size(); i++) {
                double value = entry.getValue().get(i);
                totalValue += value;
            }
            double avgValue = totalValue / entry.getValue().size();
            if (totalValue != 0) {
                avgRating.put(current, avgValue);
            } else {
                avgRating.put(current, 0.0);
            }
        }

        //Plants for the exhibition:
        //- {plant_name1}; Rarity: {rarity}; Rating: {average_rating}
        System.out.println("Plants for the exhibition:");
        for (Map.Entry<String, Integer> entry : panstsList.entrySet()) {
            String current = entry.getKey();
            System.out.printf("- %s; Rarity: %d; Rating: %.2f%n", current, entry.getValue(), avgRating.get(current));
        }

    }
}
