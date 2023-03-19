package Exercise;

import java.util.*;

public class P06StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int studentCount = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> studentList = new LinkedHashMap<>();

        for (int i = 1; i <= studentCount; i++) {
            String studentName = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (!studentList.containsKey(studentName)){
                studentList.put(studentName, new ArrayList<>());
                studentList.get(studentName).add(grade);
            } else {
                studentList.get(studentName).add(grade);
            }

        }
        Map<String, Double> finalList = new LinkedHashMap<>();

        for (Map.Entry<String, List<Double>> entry : studentList.entrySet()) {
            double sumGrades = 0;
            for (int i = 0; i < entry.getValue().size(); i++) {
                double currentGrade = entry.getValue().get(i);
                sumGrades += currentGrade;
            }
            double avgGrade = sumGrades / entry.getValue().size();
            if (avgGrade >= 4.5){
                finalList.put(entry.getKey(), avgGrade);
            }
        }
        finalList.entrySet().forEach(e -> System.out.printf("%s -> %.2f%n", e.getKey(), e.getValue()));

    }
}
