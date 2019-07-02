package com.codewars.kata.kyu8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ThirdAngleTest
{
    @Test
    void sample()
    {
        assertEquals(60, ThirdAngle.otherAngle(60, 60));
        assertEquals(123, ThirdAngle.otherAngle(45, 12));
        assertEquals(70, ThirdAngle.otherAngle(50, 60));
    }
}
