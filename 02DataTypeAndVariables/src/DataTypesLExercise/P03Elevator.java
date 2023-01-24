package DataTypesLExercise;

import java.util.Scanner;

public class P03Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberPeople = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());
        int countCourses = 0;

//        while (numberPeople > 0){
//            if (numberPeople < capacity){
//                countCourses++;
//                break;
//            }
//            numberPeople = numberPeople - capacity;
//            countCourses++;
//        }

        countCourses = numberPeople / capacity;
        if (numberPeople % capacity != 0){
            countCourses++;
        }

        System.out.println(countCourses);
    }
}
