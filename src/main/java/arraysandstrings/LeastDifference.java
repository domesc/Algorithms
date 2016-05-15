package arraysandstrings;

import java.util.Arrays;

/**
 * Find the least difference in an array
 * Created by domesc on 06/03/16.
 */
public class LeastDifference {
    public int diff(int[] a) {
        Arrays.sort(a);
        if(a.length > 1) {
            int min = -1;
            for (int i = 1;i<a.length;i++) {
                int tempDiff = Math.abs(a[i] - a[i-1]);
                if (min == -1 || tempDiff < min) {
                    min = tempDiff;
                }
            }
            return min;
        }
        return 0;
    }
}
