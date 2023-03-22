package Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P01ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split(", ");

        List<String> validUsernameList = new ArrayList<>();

        for (int i = 0; i < inputArr.length; i++) {
            String currentUsername = inputArr[i];
            if (currentUsername.length() < 3 || currentUsername.length() > 16) {
                continue;
            }
            if (isValid(currentUsername)) {
                validUsernameList.add(currentUsername);
            }
        }
        for (String username : validUsernameList) {
            System.out.println(username);
        }
    }

    public static boolean isValid(String username) {

        for (int i = 0; i < username.length(); i++) {
            char currentChar = username.charAt(i);
            if (!Character.isLetterOrDigit(currentChar) && currentChar != '_' && currentChar != '-') {
                return false;
            }

        }
        return true;
    }
}
