package com.codewars.kata.kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShapeAreaTest
{
    @Test
    void sample()
    {
        assertEquals(1, ShapeArea.kata(1));
        assertEquals(5, ShapeArea.kata(2));
        assertEquals(13, ShapeArea.kata(3));
        assertEquals(25, ShapeArea.kata(4));
        assertEquals(41, ShapeArea.kata(5));
    }
}
