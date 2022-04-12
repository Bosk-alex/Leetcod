package data_structure.day_4;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PascalsTriangleTest {

    @Test
    void generateTest() {
        int numRows = 7;
        List<List<Integer>> expected = new PascalsTriangle().generate(numRows);
        assertEquals(List.of(List.of(1),
                List.of(1, 1),
                List.of(1, 2, 1),
                List.of(1, 3, 3, 1),
                List.of(1, 4, 6, 4, 1),
                List.of(1, 5, 10, 10, 5, 1),
                List.of(1, 6, 15, 20, 15, 6, 1)), expected);
    }
}