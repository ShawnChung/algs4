package org.shawnana.algs4.ch1;

/**
 * Created by styep on 2016/5/3.
 */
public class Ex1_1_7 {
    public static void main(String[] args) {
        f1();
        System.out.println();
        f2();
        System.out.println();
        f3();
    }

    public static void f1() {
        double t = 9.0;
        while (Math.abs(t - 9.0/t) > .001)
            t = (9.0 / t + t) / 2.0;
        System.out.printf("%.5f\n", t);
    }

    public  static void f2() {
        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            for (int j = 0; j < i; j++) {
                sum++;
            }
        }
        System.out.println(sum);
    }

    public  static void f3() {
        int sum = 0;
        for (int i = 1; i < 1000; i*=2) {
            for (int j = 0; j < 1000; j++) {
                sum++;
            }
        }
        System.out.println(sum);
    }
}
