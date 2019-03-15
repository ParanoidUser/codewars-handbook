package com.codewars.kata.kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExclamationMarksEp6Test
{
    @Test
    void sample()
    {
        assertEquals("Hi", ExclamationMarksEp6.kata("Hi!", 1));
        assertEquals("Hi", ExclamationMarksEp6.kata("Hi!", 1));
        assertEquals("Hi", ExclamationMarksEp6.kata("Hi!", 100));
        assertEquals("Hi!!", ExclamationMarksEp6.kata("Hi!!!", 1));
        assertEquals("Hi", ExclamationMarksEp6.kata("Hi!!!", 100));
        assertEquals("Hi", ExclamationMarksEp6.kata("!Hi", 1));
        assertEquals("Hi!", ExclamationMarksEp6.kata("!Hi!", 1));
        assertEquals("Hi", ExclamationMarksEp6.kata("!Hi!", 100));
        assertEquals("!!Hi !!hi!!! !hi", ExclamationMarksEp6.kata("!!!Hi !!hi!!! !hi", 1));
        assertEquals("Hi !!hi!!! !hi", ExclamationMarksEp6.kata("!!!Hi !!hi!!! !hi", 3));
        assertEquals("Hi hi!!! !hi", ExclamationMarksEp6.kata("!!!Hi !!hi!!! !hi", 5));
        assertEquals("Hi hi hi", ExclamationMarksEp6.kata("!!!Hi !!hi!!! !hi", 100));
    }
}
