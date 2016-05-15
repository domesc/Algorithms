package math;

import java.util.ArrayList;

/**
 * Created by domesc on 09/03/16.
 */
public class Primes {
    public boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        int sqrt = (int)Math.sqrt(n);
        for (int i=2;i<=sqrt;i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    /** Return all prime numbers up to n*/
    public ArrayList<Integer> findPrimes(Integer n) {
        boolean[] flags = new boolean[n+1];

        initFlags(flags);

        int sqrt = (int)Math.sqrt(n);
        int prime = 2;
        while (prime <= sqrt) {
            crossFlags(flags, prime);
            prime = nextPrime(flags, prime);
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0;i<flags.length;i++) {
            if (flags[i]) {
                list.add(i);
            }
        }

        return list;
    }

    private void initFlags(boolean[] flags) {
        for (int i=0;i<flags.length;i++) {
            flags[i] = true;
        }
    }

    /** Get next prime number (which is the first still flagged as true)*/
    private int nextPrime(boolean[] flags, int prime) {
        for (int i=prime+1;i<flags.length;i++) {
            if (flags[i])
                return i;
        }
        return 0;
    }
    /**
     * Start from prime*prime since we can say that the numbers before have been marked already in
     * the previous
     */
    private void crossFlags(boolean[] flags, int prime) {
        for (int i=prime*prime;i<flags.length;i+=prime) {
            flags[i] = false;
        }
    }
}
