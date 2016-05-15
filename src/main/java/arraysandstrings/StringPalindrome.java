package arraysandstrings;


/**
 * Check if a string is palindrome or not
 * Created by domesc on 08/03/16.
 */
public class StringPalindrome {
    public boolean isPalindrome(String s) {
        int i=0,j=s.length()-1;
        while (i<=j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
