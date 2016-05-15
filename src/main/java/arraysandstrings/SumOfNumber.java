package arraysandstrings;

import java.util.HashMap;

/**
 * Given an integer array find all pairs combinations which sum to a given number. If a given number is used once
 * it must not be used again.
 * Created by domesc on 06/03/16.
 */
public class SumOfNumber {
    public void findSums(int[] a, int sum) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0;i<a.length;i++) {
            if (a[i] > sum || map.containsKey(a[i])) continue;
            if (a[i] <= sum){
                map.put(a[i], sum - a[i]);
            }
        }

        map.forEach((key, value) -> {
            if (map.containsKey(value)){
                System.out.println(key + ", " + value);
            }
        });
    }
}
