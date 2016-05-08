package org.shawnana.algs4.ch1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by styep on 2016/5/8.
 */
public class GreatestCommonDivisorTest {
    @Test
    public void testCaculate() {
        assertEquals(1, GreatestCommonDivisor.caculate(7, 9));
        assertEquals(3, GreatestCommonDivisor.caculate(12, 9));
        assertEquals(9, GreatestCommonDivisor.caculate(27, 9));
    }
}
