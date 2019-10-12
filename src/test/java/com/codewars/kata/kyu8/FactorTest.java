package com.codewars.kata.kyu8;

import static org.junit.jupiter.api.Assertions.*;
import static com.codewars.kata.kyu8.Factor.Kata;

import org.junit.jupiter.api.Test;

class FactorTest
{
    @Test
    void sample()
    {
        assertTrue(Kata.checkForFactor(10, 2));
        assertTrue(Kata.checkForFactor(63, 7));
        assertTrue(Kata.checkForFactor(2450, 5));
        assertTrue(Kata.checkForFactor(24612, 3));
    }
}