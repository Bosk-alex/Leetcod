package data_structure.day_5;

public class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (target < matrix[0][0]) return false;
        if (target > matrix[matrix.length - 1][matrix[0].length - 1]) return false;

        int rowIndex = getRow(matrix, target);
        if (target < matrix[rowIndex][0]) return false;
        int[] row = matrix[rowIndex];
        return binarySearch(target, row);
    }

    private boolean binarySearch(int target, int[] nums) {
        int down = 0;
        int up = nums.length - 1;

        while(down <= up) {
            int pointer = (up + down) / 2;
            if (nums[pointer] < target) {
                down = pointer + 1;
            } else if (nums[pointer] > target) {
                up = pointer - 1;
            } else {
                return true;
            }
        }
        return false;
    }

    private int getRow(int[][] matrix, int target) {
        int row = 0;
        for (; row < matrix.length; row++) {
            if (target <= matrix[row][matrix[0].length - 1]) {
                break;
            }
        }
        return row;
    }
}
