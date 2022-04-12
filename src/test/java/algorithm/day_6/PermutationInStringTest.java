package algorithm.day_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermutationInStringTest {

    @Test
    void checkInclusionTrueTest() {
        assertTrue(new PermutationInString().checkInclusion("ab", "eidbaooo"));
    }

    @Test
    void checkInclusionFalseTest() {
        assertFalse(new PermutationInString().checkInclusion("ab", "eidboaoo"));
    }
}