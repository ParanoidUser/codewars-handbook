package com.codewars.kata.kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayPackingTest
{
    @Test
    void exampleTests()
    {
        assertEquals(21784, ArrayPacking.kata(new int[]{ 24, 85, 0 }));
        assertEquals(2567447, ArrayPacking.kata(new int[]{ 23, 45, 39 }));
        assertEquals(257, ArrayPacking.kata(new int[]{ 1, 1 }));
        assertEquals(0, ArrayPacking.kata(new int[]{ 0 }));
        assertEquals(4294967295L, ArrayPacking.kata(new int[]{ 255, 255, 255, 255 }));
    }
}
