package org.shawnana.algs4.ch1;

/**
 * Created by styep on 2016/5/5.
 */
public class Ex1_1_22 {
    public static void main(String[] args) {
        int[] array = new int[] {
                1, 2, 3, 4, 5, 6, 7, 8, 9, 22, 23, 34, 45, 67, 68, 73, 82, 85, 90, 99
        };
        int target1 = 5;
        System.out.println(BinarySearch(array, target1, 0, array.length - 1, 0));
        int target2 = 66;
        System.out.println(BinarySearch(array, target2, 0, array.length - 1, 0));
    }

    public static int BinarySearch(int array[], int target, int low, int high, int level) {
        int mid = low + (high - low) / 2;
        System.out.println("current level : " + (level + 1) + ", low : " + low + ", mid : " + mid + ", high : " + high) ;
        if (low > high) return -1;
        if (array[mid] < target) return BinarySearch(array, target, mid + 1, high, (level + 1));
        else if (array[mid] > target) return BinarySearch(array, target, low, mid - 1, (level + 1));
        else return mid;
    }
}
