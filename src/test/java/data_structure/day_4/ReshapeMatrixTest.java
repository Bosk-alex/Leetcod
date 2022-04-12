package data_structure.day_4;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReshapeMatrixTest {
    static int[][] origin;
    static int[][] expected;
    static int[][] reshaped;
    static int r;
    static int c;

    @BeforeAll
    public static void init() {
        r = 2;
        c = 4;
        origin = new int[][]{{1, 2}, {3, 4}};
        expected = new int[][]{{1, 2}, {3, 4}};
        reshaped = new ReshapeMatrix().matrixReshape(origin, r, c);
    }


    @DisplayName("Matrix not null test")
    @Test
    void matrixReshapeNotNull() {
        assertNotNull(reshaped);
    }

    @DisplayName("Matrix equals test")
    @Test
    void matrixReshapeEquals() {
        for (int i = 0; i < expected.length; i++) {
            assertNotNull(reshaped);
            assertArrayEquals(reshaped[i], expected[i]);
        }
    }
}