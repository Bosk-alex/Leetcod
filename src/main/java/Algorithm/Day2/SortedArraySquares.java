package Algorithm.Day2;

import java.util.Arrays;

public class SortedArraySquares {
    public static void main(String[] args) {
        int[] nums = {-7, -3, 2, 3, 11};

        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }

    public static int[] sortedSquares(int[] nums) {
        int first = 0;
        int last = nums.length - 1;
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (Math.abs(nums[first]) > Math.abs(nums[last])) {
                result[result.length - 1 - i] = nums[first] * nums[first];
                first++;
            } else {
                result[result.length - 1 - i] = nums[last] * nums[last];
                last--;
            }
        }

        return result;
    }
}
