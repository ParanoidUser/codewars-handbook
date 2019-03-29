package com.codewars.kata.kyu8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TripleTroubleTest
{
    @Test
    void sample()
    {
        assertEquals("ttlheoiscstk", TripleTrouble.kata("this", "test", "lock"));
        assertEquals("abcabc", TripleTrouble.kata("aa", "bb", "cc"));
        assertEquals("Batman", TripleTrouble.kata("Bm", "aa", "tn"));
        assertEquals("LexLuthor", TripleTrouble.kata("LLh", "euo", "xtr"));
    }
}
