package com.codewars.kata.kyu8;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class PipeFixTest
{
    @Test
    void sample()
    {
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }, PipeFix.pipeFix(new int[] { 1, 2, 3, 5, 6, 8, 9 }));
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 }, PipeFix.pipeFix(new int[] { 1, 2, 3, 12 }));
        assertArrayEquals(new int[] { 6, 7, 8, 9 }, PipeFix.pipeFix(new int[] { 6, 9 }));
        assertArrayEquals(new int[] { -1, 0, 1, 2, 3, 4 }, PipeFix.pipeFix(new int[] { -1, 4 }));
        assertArrayEquals(new int[] { 1, 2, 3 }, PipeFix.pipeFix(new int[] { 1, 2, 3 }));
    }
}
