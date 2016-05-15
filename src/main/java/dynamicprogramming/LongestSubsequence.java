package dynamicprogramming;

/**
 * Given two sequences, find the length of longest subsequence present in both of them.
 * A subsequence is a sequence that appears in the same relative order, but not necessarily contiguous.
 * For example, “abc”, “abg”, “bdf”, “aeg”, ‘”acefg”, .. etc are subsequences of “abcdefg”.
 * So a string of length n has 2^n different possible subsequences.
 */
public class LongestSubsequence {
    public int findLongest(String a, String b) {
        if (a.length() == 0 || b.length() == 0) {
            return 0;
        }
        if (a.charAt(a.length()-1) == b.charAt(b.length()-1)) {
            return 1 + findLongest(a.substring(0, a.length()-1), b.substring(0, b.length()-1));
        }

        return Math.max(
            findLongest(a.substring(0, a.length()-1), b),
            findLongest(a, b.substring(0, b.length()-1)));
    }
}
