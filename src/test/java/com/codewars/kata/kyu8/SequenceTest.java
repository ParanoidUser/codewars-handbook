package com.codewars.kata.kyu8;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SequenceTest
{
    @Test
    void sample()
    {
        assertArrayEquals(new int[] { 5, 4, 3, 2, 1 }, Sequence.reverse(5));
    }
}
