package dynamic_programming.day_1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class TribonacciNumberTest {

    @ParameterizedTest
    @CsvSource(value = {
            "'0', '0'",
            "'1', '1'",
            "'2', '1'",
            "'4', '4'",
            "'25', '1389537'"
    })
    void tribonacci4(int number, int result) {
        assertEquals(result, new TribonacciNumber().tribonacci(number));
    }

/*
    @Test
    void tribonacci4() {
        assertEquals(4, new TribonacciNumber().tribonacci(4));
    }
*/
}