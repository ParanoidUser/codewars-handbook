package com.codewars.kata.kyu8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RemoveCharsTest
{
    @Test
    void sample()
    {
        assertEquals("loquen", RemoveChars.kata("eloquent"));
        assertEquals("ountr", RemoveChars.kata("country"));
        assertEquals("erso", RemoveChars.kata("person"));
        assertEquals("lac", RemoveChars.kata("place"));
    }
}
