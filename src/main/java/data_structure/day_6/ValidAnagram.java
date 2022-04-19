package data_structure.day_6;

import java.util.Arrays;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        boolean isValid = false;

/*
        if (s.length() == t.length()) {
            Map<Character, Integer> chars = new HashMap<>(26);
            for (char c : s.toCharArray()) {
                if (chars.containsKey(c)) {
                    chars.put(c, chars.get(c) + 1);
                } else {
                    chars.put(c, 1);
                }
            }

            for (char c : t.toCharArray()) {
                isValid = true;
                if (chars.containsKey(c)) {
                    if (chars.get(c) == 1) {
                        chars.remove(c);
                    } else {
                        chars.put(c, chars.get(c) - 1);
                    }
                } else {
                    isValid = false;
                    break;
                }
            }
        }

        return isValid;
*/
        if (s.length() == t.length()) {
            char[] newS = s.toCharArray();
            char[] newT = t.toCharArray();
            Arrays.sort(newS);
            Arrays.sort(newT);
            isValid = Arrays.equals(newS, newT);
        }

        return isValid;
    }
}
