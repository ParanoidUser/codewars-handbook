package com.codewars.kata.kyu8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TwiceAsOldTest
{
    @Test
    void sample()
    {
        assertEquals(30, TwiceAsOld.kata(30, 0));
        assertEquals(16, TwiceAsOld.kata(30, 7));
        assertEquals(15, TwiceAsOld.kata(45, 30));
    }
}
