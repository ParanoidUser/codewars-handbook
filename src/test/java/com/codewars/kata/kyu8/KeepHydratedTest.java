package com.codewars.kata.kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KeepHydratedTest
{
    @Test
    void sample()
    {
        assertEquals(1, KeepHydrated.kata(2));
        assertEquals(0, KeepHydrated.kata(0.97));
        assertEquals(7, KeepHydrated.kata(14.64));
        assertEquals(800, KeepHydrated.kata(1600.20));
        assertEquals(40, KeepHydrated.kata(80));
    }
}
