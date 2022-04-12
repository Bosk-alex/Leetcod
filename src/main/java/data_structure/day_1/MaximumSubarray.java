package data_structure.day_1;

import java.util.Arrays;

public class MaximumSubarray {
    public static void main(String[] args) {
        int[] nums = {5, 4, -1, 7, 8};

        System.out.println(Arrays.toString(nums));
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int maxCurrentSum = nums[0];
        for (int i = 1; i < nums.length; ++i) {
            maxCurrentSum = Math.max(maxCurrentSum + nums[i], nums[i]);
            maxSum = Math.max(maxSum, maxCurrentSum);
        }
        return maxSum;
/*
        int[] maxSumArray = new int[nums.length];
        maxSumArray[0] = nums[0];
        int result = maxSumArray[0];

        for (int i = 1; i < nums.length; i++) {
            if (maxSumArray[i - 1] > 0) {
                maxSumArray[i] = nums[i] + maxSumArray[i - 1];
            } else {
                maxSumArray[i] = nums[i];
            }
            result = Math.max(maxSumArray[i], result);
        }

        return result;
*/
    }
}
