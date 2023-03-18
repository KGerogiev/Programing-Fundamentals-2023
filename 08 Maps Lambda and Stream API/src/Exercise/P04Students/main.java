package Exercise.P04Students;

import java.text.spi.CollatorProvider;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countStudents = Integer.parseInt(scanner.nextLine());

        List<Student> studentList = new ArrayList<>();

        for (int count = 1; count <= countStudents; count++) {
            String[] input = scanner.nextLine().split("\\s+");

            String firstName = input[0];
            String lastName = input[1];
            double grade = Double.parseDouble(input[2]);

            Student currentStudent = new Student(firstName, lastName, grade);

            studentList.add(currentStudent);

        }

        studentList.sort(Comparator.comparing(Student::getGrade).reversed());

        for (Student student : studentList){
            System.out.printf("%s %s: %.2f%n", student.firstName,student.lastName, student.grade);
        }

    }
}
