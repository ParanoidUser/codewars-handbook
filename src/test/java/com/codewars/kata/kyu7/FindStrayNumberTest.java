package com.codewars.kata.kyu7;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FindStrayNumberTest
{
    @Test
    void sample()
    {
        assertEquals(2, FindStrayNumber.stray(new int[] { 1, 1, 2 }));
        assertEquals(3, FindStrayNumber.stray(new int[] { 17, 17, 3, 17, 17, 17, 17 }));
    }
}
