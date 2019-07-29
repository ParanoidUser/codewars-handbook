package com.codewars.kata.kyu8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PolygonTest
{
    @Test
    void sample()
    {
        assertEquals(5, new Polygon(4, 5).circleDiameter(), 0.001);
        assertEquals(21.728, new Polygon(8, 9).circleDiameter(), 0.001);
        assertEquals(2.309, new Polygon(3, 4).circleDiameter(), 0.001);
    }
}
