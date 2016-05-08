package org.shawnana.algs4.ch1;

/**
 * Created by styep on 2016/5/8.
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] array = new int[] {
                1, 2, 3, 4, 5, 6, 7, 8, 9, 22, 22, 34, 45, 67, 68, 73, 82, 85, 90, 99
        };
        int key = 22;
        System.out.println(rank(array, key));

        System.out.println(rank(array, 2));
        System.out.println(count(array, 22));
        System.out.println(count(array, 1));
        System.out.println(count(array, 99));
    }

    public static int search(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;
        int level = 0;
        return searchWithLevel(array, target, low, high, level);
    }

    private static int searchWithLevel(int[] array, int target, int low, int high, int level) {
        int mid = low + (high - low) / 2;
        //System.out.println("current level : " + (level + 1) + ", low : " + low + ", mid : " + mid + ", high : " + high) ;
        if (low > high) return -1;
        if (array[mid] < target) return searchWithLevel(array, target, mid + 1, high, (level + 1));
        else if (array[mid] > target) return searchWithLevel(array, target, low, mid - 1, (level + 1));
        else return mid;
    }

    public static int rank(int[] array, int key) {
        int index = search(array, key);
        for (int i = index - 1; i >= 0; i--) {
            if (array[i] != key)
                return (i + 1);
        }
        return -1;
    }

    public static int count(int[] array, int target) {
        int index = search(array, target);
        if (index == -1) return 0;

        int lowestIndex = index;
        int highestIndex = index;
        for (int i = index - 1; i >= 0; i--) {
            if (array[i] != target) {
                lowestIndex = i + 1;
                break;
            }
        }

        for (int i = index + 1; i >= 0 && i < array.length; i++) {
            if (array[i] != target) {
                highestIndex = i - 1;
                break;
            }
        }

        return highestIndex - lowestIndex + 1;
    }
}
