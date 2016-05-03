package org.shawnana.algs4.ch1;

/**
 * Created by styep on 2016/4/10.
 */
public class Ex1_1_9 {
    public static void main(String[] args) {
        System.out.println(toHex(0));
        System.out.println(toHex2(0));
    }

    public static String toHex(int i) {
        String hex = "";
        if (i == 0) {
            return String.valueOf(i);
        }
        while (i > 0) {
            hex = (i % 2) + hex;
            i = i / 2;
        }
        return hex;
    }

    public static String toHex2(int i) {
        String hex = "";
        if (i == 0) {
            return Integer.toString(i);
        }
        for (; i > 0; i /= 2) {
            hex = (i % 2) + hex;
        }
        return hex;
    }
}
