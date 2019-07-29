package com.codewars.kata.kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveExclamationMarksTest
{
    @Test
    void sample()
    {
        assertEquals("Hello World", RemoveExclamationMarks.removeExclamationMarks("Hello World!"));
    }
}
