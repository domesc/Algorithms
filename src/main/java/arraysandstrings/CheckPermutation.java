package arraysandstrings;

import java.util.Arrays;

/**
 * Check if a string is permutation of the other
 *
 * Created by domesc on 13/02/16.
 */
public class CheckPermutation {

    /** O(nlog(n))*/
    public boolean checkFirstVersion(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }

        char[] arrayA = a.toCharArray();
        char[] arrayB = b.toCharArray();
        Arrays.sort(arrayA);
        Arrays.sort(arrayB);

        for (int i=0; i<arrayA.length; i++) {
            if(arrayA[i] != arrayB[i]) {
                return false;
            }
        }
        return true;
    }

    /** O(n) */
    public boolean checkSecondVersion(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }

        boolean[] chars = new boolean[128];
        for (int i=0; i<a.length();i++) {
            if(!chars[a.charAt(i)]) {
                chars[a.charAt(i)] = true;
            }
        }

        for (int i=0; i<b.length();i++) {
            if (!chars[b.charAt(i)]) {
                return false;
            }
        }

        return true;

    }
}
