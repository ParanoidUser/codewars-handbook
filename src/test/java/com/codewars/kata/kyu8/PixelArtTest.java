package com.codewars.kata.kyu8;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class PixelArtTest
{
    @Test
    void sample()
    {
        assertTrue(PixelArt.isDivisible(4050, 27));
        assertTrue(PixelArt.isDivisible(10000, 20));
        assertTrue(PixelArt.isDivisible(10005, 1));
        assertFalse(PixelArt.isDivisible(4066, 27));
        assertFalse(PixelArt.isDivisible(10005, 2));
    }
}
