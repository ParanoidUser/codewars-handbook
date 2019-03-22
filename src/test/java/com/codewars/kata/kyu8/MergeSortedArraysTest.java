package com.codewars.kata.kyu8;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class MergeSortedArraysTest
{
    @Test
    void sample()
    {
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 6 }, MergeSortedArrays.kata(new int[] { 1, 3, 5 }, new int[] { 2, 4, 6 }));
        assertArrayEquals(new int[] { 2, 4, 6, 8 }, MergeSortedArrays.kata(new int[] { 2, 4, 8 }, new int[] { 2, 4, 6 }));
    }
}
