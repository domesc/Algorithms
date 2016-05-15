package arraysandstrings;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Find out if two strings have the same chars (included the number of times they occured)
 * Created by domesc on 09/03/16.
 */
public class StringSameChars {
    /**
     * Running time: O(n) plus memory for the maps
     */
    public boolean sameChars(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        Map<Character, Integer> map1 = computeOccurrences(s1);
        Map<Character, Integer> map2 = computeOccurrences(s2);

        return Objects.equals(map1, map2);
    }

    /**
     * Running time O(nlog(n)) without additional space
     */
    public boolean sameCharsVersion2(String s1, String s2) {
        return true;
    }

    public Map<Character, Integer> computeOccurrences(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i=0;i<s.length();i++) {
            char character = s.charAt(i);
            if (map.containsKey(character)) {
                map.put(character, map.get(character)+1);
            } else {
                map.put(character, 1);
            }
        }
        return map;
    }
}
