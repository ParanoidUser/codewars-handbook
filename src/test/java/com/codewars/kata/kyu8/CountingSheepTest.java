package com.codewars.kata.kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountingSheepTest
{
    @Test
    void sample()
    {
        assertEquals("1 sheep...", CountingSheep.kata(1));
        assertEquals("1 sheep...2 sheep...", CountingSheep.kata(2));
        assertEquals("1 sheep...2 sheep...3 sheep...", CountingSheep.kata(3));
    }
}
