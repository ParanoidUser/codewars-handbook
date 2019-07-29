package com.codewars.kata.kyu8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class DutyFreeTest
{
    @Test
    void sample()
    {
        assertEquals(166, DutyFree.dutyFree(12, 50, 1000));
        assertEquals(294, DutyFree.dutyFree(17, 10, 500));
        assertEquals(357, DutyFree.dutyFree(24, 35, 3000));
        assertEquals(20, DutyFree.dutyFree(1400, 35, 10000));
        assertEquals(38, DutyFree.dutyFree(700, 26, 7000));
    }
}
