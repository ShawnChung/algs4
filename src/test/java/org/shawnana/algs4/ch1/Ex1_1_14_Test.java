package org.shawnana.algs4.ch1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.shawnana.algs4.ch1.Ex1_1_14.log;
import static org.shawnana.algs4.ch1.Ex1_1_14.log2;

/*** Created by styep on 2016/4/28.
 */
public class Ex1_1_14_Test {
    @Test
    public void testLog2() {
        assertEquals(10, log2(1024));
        assertEquals(9, log2(1023));
        assertEquals(0, log2(1));

        System.out.println(log(1024)); // 10
        System.out.println(log(1023)); // 9
        System.out.println(log(1)); // 0
    }

    @Test
    public void testLog() {
        assertEquals(10, log(1024));
        assertEquals(9, log(1023));
        assertEquals(0, log(1));
    }
}
