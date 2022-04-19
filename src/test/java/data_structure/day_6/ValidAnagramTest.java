package data_structure.day_6;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ValidAnagramTest {

    @ParameterizedTest
    @CsvSource(value = {
            "'anagram', 'nagaram', 'true'",
            "'rat', 'car', 'false'"
    })
    void isAnagram(String s, String t, boolean expected) {
        assertEquals(expected, new ValidAnagram().isAnagram(s, t));
    }
}