package Exercise;

import java.util.*;

public class P08CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, List<String>> companiesList = new LinkedHashMap<>();

        while (!input.equals("End")) {
            //"{companyName} -> {employeeId}
            String[] inputArr = input.split(" -> ");
            String company = inputArr[0];
            String id = inputArr[1];
            if (!companiesList.containsKey(company)) {
                companiesList.put(company, new ArrayList<>());
                companiesList.get(company).add(id);
            } else {
                if (companiesList.get(company).contains(id)) {
                    input = scanner.nextLine();
                    continue;
                } else {
                    companiesList.get(company).add(id);
                }
            }
            input = scanner.nextLine();
        }
        for (Map.Entry<String, List<String>> entry : companiesList.entrySet()) {
            System.out.printf("%s%n", entry.getKey());
            for (int i = 0; i < entry.getValue().size(); i++) {
                System.out.println("-- " + entry.getValue().get(i));
            }
        }

       /* companiesList.entrySet().stream().forEach(e -> {
           System.out.printf("%s%n", e.getKey());
           e.getValue().forEach(c -> System.out.printf("-- %s%n", c));
        }); */
    }
}
