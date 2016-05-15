import dynamicprogramming.LongestSubsequence;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by domesc on 15/05/16.
 */
public class DynamicProgrammingTest {
    @Test
    public void findLongestTest() {
        LongestSubsequence algo = new LongestSubsequence();

        String a = "ABCDGH";
        String b = "AEDFHR";

        Assert.assertTrue(algo.findLongest(a, b) == 3);
    }
}
