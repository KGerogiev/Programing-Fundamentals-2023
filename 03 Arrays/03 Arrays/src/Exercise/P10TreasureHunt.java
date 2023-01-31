package Exercise;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class P10TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] initialLoot = input.split("\\|"); // наличната плячка

        //until "Yohoho!"

        String income = scanner.nextLine();

        while (!income.equals("Yohoho!")) {
            String[] commandArr = income.split(" ");
            String command = commandArr[0];

            //•	"Loot {item1} {item2}…{itemn}"
                //o	Pick up treasure loot along the way. Insert the items at the beginning of the chest.
                //o	If an item is already contained, don't insert it.
            if (command.equals("Loot")) {
                String[] loots = new String[commandArr.length - 1]; // новата плячка
                for (int i = 0; i < loots.length; i++) {
                    loots[i] = commandArr[i + 1];
                }
                int counter = 0;// броят на повтрарящите се плячки

                for (int i = 0; i < initialLoot.length; i++) {    // съществуващите плячки
                    String currentOldLoot = initialLoot[i];
                    for (int j = 0; j < loots.length; j++) {      // новите плячки
                        String currentNewLoot = loots[j];
                        if (currentOldLoot.equals(loots[j])) {
                            counter++;                           // увеличавам броят на повтарящите се плячки
                            loots[j] = "null";                   //сетвам съответната позиция на "нъл"
                        }
                    }
                }
                String[] current = new String[(initialLoot.length + loots.length) - counter]; //създавам временен масив с комбинирана дължина
                String[] lootsRevert = new String[loots.length];   // създавам масив за обръщане на реда на новите плячки
                for (int i = loots.length - 1; i >= 0; i--) {
                    lootsRevert[i] = loots[loots.length - 1 - i];
                }
                int coutNulls = 0;                                 // добавям "обърнатия" масив във временния, като премахвам позиите "нъл"
                for (int i = 0; i < lootsRevert.length; i++) {
                    if (lootsRevert[i].equals("null")) {
                        coutNulls++;
                        continue;
                    } else {
                        current[i - coutNulls] = lootsRevert[i];
                    }
                }

                for (int i = (loots.length - counter); i < current.length; i++) {  //добавям останалите елементи към временния масив
                    current[i] = initialLoot[i - (loots.length - counter)];
                }
                initialLoot = new String[current.length];           // променям дължината на първоначалния масив, като го дефинирам отново
                for (int i = 0; i < initialLoot.length; i++) {      // добавям елементите от временния масив в основния
                    initialLoot[i] = current[i];
                }
            }

            //•	"Drop {index}"
             //o	Remove the loot at the given position and add it to the end of the treasure chest.\/
             //o	If the index is invalid, skip the command. \/
            if (command.equals("Drop")) {
                int index = Integer.parseInt(commandArr[1]);
                if (index < 0 || index >= initialLoot.length) {
                    income = scanner.nextLine();
                    continue;
                }
                String copyLoot = initialLoot[index];              // запазвам позицията, която ще променям
                for (int i = index; i < initialLoot.length - 1; i++) {
                    initialLoot[i] = initialLoot[i + 1];
                }
                initialLoot[initialLoot.length - 1] = copyLoot;
            }
            //•	"Steal {count}"
                // o	Someone steals the last count loot items. If there are fewer items than the given count, remove as many as there are.
                //o	Print the stolen items separated by ", ":
                //"{item1}, {item2}, {item3} … {itemn}"
            boolean isGet = true;
            if (command.equals("Steal")) {
                int count = Integer.parseInt(commandArr[1]);
                String removedObjects = "";                       // съхранение на премахнатите плячки
                int countRemovedObjects = 0;                      // брой на премахнантите плячки
                if (count >= initialLoot.length) {
                    String removed = String.join(", ", initialLoot);
                    isGet = false;
                    income = scanner.nextLine();
                    System.out.println(removed);
                    for (int i = 0; i < initialLoot.length; i++) {
                        initialLoot[i] = "null";
                    }
                }
                if (count < initialLoot.length) {
                    for (int i = initialLoot.length - 1; i > initialLoot.length - (count + 1); i--) {
                        countRemovedObjects++;
                        removedObjects += initialLoot[i] + " ";
                        initialLoot[i] = "null";
                    }

                    String[] current = new String[initialLoot.length - countRemovedObjects]; // създавам временен масив за съхранение на останлите плячки
                    for (int i = 0; i < current.length; i++) {
                        current[i] = initialLoot[i];
                    }
                    initialLoot = new String[current.length];                 // преобразувам първоначалния масив с нова дължина
                    for (int i = 0; i < initialLoot.length; i++) {
                        initialLoot[i] = current[i];
                    }
                    String[] removed = removedObjects.split(" ");       //създавам масив от премахнатите плячки
                    String[] revertRemoved = new String[removed.length];      //създавам обърнат масив за да ги наредя на обратно

                    for (int i = 0; i < revertRemoved.length; i++) {
                        revertRemoved[i] = removed[revertRemoved.length - 1 - i];
                    }
                    String printRemoved = String.join(", ", revertRemoved);   //оформям данните за принтиране, разделени със запетая
                    System.out.println(printRemoved);
                }

            }
            if (isGet) {                                                   // ако не съм загубил всички съкровища
                income = scanner.nextLine();                               // нова команда
            }
        }

        //In the end calculate the average treasure gain which is the sum of all items length

        int sum = 0;                                                      // сумирам дължините на елемтите в масива
        for (int i = 0; i < initialLoot.length; i++) {
            String currentElement = initialLoot[i];
            sum += currentElement.length();
        }
        boolean isNotEmpty = false;
        for (int i = 0; i < initialLoot.length; i++) {                    //проверявам дали масивът е празен
            if (!initialLoot[i].equals("null")) {
                isNotEmpty = true;
            }
        }

        double tresureGain = 1.0 * sum / initialLoot.length;              // разделям дължините на елементите в масива
                                                                          // на броя на елементите

        if (isNotEmpty) {
            System.out.printf("Average treasure gain: %.2f pirate credits.", tresureGain);
        } else if (!isNotEmpty) {
            System.out.println("Failed treasure hunt.");
        }
    }
}
