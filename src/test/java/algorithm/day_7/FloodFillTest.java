package algorithm.day_7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FloodFillTest {

    @Test
    void floodFillTest() {
        int[][] image = {{0, 0, 0}, {0, 1, 1}};
        int[][] newImage = {{0, 0, 0}, {0, 5, 5}};
/*
        int[][] image = new int[][]{
                {1, 1, 0, 1, 1, 1, 1, 1},
                {0, 1, 0, 1, 0, 0, 1, 0},
                {0, 1, 1, 0, 1, 1, 1, 0},
                {0, 0, 1, 0, 1, 0, 1, 0},
                {1, 1, 1, 0, 1, 0, 0, 0},
                {1, 0, 0, 0, 1, 1, 1, 1},
                {1, 1, 1, 0, 0, 0, 0, 1},
                {0, 0, 1, 1, 1, 1, 1, 1}
                };
        int[][] newImage = new int[][]{
                {2, 2, 0, 2, 2, 2, 2, 2},
                {0, 2, 0, 2, 0, 0, 2, 0},
                {0, 2, 2, 0, 2, 2, 2, 0},
                {0, 0, 2, 0, 2, 0, 2, 0},
                {2, 2, 2, 0, 2, 0, 0, 0},
                {2, 0, 0, 0, 2, 2, 2, 2},
                {2, 2, 2, 0, 0, 0, 0, 2},
                {0, 0, 2, 2, 2, 2, 2, 2}
                };
*/
        assertArrayEquals(newImage, new FloodFill().floodFill(image, 1, 1, 5));
    }
}