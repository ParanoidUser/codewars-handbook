package com.codewars.kata.kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BrokenSequenceTest
{
    @Test
    void sample()
    {
        assertEquals(4, BrokenSequence.kata("1 2 3 5"));
        assertEquals(2, BrokenSequence.kata("1 3"));
        assertEquals(0, BrokenSequence.kata(""));
        assertEquals(1, BrokenSequence.kata("2 1 4 3 a"));
    }
}
