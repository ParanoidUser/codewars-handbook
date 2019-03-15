package com.codewars.kata.kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class GreenValleyTest
{
    @Test
    void sample()
    {
        assertArrayEquals(new int[]{ 20, 16, 14, 13, 10, 4, 4, 1, 4, 9, 13, 14, 15, 18 }, GreenValley.kata(new int[]{ 20, 18, 16, 15, 14, 14, 13, 13, 10, 9, 4, 4, 4, 1 }));
        assertArrayEquals(new int[]{ 20, 17, 12, 10, 4, 2, 1, 1, 2, 9, 12, 13, 18 }, GreenValley.kata(new int[]{ 20, 18, 17, 13, 12, 12, 10, 9, 4, 2, 2, 1, 1 }));
        assertArrayEquals(new int[]{ 100, 68, 55, 38, 12, -82, 12, 46, 66, 72 }, GreenValley.kata(new int[]{ 66, 55, 100, 68, 46, -82, 12, 72, 12, 38 }));
        assertArrayEquals(new int[]{ 20, 16, 12, 11, 3, 2, 10, 12, 14, 20 }, GreenValley.kata(new int[]{ 20, 20, 16, 14, 12, 12, 11, 10, 3, 2 }));
        assertArrayEquals(new int[]{ 19, 16, 13, 5, 4, 4, 4, 5, 8, 15, 17 }, GreenValley.kata(new int[]{ 19, 17, 16, 15, 13, 8, 5, 5, 4, 4, 4 }));
        assertArrayEquals(new int[]{ 17, 15, 8, 7, 4, 1, 4, 5, 7, 14, 17 }, GreenValley.kata(new int[]{ 17, 17, 15, 14, 8, 7, 7, 5, 4, 4, 1 }));
        assertArrayEquals(new int[]{ 19, 18, 12, 9, 4, 7, 11, 14, 19 }, GreenValley.kata(new int[]{ 19, 19, 18, 14, 12, 11, 9, 7, 4 }));
        assertArrayEquals(new int[]{ 100, 93, 67, -16, 65, 92, 97 }, GreenValley.kata(new int[]{ 67, 93, 100, -16, 65, 97, 92 }));
        assertArrayEquals(new int[]{ 79, 35, 25, 19, 35, 54 }, GreenValley.kata(new int[]{ 79, 35, 54, 19, 35, 25 }));
        assertArrayEquals(new int[]{ 14, 14, 14, 7, 14, 14 }, GreenValley.kata(new int[]{ 14, 14, 14, 14, 7, 14 }));
        assertArrayEquals(new int[]{ 14, 14, 14, 14, 14 }, GreenValley.kata(new int[]{ 14, 14, 14, 14, 14 }));
        assertArrayEquals(new int[]{ 20, 14, 1, 10, 16 }, GreenValley.kata(new int[]{ 20, 16, 14, 10, 1 }));
        assertArrayEquals(new int[]{ 20, 6, 2, 7 }, GreenValley.kata(new int[]{ 20, 7, 6, 2 }));
        assertArrayEquals(new int[]{ 14, 8, 10 }, GreenValley.kata(new int[]{ 14, 10, 8 }));
        assertArrayEquals(new int[]{ 19, 6, 8 }, GreenValley.kata(new int[]{ 19, 8, 6 }));
    }
}
