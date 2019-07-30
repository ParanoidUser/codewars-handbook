package com.codewars.kata.kyu8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DinglemouseTest
{
    @Test
    void sample()
    {
        assertEquals(123, Dinglemouse.INST.plus100(23));
    }
}