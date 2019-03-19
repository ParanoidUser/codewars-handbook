package com.codewars.kata.kyu8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SheepCounterTest
{
    @Test
    void sample()
    {
        assertEquals(17, SheepCounter.kata(new Boolean[] {
                true, true, true, false,
                true, true, true, true,
                true, false, true, false,
                true, false, false, true,
                true, true, true, true,
                false, false, true, true
        }));
    }
}
