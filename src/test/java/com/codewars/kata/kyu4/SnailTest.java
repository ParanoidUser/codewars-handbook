package com.codewars.kata.kyu4;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class SnailTest
{
    @Test
    void sample()
    {
        assertArrayEquals(new int[] {  }, Snail.kata(new int[][] { {} }));

        assertArrayEquals(new int[] { 1, 2, 3, 6, 9, 8, 7, 4, 5 }, Snail.kata(new int[][] {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        }));

        assertArrayEquals(new int[] { 1, 2, 3, 1, 4, 7, 7, 9, 8, 7, 7, 4, 5, 6, 9, 8 }, Snail.kata(new int[][] {
                { 1, 2, 3, 1 },
                { 4, 5, 6, 4 },
                { 7, 8, 9, 7 },
                { 7, 8, 9, 7 }
        }));
    }
}
