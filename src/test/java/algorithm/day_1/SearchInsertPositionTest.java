package algorithm.day_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchInsertPositionTest {

    @Test
    void searchInsertTest() {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 10;

        assertEquals(5, new SearchInsertPosition().searchInsert(nums, target));
    }
}