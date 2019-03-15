package com.codewars.kata.kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveExclamationMarksTest
{
    @Test
    void sample()
    {
        assertEquals("Hello World", RemoveExclamationMarks.kata("Hello World!"));
    }
}
