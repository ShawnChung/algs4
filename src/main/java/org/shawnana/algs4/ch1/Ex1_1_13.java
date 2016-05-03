package org.shawnana.algs4.ch1;

import java.util.Arrays;

/**
 * Created by styep on 2016/4/10.
 */
public class Ex1_1_13 {
    public static void main(String[] args) {
        int m = 4, n = 3;
        int[][] a = {{1, 2, 3}, {3, 2, 1} , {4, 6, 8}, {3, 1, 9}};
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }

        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }

    }
}
