package com.codewars.kata.kyu8;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

public class FirstNonConsecutiveTest
{
    @Test
    void sample()
    {
        assertEquals(6, FirstNonConsecutive.kata(new int[] { 1, 2, 3, 4, 6, 7, 8 }));
        assertNull(FirstNonConsecutive.kata(new int[] { 1, 2, 3, 4, 5, 6, 7, 8 }));
        assertEquals(6, FirstNonConsecutive.kata(new int[] { 4, 6, 7, 8, 9, 11 }));
        assertEquals(11, FirstNonConsecutive.kata(new int[] { 4, 5, 6, 7, 8, 9, 11 }));
        assertNull(FirstNonConsecutive.kata(new int[] { 31, 32 }));
        assertEquals(0, FirstNonConsecutive.kata(new int[] { -3, -2, 0, 1 }));
        assertEquals(-1, FirstNonConsecutive.kata(new int[] { -5, -4, -3, -1 }));
    }
}
