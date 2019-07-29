package com.codewars.kata.kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FeastTest
{
    @Test
    void sample()
    {
        assertTrue(Feast.feast("great blue heron", "garlic nann"));
        assertTrue(Feast.feast("chickadee", "chocolate cake"));
        assertFalse(Feast.feast("brown bear", "bear claw"));
    }
}
