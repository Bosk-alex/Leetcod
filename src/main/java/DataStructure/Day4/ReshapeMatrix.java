package DataStructure.Day4;

import java.util.Arrays;

public class ReshapeMatrix {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if (mat.length * mat[0].length == r * c) {
            int[][] reshaped = new int[r][c];
            int reshapedRowIndex = 0;
            int reshapedColIndex = 0;

            for (int[] row : mat) {
                for (int num : row) {
                    reshaped[reshapedRowIndex][reshapedColIndex] = num;
                    if (reshapedColIndex == c - 1) {
                        reshapedColIndex = 0;
                        reshapedRowIndex++;
                    } else {
                        reshapedColIndex++;
                    }
                }
            }
            System.out.println(Arrays.deepToString(reshaped));
            return reshaped;
        } else {
            return mat;
        }
    }
}
