package com.codewars.kata.kyu6;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class TortoiseTest
{
    @Test
    void sample()
    {
        assertArrayEquals(new int[] { 0, 32, 18 }, Tortoise.kata(720, 850, 70));
        assertArrayEquals(new int[] { 3, 21, 49 }, Tortoise.kata(80, 91, 37));
        assertArrayEquals(new int[] { 2, 0, 0 }, Tortoise.kata(80, 100, 40));
    }
}
