package com.codewars.kata.kyu8;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PixelArtTest
{
    @Test
    void sample()
    {
        assertTrue(PixelArt.kata(4050, 27));
        assertTrue(PixelArt.kata(10000, 20));
        assertTrue(PixelArt.kata(10005, 1));
        assertFalse(PixelArt.kata(4066, 27));
        assertFalse(PixelArt.kata(10005, 2));
    }
}
