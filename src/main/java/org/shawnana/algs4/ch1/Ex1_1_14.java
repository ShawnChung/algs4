package org.shawnana.algs4.ch1;

/**
 * Created by styep on 2016/4/10.
 */
public class Ex1_1_14 {

    public static int log2(int x) {
        int max = 0;
        for (int lg = 1; lg * 2 <= x; max++) {
            lg *= 2;
        }
        return max;
    }

    public static int log(int x) {
        String hex = Integer.toBinaryString(x);
        return hex.length() - 1;
    }
}
