package org.shawnana.algs4.ch1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Ex1_1_9_Test {
	@Test
    public void testToHex() {
        assertEquals("1", Ex1_1_9.toHex(1));
        assertEquals("10", Ex1_1_9.toHex(2));
        assertEquals("11", Ex1_1_9.toHex(3));
        assertEquals("0", Ex1_1_9.toHex(0));
        assertEquals("1001", Ex1_1_9.toHex(9));
    }

    @Test
    public void testToHex1() {
        assertEquals("1", Ex1_1_9.toHex2(1));
        assertEquals("10", Ex1_1_9.toHex2(2));
        assertEquals("11", Ex1_1_9.toHex2(3));
        assertEquals("0", Ex1_1_9.toHex2(0));
        assertEquals("1001", Ex1_1_9.toHex2(9));
    }

}