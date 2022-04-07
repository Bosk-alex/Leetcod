package Algorithm.Day1;

import java.util.Arrays;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 10;

        System.out.println(Arrays.toString(nums));
        System.out.println(searchInsert(nums, target));
    }

    public static int searchInsert(int[] nums, int target) {
        int first = 0;
        int last = nums.length - 1;
        int pointer = 0;

        while (first <= last) {
            pointer = (first + last) / 2;
            if (nums[pointer] < target) {
                first = pointer + 1;
            } else if (nums[pointer] > target) {
                last = pointer - 1;
            } else {
                return pointer;
            }
        }

        return nums[pointer] > target ? pointer : pointer + 1;
    }
}
