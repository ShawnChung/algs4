package org.shawnana.algs4.ch1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by styep on 2016/5/8.
 */
public class BinarySearchTest {
    private final int[] array = new int[] {
            1, 2, 3, 4, 5, 6, 7, 8, 9, 22, 23, 34, 45, 67, 68, 73, 82, 85, 90, 99
    };

    @Before
    public void init() {
    }

    @Test
    public void testSearch() {
        assertEquals(-1, BinarySearch.search(array, 30));
        assertEquals(0, BinarySearch.search(array, 1));
        assertEquals(19, BinarySearch.search(array, 99));
        assertEquals(-1, BinarySearch.search(array, 100));
        assertEquals(-1, BinarySearch.search(array, -1));
    }


}
