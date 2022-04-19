package data_structure.day_6;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RansomNoteTest {

    @ParameterizedTest
    @CsvSource(value = {
            "'a','b','false'",
            "'aa','ab','false'",
            "'aa','abracadabra','true'",
            "'aa','abrcdbr','false'",
            "'aa','aab','true'"
    })
    void canConstruct(String ransomNote, String magazine, boolean expected) {
        assertEquals(expected, new RansomNote().canConstruct(ransomNote, magazine));
    }
}