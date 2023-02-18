import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> itemsList = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String command = scanner.nextLine();

        while(!command.equals("Craft!")){
            String[] commanLine = command.split(" - ");

            //•	"Collect - {item}" - you should add the given item to your inventory. If the item already exists,
            // you should skip this line.

            if (commanLine[0].equals("Collect")){
                String itemToAdd = commanLine[1];
                if (!itemsList.contains(itemToAdd)){
                    itemsList.add(itemToAdd);
                }
            }

            //•	"Drop - {item}" - you should remove the item from your inventory if it exists.

            if (commanLine[0].equals("Drop")){
                String itemToDrop = commanLine[1];
                if (itemsList.contains(itemToDrop)){
                    itemsList.remove(itemToDrop);
                }
            }

            //•	"Combine Items - {old_item}:{new_item}" - you should check if the old item exists.
            // If so, add the new item after the old one. Otherwise, ignore the command.

            if (commanLine[0].startsWith("Combine")){
                String[] elements = commanLine[1].split(":");
                String oldItem = elements[0];
                String newItem = elements[1];

                if (itemsList.contains(oldItem)){
                    int indexOtOldItem = itemsList.indexOf(oldItem);
                    itemsList.add(indexOtOldItem + 1, newItem);
                }
            }

            //•	"Renew – {item}" – if the given item exists, you should change
            // its position and put it last in your inventory.

            if (commanLine[0].equals("Renew")){
                String itemToRenew = commanLine[1];
                if (itemsList.contains(itemToRenew)){
                    itemsList.remove(itemToRenew);
                    itemsList.add(itemToRenew);
                }
            }
            command = scanner.nextLine();
        }

        System.out.println(String.join(", ", itemsList));
    }
}
