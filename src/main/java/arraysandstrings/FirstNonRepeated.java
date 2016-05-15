package arraysandstrings;

import java.util.HashMap;
import java.util.Map;

/**
 * Find the first non repeated element in an unsorted array
 * Created by domesc on 08/03/16.
 */
public class FirstNonRepeated {
    public Integer find(Integer[] a) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0;i<a.length;i++) {
            if (map.containsKey(a[i])) {
                return a[i];
            } else {
                map.put(a[i], 1);
            }
        }
        return null;
    }
}
