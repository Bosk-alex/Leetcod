package Algorithm.Day3;

import java.util.Arrays;

public class TwoSumII {
    public static void main(String[] args) {
        int[] numbers = new int[30000];
        for (int i = 0; i < numbers.length; i++) {
            if (i < numbers.length - 2) {
                numbers[i] = -1;
            } else {
                numbers[i] = 1;
            }
        }
        int target = 2;

        System.out.println(Arrays.toString(numbers));
        int[] result = twoSum(numbers, target);
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int first = 0;
        int last = numbers.length - 1;

        while (first < last) {
            int sum = numbers[first] + numbers[last];
            if (sum == target) {
                result[0] = first + 1;
                result[1] = last + 1;
                break;
            } else if (sum > target) {
                last--;
            } else {
                first++;
            }
        }
        return result;
    }
}
