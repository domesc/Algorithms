package arraysandstrings;

import java.util.Arrays;

/**
 * Find if an integer array is an arithmetic sequence
 * 1,2,3,4,5,6 .
 */
public class ArithmeticSequence {
    /**
     * Running time O(nlog(n))
     */
    public boolean checkSeqWithSorting(int[] a){
        // sort the array
        if (a.length > 2) {
            Arrays.sort(a);

            int diff = (a[a.length - 1] - a[0]) / (a.length - 1);
            for (int i=1; i<a.length;i++) {
                int tempDiff = a[i] - a[i-1];
                if (tempDiff != diff) {
                    return false;
                }
            }
        }
        return true;

    }
    /**
     * Running time O(n)
     */
    public boolean checkSeqWithoutSorting(int[] a) {
        if (a.length > 2) {
            int max = findMax(a);
            int min = findMin(a);
            int diff = (a[a.length - 1] - a[0]) / (a.length - 1);
            for (int i=1; i<a.length;i++) {
                int tempDiff = a[i] - a[i-1];
                if (tempDiff != diff) {
                    return false;
                }
            }


        }
        return true;
    }

    private int findMax(int[] a) {
        int max = a[0];
        for (int i = 1; i<a.length;i++) {
            if (a[i]>max) {
                max = a[i];
            }
        }
        return max;
    }

    private int findMin(int[] a) {
        int min = a[0];
        for (int i=0;i<a.length;i++) {
            if (a[i]<min) {
                min = a[i];
            }
        }
        return min;

    }
}
