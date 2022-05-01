package dynamic_programming.day_1;

public class TribonacciNumber {
    public int tribonacci(int n) {
        int result;
        if (n == 0) {
            result = 0;
        } else if (n == 1 || n == 2) {
            result = 1;
        } else {
            int[] seq = new int[n + 1];
            seq[0] = 0;
            seq[1] = 1;
            seq[2] = 1;

            for (int i = 3; i < n + 1; i++) {
                seq[i] = seq[i - 1] + seq[i - 2] + seq[i - 3];
            }

            result = seq[n];
        }

        return result;
    }
}
