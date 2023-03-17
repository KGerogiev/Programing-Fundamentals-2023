package lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P06Students2 {
    static class Student{
        String firstName;
        String lastName;
        String age;
        String town;

        public String getFirstName(){
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getAge(){
            return age;
        }

        public String getTown(){
            return town;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }
        public void setLastName(String lastName){
            this.lastName = lastName;
        }
        public void setAge (String age){
            this.age = age;
        }
        public void setTown(String town){
            this.town = town;
        }

        public Student(String firstName, String lastName, String age, String town){
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

            if (isExisting(firstName, lastName, studentsList)){
                Student currentStudent = existingStudent(firstName, lastName, studentsList);
                currentStudent.setFirstName(firstName);
                currentStudent.setLastName(lastName);
                currentStudent.setAge(age);
                currentStudent.setTown(town);
            } else {
                Student currentStudent = new Student(firstName, lastName, age, town);
                studentsList.add(currentStudent);
            }

            input = scanner.nextLine();
        }

        String town = scanner.nextLine();
        for (Student student : studentsList){
            String studentTown = student.getTown();
            if (studentTown.equals(town)){
                System.out.printf("%s %s is %s years old%n",student.getFirstName(), student.getLastName(), student.getAge());
            }
        }
    }

    public static Student existingStudent(String firstName, String lastName, List<Student> studentList){
        Student existingStudent = null;
        for (Student student : studentList){
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)){
                existingStudent = student;
            }
        }
        return existingStudent;
    }

    public static boolean isExisting(String firsName, String lastName, List<Student> studentList){
        boolean isExisting = false;
       for (Student student : studentList){
           String studentFirstName = student.getFirstName();
           String studentLastName = student.getLastName();
           if (firsName.equals(studentFirstName) && lastName.equals(studentLastName)){
               isExisting = true;
           }
       }
       return isExisting;
    }
}
