package com.codewars.kata.kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MostFrequentItemTest
{
    @Test
    void tests()
    {
        assertEquals(0, MostFrequentItem.kata(new int[]{}));
        assertEquals(2, MostFrequentItem.kata(new int[]{ 3, -1, -1 }));
        assertEquals(5, MostFrequentItem.kata(new int[]{ 3, -1, -1, -1, 2, 3, -1, 3, -1, 2, 4, 9, 3 }));
    }
}
