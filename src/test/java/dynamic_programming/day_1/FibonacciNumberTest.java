package dynamic_programming.day_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciNumberTest {

    @Test
    void fibFirst10Test() {
        int[] sequence = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
        FibonacciNumber fn = new FibonacciNumber();
        for (int i = 0; i < 10; i++) {
            assertEquals(sequence[i], fn.fib(i));
        }
    }
}