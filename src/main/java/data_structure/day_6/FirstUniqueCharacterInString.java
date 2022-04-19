package data_structure.day_6;

public class FirstUniqueCharacterInString {
    public int firstUniqChar(String s) {
        if (s.length() == 1) return 0;

        int[] alphabet = new int[26];
        for (int stringInd = 0; stringInd < s.length(); stringInd++) {
            int alphabetIndex = s.charAt(stringInd) - 'a';
            if (alphabet[alphabetIndex] == 1) continue;
            if (stringInd == s.length() - 1) return stringInd;
            boolean repeat = false;

            for (int followInd = stringInd + 1; followInd < s.length(); followInd++) {
                if (s.charAt(stringInd) == s.charAt(followInd)) {
                    alphabet[alphabetIndex] = 1;
                    repeat = true;
                    break;
                }
            }

            if (!repeat) return stringInd;
        }

        return -1;
    }
}
