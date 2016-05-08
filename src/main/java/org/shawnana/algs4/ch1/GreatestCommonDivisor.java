package org.shawnana.algs4.ch1;

/**
 * Created by styep on 2016/5/8.
 */
public class GreatestCommonDivisor {
    public static int caculate(int p, int q) {
        if (q == 0) return p;
        return caculate(q, p % q);
    }
}
