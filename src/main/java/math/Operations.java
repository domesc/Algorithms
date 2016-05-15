package math;

/**
 * Implement multiply, subtract, and divide operations for integers.The results of all of these are integers. Use
 * only the add operator.
 */
public class Operations {

    public Integer multiply(Integer a, Integer b) {
        Integer result = 0;
        for (int i=0; i<Math.abs(b); i++) {
            result+=Math.abs(a);
        }
        if (Integer.signum(a) == Integer.signum(b)) return result;
        else return negate(result);
    }

    public Integer division(Integer a, Integer b) {
        //4/3=1
        if (b.equals(0)) {
            throw new IllegalArgumentException();
        }
        Integer result = 0;
        Integer acc = b;
        while(acc < a) {
            acc+=b;
            result++;
        }
        return result;
    }

    public Integer division2(Integer a, Integer b) {
        Integer result = 0;
        while (a > 0 && a >= b) {
            a = subtract(a, b);
            result++;
        }
        return result;
    }

    public Integer subtract(Integer a, Integer b) {
        //4+(-2)
        return a + negate(b);
    }

    public Integer negate(Integer a) {
        //5
        int flip = a<0?1:-1;
        int result = 0;
        int i = Math.abs(a);
        while (i>0) {
            result+=flip;
            i--;
        }

        return result;
    }

}
