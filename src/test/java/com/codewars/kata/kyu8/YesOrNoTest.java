package com.codewars.kata.kyu8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class YesOrNoTest
{
    @Test
    void sample()
    {
        assertEquals("Yes", YesOrNo.boolToWord(true));
        assertEquals("No", YesOrNo.boolToWord(false));
    }
}
