package com.codewars.kata.kyu7;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LastTest
{
    @Test
    void testList()
    {
        var list = List.of(1, 2, 3, 4, 5);
        var last = Last.kata(list);
        assertEquals(5, last);
    }

    @Test
    void testString()
    {
        final String string = "abcde";
        final char last = Last.kata(string);
        assertEquals('e', last);
    }

    @Test
    void testArgs()
    {
        final int last = Last.kata(1, 2, 3, 4, 5);
        assertEquals(5, last);
    }

    @Test
    void testArray()
    {
        final Integer[] array = { 1, 2, 3, 4, 5 };
        final int last = Last.kata(array);
        assertEquals(5, last);
    }
}
