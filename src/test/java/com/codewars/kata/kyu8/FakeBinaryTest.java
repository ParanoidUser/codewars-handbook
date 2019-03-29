package com.codewars.kata.kyu8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FakeBinaryTest
{
    @Test
    void sample()
    {
        assertEquals("0000011111", FakeBinary.fakeBin("0123456789"));
    }
}
