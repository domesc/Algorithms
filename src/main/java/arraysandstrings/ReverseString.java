package arraysandstrings;

/**
 * Reverse a string
 * Created by domesc on 08/03/16.
 */
public class ReverseString {
    public String reverseRec(String str) {
        if (str.length() == 0 || str.length() == 1) {
            return str;
        }
        return reverseRec(str.substring(1)) + str.charAt(0);
    }

    public String reverse(String str) {
        int i = str.length() - 1;
        String result = "";
        while (i>=0) {
            result += str.charAt(i);
            i--;
        }
        return result;
    }
}
