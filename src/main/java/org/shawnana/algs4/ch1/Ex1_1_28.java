package org.shawnana.algs4.ch1;

import java.util.Arrays;


/**
 * Created by styep on 2016/5/7.
 */
public class Ex1_1_28 {
    public static void main(String[] args) {
        int[] array = new int[]{
                1, 2, 3, 4, 5, 6, 7, 8, 9, 22, 22, 22, 45, 67, 68, 73, 82, 85, 90, 99
        };
        System.out.println(Arrays.toString(array));
        int target = 22;
        int index = BinarySearch.search(array, target);
        int lowestIndex = index;
        int highestIndex = index;
        for (int i = index - 1; i >= 0; i--) {
            if (array[i] != target) {
                lowestIndex = i + 1;
                break;
            }
        }

        for (int i = index + 1; i < array.length; i++) {
            if (array[i] != target) {
                highestIndex = i - 1;
                break;
            }
        }

        int[] newArray = new int[lowestIndex + (array.length - highestIndex - 1)];
        for (int i = 0; i < lowestIndex; i++) {
            newArray[i] = array[i];
        }

        for (int i = lowestIndex, j = 0; i < newArray.length; i++, j++) {
            newArray[i] = array[highestIndex + 1 + j];
        }

        System.out.println(Arrays.toString(newArray));
    }
}
