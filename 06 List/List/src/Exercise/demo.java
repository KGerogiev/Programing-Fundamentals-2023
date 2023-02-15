package Exercise;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> nums = new ArrayList<>(Arrays.asList(1, 5, 6, 8, 12, 2, 3));
        int current = nums.get(1);
        nums.set(1, current + 5);

        System.out.println(nums.get(1));

    }
}
