package Exercise.P03OpinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<Person> personList = new ArrayList<>();

        for (int i = 1; i <= n ; i++) {
            String currentPerson = scanner.nextLine();
            String name = currentPerson.split("\\s+")[0];
            int age = Integer.parseInt(currentPerson.split("\\s+")[1]);

            if (age > 30){
                Person person = new Person(name, age);
                personList.add(person);
            }
        }

        for (Person person : personList){
            System.out.printf("%s - %d%n", person.getName(), person.getAge());
        }
    }
}
