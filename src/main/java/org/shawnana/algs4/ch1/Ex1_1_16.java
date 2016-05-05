package org.shawnana.algs4.ch1;

/**
 * Created by styep on 2016/5/5.
 */
public class Ex1_1_16 {
    public static void main(String[] args) {
        System.out.println("exR1(6) = " + exR1(6));
    }

    public static String exR1(int n) {
        if (n <= 0) return "";
        return exR1(n - 3) + n + exR1(n - 2) + n;
    }

}
