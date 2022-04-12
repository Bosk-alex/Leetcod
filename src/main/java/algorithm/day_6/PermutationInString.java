package algorithm.day_6;

public class PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        if (n2 < n1) return false;

        int count = 0;
        int[] dp = new int[26];
        for (int i = 0; i < n1; i++) {
            int j = s1.charAt(i) - 'a';
            if (dp[j] == 0) count++;
            dp[j]++;
        }

        for (int i = 0; i < n2; i++) {
            int j = s2.charAt(i) - 'a';
            if (dp[j] == 1) count--;
            dp[j]--;

            if (i >= n1) {
                j = s2.charAt(i - n1) - 'a';
                if (dp[j] == 0) count++;
                dp[j]++;
            }

            if (count == 0) return true;
        }

        return false;
    }
}
