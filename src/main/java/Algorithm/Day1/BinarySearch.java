package Algorithm.Day1;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;

        System.out.println(Arrays.toString(nums));
        System.out.println(search(nums, target));
    }

    public static int search(int[] nums, int target) {
        int down = 0;
        int up = nums.length - 1;

        while(down <= up) {
            int pointer = (up + down) / 2;
            if (nums[pointer] < target) {
                down = pointer + 1;
            } else if (nums[pointer] > target) {
                up = pointer - 1;
            } else {
                return pointer;
            }
        }
        return -1;
    }
}