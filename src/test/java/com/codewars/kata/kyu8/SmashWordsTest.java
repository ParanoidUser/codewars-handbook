package com.codewars.kata.kyu8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SmashWordsTest
{
    @Test
    void sample()
    {
        assertEquals("Bilal Djaghout", SmashWords.smash("Bilal", "Djaghout"));
        assertEquals("", SmashWords.smash());
        assertEquals("Bilal", SmashWords.smash("Bilal"));
    }
}
