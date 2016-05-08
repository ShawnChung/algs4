package org.shawnana.algs4.ch1;

/**
 * Created by styep on 2016/5/7.
 */
public class Ex1_1_27 {
    public static int i = 0;
    public static void main(String[] args) {
        System.out.println(binomial(20, 8, 0.25));
        System.out.println(old_binomial(20, 8, 0.25));
    }

    public static double binomial(int N, int k, double p) {
        double[][] cache = new double[N+1][k+1];
        for (int i = 0; i < N + 1; i++)
            for (int j = 0; j < k + 1; j++)
                cache[i][j] = Double.NaN;

        for (int i = 0; i < N + 1; i++)
            for (int j = 0; j < k + 1; j++)
                binomial(cache, i, j, p);

        /*for (int j = 0; j < k + 1; j++)
            binomial(cache, 0, j, p);*/

        return cache[N][k];
    }

    public static double binomial(double[][] cache, int N, int k, double p) {
        if (N == 0 && k == 0) return 1.0;
        if (N < 0 || k < 0) return 0.0;
        if (!Double.isNaN(cache[N][k])) {
            //System.out.println(cache[N][k]);
            return cache[N][k];
        } else {
            double result = (1.0 - p) * binomial(cache, N - 1, k, p) + p * binomial(cache, N - 1, k - 1, p);
            cache[N][k] = result;
            return result;
        }
    }

    public static double old_binomial(int N, int k, double p) {
        if (N == 0 && k == 0) return 1.0;
        if (N < 0 || k < 0) return 0.0;
        return  (1.0 - p) * old_binomial(N - 1, k, p) + p * old_binomial(N - 1, k - 1, p);
    }
}
