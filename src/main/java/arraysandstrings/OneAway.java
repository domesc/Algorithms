package arraysandstrings;

import java.util.Objects;

/**
 * Given two {@link String} check if they are zero or one edit away.
 * Edit means insert, remove or replace a character
 * Running time: O(n)
 * Created by domesc on 13/02/16.
 */
public class OneAway {

    public boolean check(String a, String b) {
        if (Objects.equals(a, b)) {
            return true;
        }

        if (a.length() == b.length())
            return differOneChar(a, b);

        // remove or insert cases
        //b bigger than a
        if (a.length() == b.length() - 1) {
            return isSubstring(a, b);
        } else if (b.length() == a.length() - 1) {
            return isSubstring(b, a);
        }

        return false;
    }

    /**
     * It is supposing that strings are ordered.
     * Running time: O(max(a,b))
     *
     * @param stringA the smaller string
     * @param stringB the bigger string
     */
    private boolean isSubstring(String stringA, String stringB) {
        int count = 0, i = 0, j = 0;
        while (i<stringB.length() && j< stringA.length()) {
            if (stringA.charAt(j) !=  stringB.charAt(i)) {
                if (count>1) {
                    return false;
                }
                count++;
                i++;
            }
            i++;
            j++;
        }
        return true;
    }

    /**
     * Running time: O(n)
     */
    private boolean differOneChar(String stringA, String stringB) {
        if (stringA.length() != stringB.length())
            return false;

        int count = 0;
        for (int i=0; i<stringA.length();i++) {
            if (count>1) {
                return false;
            }
            if (stringA.charAt(i) != stringB.charAt(i)) {
                count++;
            }
        }
        return true;
    }
}
