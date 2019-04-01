package com.codewars.kata.kyu8;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class DinglemouseTest
{
    @Test
    void sample()
    {
        assertArrayEquals(new int[] { 1, 15, 15 }, Dinglemouse.kata(1));
        assertArrayEquals(new int[] { 2, 24, 24 }, Dinglemouse.kata(2));
        assertArrayEquals(new int[] { 10, 56, 64 }, Dinglemouse.kata(10));
    }
}
