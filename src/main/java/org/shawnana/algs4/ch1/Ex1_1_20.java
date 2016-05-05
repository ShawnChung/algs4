package org.shawnana.algs4.ch1;

/**
 * Created by styep on 2016/5/5.
 */
public class Ex1_1_20 {
    public static void main(String[] args) {
        System.out.println(lnN_(2));
    }

    public static double lnN_(int N) {
        if (N == 1) return Math.log(Double.valueOf(N));
        return lnN_(N - 1) + Math.log(Double.valueOf(N));
    }
}
