package com.codewars.kata.kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VolumeOfCuboidTest
{
    @Test
    void sample()
    {
        double delta = 0.0001;
        assertEquals(4, VolumeOfCuboid.kata(1, 2, 2), delta);
        assertEquals(63, VolumeOfCuboid.kata(6.3, 2, 5), delta);
    }
}
