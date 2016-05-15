package math;

/**
 * Created by domesc on 18/03/16.
 */
public class FactorialZeros {

    public int trailingZeros(int n) {
        int result = 1;
        int fiveCount = 0;
        int twoCount = 0;
        while(n>1) {
            result*=n;
            fiveCount+=factorOfN(n, 5);
            twoCount+=factorOfN(n, 2);
            n--;
        }
        return Math.min(fiveCount, twoCount);
    }
    public int factorial(int n) {
        int result = 1;
        while(n>1) {
            result*=n;
            n--;
        }
        return result;
    }

    private int factorOfN(int factor, int n) {
        int count = 0;
        while (factor%n==0) {
            count++;
            factor/=n;
        }
        return count;
    }
}
