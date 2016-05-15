package arraysandstrings;

import java.util.Arrays;

/**
 * Given an array of distinct elements, rearrange the elements of array in zig-zag fashion.
 * The converted array should be in form a < b > c < d > e < f.
 */
public class ZigZagArray {

    /**
     * Running Time: O(nlog(n))
     */
    public int[] convertWithSorting(int[] a) {
        if (a.length == 1) {
            return a;
        }
        Arrays.sort(a);

        for (int i = 1;i<a.length-1;i+=2) {
            int temp = a[i];
            a[i] = a[i+1];
            a[i+1] = temp;
        }

        return a;
    }

    public int[] convertWithoutSorting(int[] a) {
        if (a.length == 1) {
            return a;
        }

        //1,7,3,4,2,5,6,8 --> 1,3,2,4,6,5,7
        for (int i = 1;i<a.length-1;i+=2) {
            int temp;
            if (a[i] < a[i-1]) {
                temp = a[i];
                a[i] = a[i-1];
                a[i-1] = temp;
            } else if (a[i] < a[i+1]) {
                temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
            }
        }

        return a;
    }
}
