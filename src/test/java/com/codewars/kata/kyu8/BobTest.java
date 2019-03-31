package com.codewars.kata.kyu8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BobTest
{
    @Test
    void sample()
    {
        assertEquals(0, Bob.kata(10, 5, 5));
        assertEquals(10, Bob.kata(100, 60, 50));
    }
}
