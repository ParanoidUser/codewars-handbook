package com.codewars.kata.kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GravityForceTest
{
    @Test
    void sample()
    {
        double delta = 1e-5;
        var arrVal = new double[] { 1000, 1000, 100 };
        assertEquals(6.67e-12, GravityForce.solution(arrVal, new String[] { "g", "kg", "m" }), delta);
        assertEquals(6.67e-9, GravityForce.solution(arrVal, new String[] { "kg", "kg", "m" }), delta);
        assertEquals(0.0000667, GravityForce.solution(arrVal, new String[] { "kg", "kg", "cm" }), delta);
    }
}
