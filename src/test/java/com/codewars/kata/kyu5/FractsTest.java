package com.codewars.kata.kyu5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FractsTest
{
    @Test
    void sample()
    {
        assertEquals("(6,12)(4,12)(3,12)", Fracts.kata(new long[][] {
                { 1, 2 },
                { 1, 3 },
                { 1, 4 }
        }));

        assertEquals("(18078,34060)(2262,34060)(25545,34060)", Fracts.kata(new long[][] {
                { 69, 130 },
                { 87, 1310 },
                { 30, 40 }
        }));

        assertEquals("(15,60)(20,60)(15,60)(15,60)(15,60)(12,60)(15,60)(20,60)", Fracts.kata(new long[][] {
                { 11, 44 },
                { 72, 216 },
                { 44, 176 },
                { 20, 80 },
                { 79, 316 },
                { 50, 250 },
                { 47, 188 },
                { 27, 81 }
        }));
    }
}
