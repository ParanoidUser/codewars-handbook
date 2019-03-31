package com.codewars.kata.kyu8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class NearestSquareTest
{
    @Test
    void sample()
    {
        assertEquals(1, NearestSquare.kata(1));
        assertEquals(1, NearestSquare.kata(2));
        assertEquals(9, NearestSquare.kata(10));
        assertEquals(121, NearestSquare.kata(111));
        assertEquals(10000, NearestSquare.kata(9999));
    }
}
