package com.codewars.kata.kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FeastTest
{
    @Test
    void fixedTest()
    {
        assertTrue(Feast.kata("great blue heron", "garlic nann"));
        assertTrue(Feast.kata("chickadee", "chocolate cake"));
        assertFalse(Feast.kata("brown bear", "bear claw"));
    }
}
