package com.codewars.kata.kyu8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DutyFreeTest
{
    @Test
    void sample()
    {
        assertEquals(166, DutyFree.kata(12, 50, 1000));
        assertEquals(294, DutyFree.kata(17, 10, 500));
        assertEquals(357, DutyFree.kata(24, 35, 3000));
        assertEquals(20, DutyFree.kata(1400, 35, 10000));
        assertEquals(38, DutyFree.kata(700, 26, 7000));
    }
}
