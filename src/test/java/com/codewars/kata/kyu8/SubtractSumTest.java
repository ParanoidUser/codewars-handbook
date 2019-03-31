package com.codewars.kata.kyu8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SubtractSumTest
{
    @Test
    void sample()
    {
        for (int i = 10; i < 10000; i++)
        {
            assertEquals("apple", SubtractSum.kata(i));
        }
    }
}
