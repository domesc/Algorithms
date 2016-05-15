package arraysandstrings;

import java.util.HashMap;
import java.util.Map;

/**
 * Print all the palindromes contained in a word
 * Created by domesc on 09/03/16.
 */
public class PalindromesInString {
    /** Print palindromes in a word without duplicates*/
    public static void printAllPalindromes(String s) {
        Map<String, Integer> map = new HashMap<>();
        for (int radius = 0;radius<s.length();radius++) {
            int i=radius, j=radius, k=radius, z = radius+1;
            while (i>=0 && j<s.length() && s.charAt(i) == s.charAt(j)) {
                String pal = s.substring(i, j+1);
                if (!map.containsKey(pal)) {
                    map.put(pal, 1);
                    System.out.println(pal);
                }
                i--;
                j++;
            }
            while (k>=0 && z<s.length()-1 && s.charAt(k) == s.charAt(z)) {
                String pal = s.substring(k, z+1);
                if (!map.containsKey(pal)) {
                    map.put(pal, 1);
                    System.out.println(pal);
                }
                k--;
                z++;
            }
        }
    }

    public static void main(String[] args) {
        String s = "barbarabar";
        printAllPalindromes(s);
    }
}
