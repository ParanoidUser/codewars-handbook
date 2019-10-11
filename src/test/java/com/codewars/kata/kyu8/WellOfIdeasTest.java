package com.codewars.kata.kyu8;

import static org.junit.jupiter.api.Assertions.*;

import com.codewars.kata.kyu8.WellOfIdeas.Kata;
import org.junit.jupiter.api.Test;

class WellOfIdeasTest
{
    @Test
    void sample()
    {
        assertEquals("Fail!", Kata.well(new String[] { "bad", "bad", "bad" }));
        assertEquals("Publish!", Kata.well(new String[] { "good", "bad", "bad", "bad", "bad" }));
        assertEquals("I smell a series!", Kata.well(new String[] { "good", "bad", "bad", "bad", "bad", "good", "bad", "bad", "good" }));
    }
}