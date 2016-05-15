package arraysandstrings;

/**
 * Replace all spaces with %20 given the true length of the string as input
 *
 * Created by domesc on 13/02/16.
 */
public class URLify {
    /** O(n) without allocating new memory*/
    public char[] replaceFirstVersion(String a, int length) {
        if (a.length() != length) {
            throw  new IllegalArgumentException("Length different");
        }
        char[] array = a.toCharArray();
        int i=0;
        while (i<length) {
            if (array[i] == ' ') {
                array = moveOnePos(array, i);
                array = moveOnePos(array, i);
                array[i] = '%';
                array[i+1] = '2';
                array[i+2] = '0';
                i+=3;
            }
            i++;
        }
        return array;
    }

    private char[] moveOnePos(char[] array, int index) {
        for (int j = array.length-2; j>index; j--) {
            array[j+1] = array[j];
        }
        return array;
    }
}
