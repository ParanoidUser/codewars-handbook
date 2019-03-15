package com.codewars.kata.kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MovieTest
{
    @Test
    void sample()
    {
        assertEquals(43, Movie.kata(500, 15, 0.9));
        assertEquals(24, Movie.kata(100, 10, 0.95));
        assertEquals(135, Movie.kata(2500, 20, 0.9));
    }
}
