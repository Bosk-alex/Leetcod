package data_structure.day_6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        boolean canConstruct = false;
        if (ransomNote.length() <= magazine.length()) {
            Map<Character, ArrayList<Integer>> usedChars = new HashMap<>();
            for (int ransomIndex = 0; ransomIndex < ransomNote.length(); ransomIndex++) {
                char ransomChar = ransomNote.charAt(ransomIndex);
                boolean isFound = false;
                int magazineIndex = 0;
                if (usedChars.containsKey(ransomChar)) {
                    List<Integer> indexes = usedChars.get(ransomChar);
                    magazineIndex = indexes.get(indexes.size() - 1) + 1;
                }

                for (; magazineIndex < magazine.length(); magazineIndex++) {
                    if (ransomChar == magazine.charAt(magazineIndex)) {
                        isFound = true;
                        if (usedChars.containsKey(ransomChar)) {
                            usedChars.get(ransomChar).add(magazineIndex);
                        } else {
                            usedChars.put(ransomChar, new ArrayList<>(List.of(magazineIndex)));
                        }
                        break;
                    }
                }

                if (!isFound) break;
                if (ransomIndex == ransomNote.length() - 1) canConstruct = true;
            }
        }
        return canConstruct;
    }
}
