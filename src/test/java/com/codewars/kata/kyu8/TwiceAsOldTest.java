package com.codewars.kata.kyu8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TwiceAsOldTest
{
    @Test
    void sample()
    {
        assertEquals(30, TwiceAsOld.TwiceAsOld(30, 0));
        assertEquals(16, TwiceAsOld.TwiceAsOld(30, 7));
        assertEquals(15, TwiceAsOld.TwiceAsOld(45, 30));
    }
}
