import arraysandstrings.*;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by domesc on 15/05/16.
 */
public class ArraysAndStringsTest {
    @Test
    public void arithmeticSequenceTest() {
        ArithmeticSequence algo = new ArithmeticSequence();
        int[] a = new int[] {1,2,3,4,5,6,7};
        int[] b = new int[] {3,2,3,5};
        int[] c = new int[] {10,20,30,40,50,60};

        Assert.assertTrue(algo.checkSeqWithSorting(a));
        Assert.assertFalse(algo.checkSeqWithSorting(b));
        Assert.assertTrue(algo.checkSeqWithSorting(c));

        Assert.assertTrue(algo.checkSeqWithoutSorting(a));
        Assert.assertFalse(algo.checkSeqWithoutSorting(b));
        Assert.assertTrue(algo.checkSeqWithoutSorting(c));
    }

    @Test
    public void balancedParenthesisTest() {
        BalancedParenthesis algo = new BalancedParenthesis();
        String a = "{}[]()";
        String b = "{=}";
        Assert.assertTrue(algo.check(a));
        Assert.assertFalse(algo.check(b));
    }

    @Test
    public void checkPermutationTest() {
        CheckPermutation algo = new CheckPermutation();
        String a = "paptron";
        String b = "tpapnor";
        String c = "babla";
        String d = "frofo";
        Assert.assertTrue(algo.checkFirstVersion(a, b));
        Assert.assertFalse(algo.checkFirstVersion(c, d));

        Assert.assertTrue(algo.checkSecondVersion(a, b));
        Assert.assertFalse(algo.checkSecondVersion(c, d));
    }

    @Test
    public void firstNonRepeatedTest(){
        FirstNonRepeated algo = new FirstNonRepeated();
        Integer[] a = new Integer[]{5,8,6,9,3,5,2,2};
        Assert.assertTrue(algo.find(a) == 5);
    }

    @Test
    public void leastDifferenceTest() {
        LeastDifference algo = new LeastDifference();
        int[] a = new int[] {10,20,8,1};

        Assert.assertEquals(2, algo.diff(a));
    }

    @Test
    public void oneAwayTest() {
        OneAway algo = new OneAway();
        Assert.assertTrue(algo.check("pale", "ple"));
        Assert.assertTrue(algo.check("pales", "pale"));
        Assert.assertTrue(algo.check("pale", "bale"));
        Assert.assertFalse(algo.check("pale", "bake"));
    }

    @Test
    public void palindomesInStringTest() {

    }

    @Test
    public void reverseStringTest() {
        ReverseString algo = new ReverseString();
        String a = "ciaoPm";
        Assert.assertEquals("mPoaic", algo.reverseRec(a));
        Assert.assertEquals("mPoaic", algo.reverse(a));
    }

    @Test
    public void stringCompressionTest() {
        StringCompression algo = new StringCompression();

        Assert.assertEquals("a3b3c2d4", algo.compressFirstVersion("aaabbbccdddd"));
        Assert.assertEquals("abc", algo.compressFirstVersion("abc"));

        Assert.assertEquals("a3b3c2d4", algo.compressSecondVersion("aaabbbccdddd"));
        Assert.assertEquals("abc", algo.compressSecondVersion("abc"));

        Assert.assertEquals("a3b3c2d4", algo.compressSecondVersionSimplified("aaabbbccdddd"));
        Assert.assertEquals("abc", algo.compressSecondVersionSimplified("abc"));
    }

    @Test
    public void palindromeTest() {
        StringPalindrome algo = new StringPalindrome();

        String s = "baoab";
        String s2 = "cciaaicc";
        String s3 = "fonzidi";
        Assert.assertTrue(algo.isPalindrome(s));
        Assert.assertTrue(algo.isPalindrome(s2));
        Assert.assertFalse(algo.isPalindrome(s3));
    }

    @Test
    public void sameStringsTest() {
        StringSameChars algo = new StringSameChars();

        String s1 = "gaghhhhiooka";
        String s2 = "ahiookaghghh";
        String s3 = "aaahiookkkgg";
        Assert.assertTrue(algo.sameChars(s1, s2));
        Assert.assertFalse(algo.sameChars(s1, s3));
    }

    @Test
    public void findSumsTest(){
        SumOfNumber algo = new SumOfNumber();
        int[] a = new int[]{6,4,4,4};
        algo.findSums(a, 10);
    }

    @Test
    public void replaceTest() {
        URLify algo = new URLify();

        String a = "Mr John Smith    ";
        String aReplaced = "Mr%20John%20Smith";
        Assert.assertArrayEquals(algo.replaceFirstVersion(a, 17), aReplaced.toCharArray());
    }

    @Test
    public void convertTest() {
        ZigZagArray algo = new ZigZagArray();

        int[] input = new int[] {1,7,3,4,2,6,5}; //1,2,3,4,5,6,7
        int[] expected = new int[] {1,3,2,5,4,7,6};
        Assert.assertArrayEquals(expected, algo.convertWithSorting(input));
        Assert.assertArrayEquals(expected, algo.convertWithoutSorting(input));

        input = new int[] {7,1};
        expected = new int[] {1,7};
        Assert.assertArrayEquals(expected, algo.convertWithSorting(input));
        Assert.assertArrayEquals(expected, algo.convertWithoutSorting(input));

        input = new int[] {1,3,4,2,6,5};
        expected = new int[] {1,3,2,5,4,6};
        Assert.assertArrayEquals(expected, algo.convertWithSorting(input));
        Assert.assertArrayEquals(expected, algo.convertWithoutSorting(input));
    }
}
