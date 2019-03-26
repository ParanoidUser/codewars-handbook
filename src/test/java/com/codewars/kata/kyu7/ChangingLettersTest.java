package com.codewars.kata.kyu7;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ChangingLettersTest
{
    @Test
    void sample()
    {
        assertEquals("HEllOWOrld!", ChangingLetters.kata("HelloWorld!"));
        assertEquals("SUndAy", ChangingLetters.kata("Sunday"));
    }
}
