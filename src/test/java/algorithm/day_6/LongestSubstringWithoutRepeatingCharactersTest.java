package algorithm.day_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    void lengthOfLongestSubstringTest() {
        String s = "pwwkew";
        assertEquals(3, new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring(s));
    }
}