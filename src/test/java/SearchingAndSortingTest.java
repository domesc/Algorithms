import org.junit.Assert;
import org.junit.Test;
import sortingAndSearching.BinarySearch;
import sortingAndSearching.BubbleSort;
import sortingAndSearching.SortedMerge;

/**
 * Created by domesc on 15/05/16.
 */
public class SearchingAndSortingTest {
    @Test
    public void binarySearchTest() {
        BinarySearch algo = new BinarySearch();
        int[] a = new int[] {1,2,3,4,5,6};
        Assert.assertEquals(3, algo.searchRec(a, 0, a.length - 1, 4));
        Assert.assertEquals(-1, algo.searchRec(a, 0, a.length - 1, 20));
        Assert.assertEquals(3, algo.search(a, 4));
        Assert.assertEquals(-1, algo.search(a, 20));

        int[] b = new int[] {2,5,8,9,20,20,30};
        Assert.assertEquals(1, algo.searchRec(b, 0, b.length - 1, 5));
        Assert.assertEquals(-1, algo.searchRec(b, 0, b.length - 1, 1));
        Assert.assertEquals(1, algo.search(b, 5));
        Assert.assertEquals(-1, algo.search(b, 1));
    }

    @Test
    public void bubbleSortTest() {
        BubbleSort algo = new BubbleSort();
        int[] a = new int[]{1,5,4,2,3};
        int[] expected = new int[]{1,2,3,4,5};
        algo.sort(a);
        Assert.assertArrayEquals(expected, a);
    }

    @Test
    public void sortedMergeTest() {
        SortedMerge algo = new SortedMerge();

        int[] A = new int[] {0,4,5,8,9,0,0,0};
        int[] B = new int[] {2,7,10};

        algo.merge(A, B);

        Assert.assertArrayEquals(new int[] {0,2,4,5,7,8,9,10}, A);

        int[] C = new int[]{0, 4, 0, 0, 0};
        int[] D = new int[]{2, 7, 10};

        algo.merge(C, D);

        Assert.assertArrayEquals(new int[] {0,2,4,7,10}, C);
    }
}
