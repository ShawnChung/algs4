package org.shawnana.algs4.ch1;

/**
 * Created by styep on 2016/5/3.
 */
public class Ex1_1_6 {
    public static void main(String[] args) {
        int f = 0;
        int g = 1;
        for (int i = 0; i <= 15; i++) {
            System.out.println(f);
            f = f + g;
            g = f - g;
        }
    }
}
