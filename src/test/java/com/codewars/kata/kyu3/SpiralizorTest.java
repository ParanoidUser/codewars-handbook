package com.codewars.kata.kyu3;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class SpiralizorTest
{
    @Test
    void sample()
    {
        assertArrayEquals(new int[][] {
                { 1 },
                }, Spiralizor.kata(1));

        assertArrayEquals(new int[][] {
                { 1, 1 },
                { 0, 1 },
                }, Spiralizor.kata(2));

        assertArrayEquals(new int[][] {
                { 1, 1, 1 },
                { 0, 0, 1 },
                { 1, 1, 1 },
                }, Spiralizor.kata(3));

        assertArrayEquals(new int[][] {
                { 1, 1, 1, 1 },
                { 0, 0, 0, 1 },
                { 1, 1, 0, 1 },
                { 1, 1, 1, 1 },
                }, Spiralizor.kata(4));

        assertArrayEquals(new int[][] {
                { 1, 1, 1, 1, 1 },
                { 0, 0, 0, 0, 1 },
                { 1, 1, 1, 0, 1 },
                { 1, 0, 0, 0, 1 },
                { 1, 1, 1, 1, 1 },
                }, Spiralizor.kata(5));

        assertArrayEquals(new int[][] {
                { 1, 1, 1, 1, 1, 1, 1, 1 },
                { 0, 0, 0, 0, 0, 0, 0, 1 },
                { 1, 1, 1, 1, 1, 1, 0, 1 },
                { 1, 0, 0, 0, 0, 1, 0, 1 },
                { 1, 0, 1, 1, 0, 1, 0, 1 },
                { 1, 0, 1, 1, 1, 1, 0, 1 },
                { 1, 0, 0, 0, 0, 0, 0, 1 },
                { 1, 1, 1, 1, 1, 1, 1, 1 },
                }, Spiralizor.kata(8));

        assertArrayEquals(new int[][] {
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
                { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1 },
                { 1, 0, 0, 0, 0, 0, 0, 1, 0, 1 },
                { 1, 0, 1, 1, 1, 1, 0, 1, 0, 1 },
                { 1, 0, 1, 0, 1, 1, 0, 1, 0, 1 },
                { 1, 0, 1, 0, 0, 0, 0, 1, 0, 1 },
                { 1, 0, 1, 1, 1, 1, 1, 1, 0, 1 },
                { 1, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                }, Spiralizor.kata(10));

    }
}
