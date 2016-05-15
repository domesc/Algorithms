package sortingAndSearching;

/**
 * Created by domesc on 19/03/16.
 */
public class BubbleSort {
    public  void sort(int[] a) {
        for (int i=1;i<a.length;i++) {
            int j = i;
            while (a[j] < a[j-1] && j>0) {
                swap(a, j, j-1);
                j--;
            }
        }
    }

    private void swap(int[] a, int first, int second) {
        int temp = a[first];
        a[first] = a[second];
        a[second] = temp;
    }
}
