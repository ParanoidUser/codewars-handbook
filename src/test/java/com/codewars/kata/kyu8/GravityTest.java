package com.codewars.kata.kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GravityTest
{
    @Test
    void sample()
    {
        double delta = 1e-5;
        var arrVal = new double[]{ 1000, 1000, 100 };
        assertEquals(6.67e-12, Gravity.kata(arrVal, new String[]{ "g", "kg", "m" }), delta);
        assertEquals(6.67e-9, Gravity.kata(arrVal, new String[]{ "kg", "kg", "m" }), delta);
        assertEquals(0.0000667, Gravity.kata(arrVal, new String[]{ "kg", "kg", "cm" }), delta);
    }
}
