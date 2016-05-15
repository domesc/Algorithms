package sortingAndSearching;

/**
 * Search
 * Created by domesc on 08/03/16.
 */
public class BinarySearch {
    /** [1,2,3,4]*/
    public int searchRec(int[] a, int start, int end, int toSearch) {
        if (start > end) {
            return -1;
        } else {
            int mid = (start + end)/2;
            if (a[mid] == toSearch) {
                return mid;
            } else if (toSearch < a[mid]) {
                return searchRec(a, start, mid -1, toSearch);
            } else {
                return searchRec(a, mid+1, end, toSearch);
            }
        }

    }

    public int search(int[] a, int toSearch) {
        int start = 0, end = a.length - 1;
        while (start <= end) {
            int mid = (start+end)/2;
            if (a[mid] == toSearch) {
                return mid;
            } else if (toSearch < a[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }
}
