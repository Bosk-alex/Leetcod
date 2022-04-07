package Algorithm.Day2;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {-1,-100,3,99};
        int k = 50;

        System.out.println(Arrays.toString(nums));
        rotate(nums, k);
        System.out.println(Arrays.toString(nums));
    }

    public static void rotate(int[] nums, int k) {
        int offset = k % nums.length;
        int[] part = Arrays.copyOfRange(nums, nums.length - offset, nums.length);
        System.arraycopy(nums, 0, nums, offset, nums.length - offset);
        System.arraycopy(part, 0, nums, 0, offset);
    }
}
