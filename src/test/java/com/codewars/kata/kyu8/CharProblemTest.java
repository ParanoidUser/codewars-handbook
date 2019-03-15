package com.codewars.kata.kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CharProblemTest
{
    @Test
    void sample()
    {
        assertEquals(5, CharProblem.kata("5 years old"));
        assertEquals(9, CharProblem.kata("9 years old"));
        assertEquals(1, CharProblem.kata("1 year old"));
    }
}
