package com.codewars.kata.kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShortestWordTest
{
    @Test
    void sample()
    {
        assertEquals(3, ShortestWord.kata("bitcoin take over the world maybe who knows perhaps"));
        assertEquals(3, ShortestWord.kata("turns out random test cases are easier than writing out basic ones"));
    }
}
