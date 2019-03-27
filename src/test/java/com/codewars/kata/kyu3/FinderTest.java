package com.codewars.kata.kyu3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FinderTest
{
    @Test
    void sample()
    {
        assertEquals(0, Finder.kata("000\n000\n000"));
        assertEquals(2, Finder.kata("010\n010\n010"));
        assertEquals(4, Finder.kata("010\n101\n010"));
        assertEquals(42, Finder.kata("0707\n7070\n0707\n7070"));
        assertEquals(14, Finder.kata("700000\n077770\n077770\n077770\n077770\n000007"));
        assertEquals(0, Finder.kata("777000\n007000\n007000\n007000\n007000\n007777"));
        assertEquals(4, Finder.kata("000000\n000000\n000000\n000010\n000109\n001010"));
    }
}
