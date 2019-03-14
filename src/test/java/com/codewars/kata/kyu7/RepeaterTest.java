package com.codewars.kata.kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RepeaterTest
{
    @Test
    void testSomething()
    {
        assertEquals("aaaaa", Repeater.kata("a", 5));
        assertEquals("NaNaNaNaNaNaNaNaNaNaNaNaNaNaNaNa", Repeater.kata("Na", 16));
        assertEquals("Wub Wub Wub Wub Wub Wub ", Repeater.kata("Wub ", 6));
    }
}
