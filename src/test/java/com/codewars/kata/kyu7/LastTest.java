package com.codewars.kata.kyu7;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LastTest
{
    @Test
    void sample()
    {
        assertEquals(5, Last.kata(new Integer[]{ 1, 2, 3, 4, 5 }));
        assertEquals(5, Last.kata(List.of(1, 2, 3, 4, 5)));
        assertEquals(5, Last.kata(1, 2, 3, 4, 5));
        assertEquals('e', Last.kata("abcde"));
    }
}
