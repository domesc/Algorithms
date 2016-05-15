import javafx.util.Pair;
import math.FactorialZeros;
import math.NumberSwapper;
import math.Operations;
import math.Power;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by domesc on 15/05/16.
 */
public class MathTest {

    @Test
    public void powerTest(){
        Power algo = new Power();

        Assert.assertEquals(64, algo.power(2,6));
        Assert.assertEquals(27, algo.power(3,3));
    }

    @Test
    public void primesTest(){
        //TODO
    }

    @Test
    public void factorialZerosTest() {
        FactorialZeros algo = new FactorialZeros();

        Assert.assertTrue(algo.trailingZeros(5) == 1);
        Assert.assertEquals(120, algo.factorial(5));
        Assert.assertTrue(algo.trailingZeros(10) == 2);
        Assert.assertEquals(3628800, algo.factorial(10));
    }

    @Test
    public void swapTest() {
        NumberSwapper algo = new NumberSwapper();

        int x = 5, y=10;
        Pair<Integer, Integer> pair = algo.swap(x, y);
        Assert.assertTrue(pair.getKey()==10);
        Assert.assertTrue(pair.getValue()==5);
    }

    @Test
    public void operationsTest() {
        Operations algo = new Operations();
        Assert.assertTrue(algo.division(4, 3) == 1);
        Assert.assertTrue(algo.division2(4, 3) == 1);
        Assert.assertTrue(algo.multiply(4, 3) == 12);
        Assert.assertTrue(algo.negate(4) == -4);
        Assert.assertTrue(algo.subtract(4, 3) == 1);
    }
}
