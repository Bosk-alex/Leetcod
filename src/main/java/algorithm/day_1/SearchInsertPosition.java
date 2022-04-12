package algorithm.day_1;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
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
