package com.codewars.kata.kyu3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Finder3Test
{
    @Test
    void sample()
    {
        assertEquals(0, Finder3.pathFinder("000\n000\n000"));
        assertEquals(2, Finder3.pathFinder("010\n010\n010"));
        assertEquals(4, Finder3.pathFinder("010\n101\n010"));
        assertEquals(42, Finder3.pathFinder("0707\n7070\n0707\n7070"));
        assertEquals(14, Finder3.pathFinder("700000\n077770\n077770\n077770\n077770\n000007"));
        assertEquals(0, Finder3.pathFinder("777000\n007000\n007000\n007000\n007000\n007777"));
        assertEquals(4, Finder3.pathFinder("000000\n000000\n000000\n000010\n000109\n001010"));
    }
}
