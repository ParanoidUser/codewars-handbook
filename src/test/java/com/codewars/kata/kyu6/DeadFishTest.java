package com.codewars.kata.kyu6;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class DeadFishTest
{
    @Test
    void sample()
    {
        assertArrayEquals(new int[] { 8, 64 }, DeadFish.parse("iiisdoso"));
        assertArrayEquals(new int[] { 8, 64, 3600 }, DeadFish.parse("iiisdosodddddiso"));
    }
}
