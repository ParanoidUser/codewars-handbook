package com.codewars.kata.kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SeatsInTheaterTest
{
    @Test
    void sample()
    {
        assertEquals(96, SeatsInTheater.kata(16, 11, 5, 3));
        assertEquals(0, SeatsInTheater.kata(1, 1, 1, 1));
        assertEquals(18, SeatsInTheater.kata(13, 6, 8, 3));
        assertEquals(99, SeatsInTheater.kata(60, 100, 60, 1));
        assertEquals(0, SeatsInTheater.kata(1000, 1000, 1000, 1000));
    }
}
