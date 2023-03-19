package Exercise;

import java.util.*;

public class P05Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        Map<String, List<String>> coursesList = new LinkedHashMap<>();

        while (!command.equals("end")){
            //"{courseName} : {studentName}
            String[] inputArr = command.split(" : ");
            String currentCourse = inputArr[0];
            String currentStudent = inputArr[1];
            if (!coursesList.containsKey(currentCourse)){
                coursesList.put(currentCourse, new ArrayList<>());
                coursesList.get(currentCourse).add(currentStudent);
            } else {
                coursesList.get(currentCourse).add(currentStudent);
            }

            command = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : coursesList.entrySet()) {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue().size());
            for (int i = 0; i < entry.getValue().size(); i++) {
                System.out.printf("-- %s%n", entry.getValue().get(i));
            }
        }

    }
}
