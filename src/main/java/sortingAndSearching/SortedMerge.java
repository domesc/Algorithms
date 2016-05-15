package sortingAndSearching;

/**
 * Given two sorted arrays A and B merge them in sorted order (A has a large enough buffer at the end to hold B)
 * Created by domesc on 27/02/16.
 */
public class SortedMerge {
    public void merge(int[] A, int[] B) {
        int indexA = A.length - 1;
        int indexB = B.length - 1;

        while (indexB >= 0) {
            A[indexA] = B[indexB];
            indexB --;
            indexA --;
        }

        int index;
        indexA = indexA + 1;
        while (indexA < A.length) {
            index = indexA;
            while (index >= 1) {
                if (A[index-1] > A[index]) {
                    int temp;
                    temp = A[index-1];
                    A[index-1] = A[index];
                    A[index] = temp;
                }
                index--;
            }
            indexA++;
        }
    }
}
