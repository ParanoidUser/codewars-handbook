package com.codewars.kata.kyu6;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PersistTest
{
    @Test
    void sample()
    {
        assertEquals(3, Persist.kata(39));
        assertEquals(0, Persist.kata(4));
        assertEquals(2, Persist.kata(25));
        assertEquals(4, Persist.kata(999));
    }
}
