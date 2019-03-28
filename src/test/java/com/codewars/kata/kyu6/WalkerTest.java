package com.codewars.kata.kyu6;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class WalkerTest
{
    @Test
    void sample()
    {
        assertArrayEquals(new int[] { 15, 135, 49, 18 }, Walker.kata(12, 20, 18, 45, 30, 60));
        assertArrayEquals(new int[] { 12, 133, 18, 44 }, Walker.kata(15,15,19,50,29,55));
        assertArrayEquals(new int[] { 20, 129, 41, 57 }, Walker.kata(14,25,17,41,35,59));
    }
}
