package lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P05Students {

    static class Student{
        String firstName;
        String lastName;
        String age;
        String town;

        public String getTown(){
            return town;
        }
        public String getFirstName(){
            return firstName;
        }
        public String getLastName(){
            return lastName;
        }
        public String getAge(){
            return age;
        }

        public Student (String firstName, String lastName, String age, String town){
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.town = town;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Student> studentsList = new ArrayList<>();

        while (!input.equals("end")){

            String[] studentArr = input.split(" ");
            String firstName = studentArr[0];
            String lastName = studentArr[1];
            String age = studentArr[2];
            String town = studentArr[3];

            Student currentStudent = new Student(firstName, lastName, age, town);
            studentsList.add(currentStudent);

            input = scanner.nextLine();
        }

        String city = scanner.nextLine();

        for (Student student : studentsList){
            String currentStudentTown = student.getTown();
            if (currentStudentTown.equals(city)){
                String currentFirstName = student.getFirstName();
                String currentLastName = student.getLastName();
                String currentAge = student.getAge();
                System.out.printf("%s %s is %s years old%n", currentFirstName, currentLastName, currentAge);
            }
        }
    }
}
