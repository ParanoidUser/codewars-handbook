package com.codewars.kata.kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TotalPointsTest
{
    @Test
    void basicTests()
    {
        assertEquals(30, TotalPoints.kata(new String[]{ "1:0", "2:0", "3:0", "4:0", "2:1", "3:1", "4:1", "3:2", "4:2", "4:3" }));
        assertEquals(10, TotalPoints.kata(new String[]{ "1:1", "2:2", "3:3", "4:4", "2:2", "3:3", "4:4", "3:3", "4:4", "4:4" }));
        assertEquals(0, TotalPoints.kata(new String[]{ "0:1", "0:2", "0:3", "0:4", "1:2", "1:3", "1:4", "2:3", "2:4", "3:4" }));
        assertEquals(15, TotalPoints.kata(new String[]{ "1:0", "2:0", "3:0", "4:0", "2:1", "1:3", "1:4", "2:3", "2:4", "3:4" }));
        assertEquals(12, TotalPoints.kata(new String[]{ "1:0", "2:0", "3:0", "4:4", "2:2", "3:3", "1:4", "2:3", "2:4", "3:4" }));
    }
}
