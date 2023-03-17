package Exercise.P06OrderByAge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        List<Person> personList = new ArrayList<>();

        while (!command.equals("End")){
            String[] commandLine = command.split("\\s+");

            String name = commandLine[0];
            String id = commandLine[1];
            int age = Integer.parseInt(commandLine[2]);

            Person person = new Person(name, id, age);
            personList.add(person);

            command = scanner.nextLine();
        }

        personList.sort(Comparator.comparing(Person :: getAge));

        for (Person person : personList){
            System.out.printf("%s with ID: %s is %d years old.%n",person.getName(), person.getId(), person.getAge());
        }

    }
}
