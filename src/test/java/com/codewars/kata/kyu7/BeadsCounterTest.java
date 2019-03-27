package com.codewars.kata.kyu7;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BeadsCounterTest
{
    @Test
    void sample()
    {
        assertEquals(0, BeadsCounter.kata(0));
        assertEquals(0, BeadsCounter.kata(1));
        assertEquals(2, BeadsCounter.kata(2));
        assertEquals(4, BeadsCounter.kata(3));
        assertEquals(8, BeadsCounter.kata(5));
    }
}
