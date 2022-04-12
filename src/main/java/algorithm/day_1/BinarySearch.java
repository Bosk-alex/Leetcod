package algorithm.day_1;

public class BinarySearch {
    public int search(int[] nums, int target) {
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