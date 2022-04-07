package Algorithm.Day3;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0,4,5,2};

        System.out.println(Arrays.toString(nums));
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroes(int[] nums) {
        int zeroPointer = 0;
        int numPointer = 0;

        while (zeroPointer != nums.length - 1 && numPointer != nums.length - 1) {
            while (zeroPointer < nums.length - 1 && nums[zeroPointer] != 0) {
                zeroPointer++;
                numPointer = zeroPointer;
            }
            while (numPointer < nums.length - 1 && nums[numPointer] == 0) {
                numPointer++;
            }

            if (nums[zeroPointer] == 0 && zeroPointer < numPointer) {
                int temp;
                temp = nums[zeroPointer];
                nums[zeroPointer] = nums[numPointer];
                nums[numPointer] = temp;
            }
        }
    }
}
