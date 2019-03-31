package com.codewars.kata.kyu8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SmashWordsTest
{
    @Test
    void sample()
    {
        assertEquals("Bilal Djaghout", SmashWords.kata("Bilal", "Djaghout"));
        assertEquals("", SmashWords.kata());
        assertEquals("Bilal", SmashWords.kata("Bilal"));
    }
}
