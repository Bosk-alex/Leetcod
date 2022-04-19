package data_structure.day_6;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class FirstUniqueCharacterInStringTest {

    @ParameterizedTest
    @CsvSource(value = {
            "'leetcode', '0'",
            "'loveleetcode', '2'",
            "'aabb', '-1'",
    })
    void firstUniqueChar(String s, int expected) {
        assertEquals(expected, new FirstUniqueCharacterInString().firstUniqChar(s));
    }
}