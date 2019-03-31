package com.codewars.kata.kyu8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SidTest
{
    @Test
    void sample()
    {
        assertEquals(9, Sid.kata(1));
        assertEquals(27, Sid.kata(3));
        assertEquals(189, Sid.kata(21));
        assertEquals(207, Sid.kata(23));
        assertEquals(16, Sid.kata(2));
        assertEquals(32, Sid.kata(4));
        assertEquals(176, Sid.kata(22));
        assertEquals(208, Sid.kata(26));
    }
}
