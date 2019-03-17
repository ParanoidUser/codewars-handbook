package com.codewars.kata.kyu7;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EasyWallpaperTest
{
    @Test
    void sample()
    {
        assertEquals("zero", EasyWallpaper.kata(0, 3.5, 3));
        assertEquals("zero", EasyWallpaper.kata(4, 0, 3));
        assertEquals("zero", EasyWallpaper.kata(4, 3.5, 0));
        assertEquals("ten", EasyWallpaper.kata(4, 3.5, 3));
        assertEquals("sixteen", EasyWallpaper.kata(6.3, 4.5, 3.29));
        assertEquals("seventeen", EasyWallpaper.kata(6.3, 5.8, 3.13));
    }
}
