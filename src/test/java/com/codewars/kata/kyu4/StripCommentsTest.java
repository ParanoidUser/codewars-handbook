package com.codewars.kata.kyu4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StripCommentsTest
{
    @Test
    void sample()
    {
        assertEquals("apples, pears\ngrapes\nbananas", StripComments.kata("apples, pears # and bananas\ngrapes\nbananas !apples", new String[] { "#", "!" }));
        assertEquals("a\nc\nd", StripComments.kata("a #b\nc\nd $e f g", new String[] { "#", "$" }));
    }
}
