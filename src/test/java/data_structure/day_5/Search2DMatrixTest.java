package data_structure.day_5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Search2DMatrixTest {

    @ParameterizedTest
//    @CsvSource(value = {"1"})
    @CsvSource(value = {"1", "3", "5", "7", "10", "11", "16", "20", "23", "30", "34", "60"})
    void searchMatrixTrue(int target) {
//        int[][] matrix = {{1}};
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        assertTrue(new Search2DMatrix().searchMatrix(matrix, target));
    }

    @ParameterizedTest
    @CsvSource(value = {"0", "2", "4", "6", "8", "12", "15", "21", "25", "33", "50", "100"})
    void searchMatrixFalse(int target) {
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        assertFalse(new Search2DMatrix().searchMatrix(matrix, target));
    }
}