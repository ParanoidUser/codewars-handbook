package com.codewars.kata.kyu8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CubeTest
{
    @Test
    void sample()
    {
        Cube c = new Cube();
        c.setSide(3);
        assertEquals(3, c.getSide());
    }
}
