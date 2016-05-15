package math;


import javafx.util.Pair;

/**
 * Write a function to swap a number in place (without temporary variables)
 * Created by domesc on 06/03/16.
 */
public class NumberSwapper {

    public Pair<Integer, Integer> swap(Integer x, Integer y) {
        x=x+y;
        y=x-y;
        x=x-y;

        return new Pair<>(x, y);
    }
}
