package arraysandstrings;


/**
 * Basic string compression using the counts of characters.
 * Example: aaabbbccdddd becomes a3b3c2d4
 * In case the original string is smaller than the compressed one the first should be
 * returned.
 * It's assumed strings has only upper or lower case characters
 *
 * Created by domesc on 13/02/16.
 */
public class StringCompression {

    /**
     * Running time: O(n) since the loop in the ASCII table is considered as constant
     */
    public String compressFirstVersion(String s) {
        //assume ASCII
        int[] table = new int[128];
        char[] string = s.toCharArray();
        for (char c : string) {
            table[c]++;
        }

        // StringBuilder use less memory than using simple String
        StringBuilder builder = new StringBuilder();
        for (int i=1;i<table.length;i++) {
            if (table[i] != 0) {
                builder.append((char)i).append(table[i]);
            }
        }

        String result = builder.toString();
        if (s.length() < result.length())
            return s;

        return result;
    }

    /**
     * Running time O(n) without using additional data structures
     */
    public String compressSecondVersion(String s) {
        StringBuilder builder = new StringBuilder();
        char temp;
        int i = 0, count = 1, j;

        while(i<s.length()-1) {
            temp = s.charAt(i);
            j = i+1;
            // increase count until the letter doesn't change
            while (j<s.length() && s.charAt(j) == temp) {
                count++;
                j++;
            }
            if (count > 0) {
                builder
                    .append(temp)
                    .append(count);
            }
            i = j;
            count = 1;
        }

        String result = builder.toString();
        if (s.length() < result.length())
            return s;

        return result;
    }

    /**
     * Running time O(n) without using additional data structures
     */
    public String compressSecondVersionSimplified(String s) {
        StringBuilder builder = new StringBuilder();
        char temp;
        int i = 0, count = 0, j;

        while(i<s.length()) {
            count++;
            if(i >= s.length() - 1 || s.charAt(i+1) != s.charAt(i)) {
                builder.append(s.charAt(i)).append(count);
                count = 0;
            }
            i++;
        }

        String result = builder.toString();
        if (s.length() < result.length())
            return s;

        return result;
    }
}
