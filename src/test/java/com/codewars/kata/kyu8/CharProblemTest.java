package com.codewars.kata.kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CharProblemTest
{
    @Test
    void sample()
    {
        assertEquals(5, CharProblem.howOld("5 years old"));
        assertEquals(9, CharProblem.howOld("9 years old"));
        assertEquals(1, CharProblem.howOld("1 year old"));
    }
}
