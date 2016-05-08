package org.shawnana.algs4.ch1;

/**
 * Created by styep on 2016/5/5.
 */
public class Ex1_1_22 {
    public static void main(String[] args) {
        int[] array = new int[] {
                1, 2, 3, 4, 5, 6, 7, 8, 9, 22, 23, 34, 45, 67, 68, 73, 82, 85, 90, 99
        };
        int target1 = 99;
        System.out.println(BinarySearch.search(array, target1));
        int target2 = 66;
        System.out.println(BinarySearch.search(array, target2));
    }
}
