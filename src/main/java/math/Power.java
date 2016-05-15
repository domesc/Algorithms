package math;

/**
 * Power function with O(log(n)) running time and O(1) space
 * Created by domesc on 08/03/16.
 */
public class Power {
    // 2^6=2^0*2^6=2^0*2^1*2^5=2^0*2^1*2^2*2^3
    public int power(int base, int exp) {
        if (exp == 0) {
            return 1;
        }
        if (exp == 1) {
            return base;
        }
        boolean odd = exp%2 == 1;
        return power(base, exp/2) * power(base, exp/2) * (odd ? base: 1);
    }
}
