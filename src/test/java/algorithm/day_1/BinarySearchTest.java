package algorithm.day_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void searchTest() {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        assertEquals(4, new BinarySearch().search(nums, target));
    }
}