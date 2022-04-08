package Algorithm.Day4;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        char[] s = {'H','a','n','n','a','h'};
        System.out.println(Arrays.toString(s));
        reverseString(s);
        System.out.println(Arrays.toString(s));
    }


    public static void reverseString(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            char temp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = temp;
        }
    }
}
